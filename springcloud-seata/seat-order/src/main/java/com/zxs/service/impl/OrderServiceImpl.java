package com.zxs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxs.entity.Order;
import com.zxs.feign.AccountApi;
import com.zxs.feign.StorageApi;
import com.zxs.mapper.OrderMapper;
import com.zxs.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author IT云清
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private StorageApi storageApi;
    @Autowired
    private AccountApi accountApi;


    /**
     * 开启分布式全局事务
     * @param order1
     */
    @Override
    @GlobalTransactional(name = "tx_group", rollbackFor = Exception.class)
    public void create(Order order1) {
        LOGGER.info("------->交易开始");
        //本地方法
        orderMapper.insert(order1);

        //远程方法 扣减库存
        storageApi.decrease(order1.getProductId(), order1.getCount());

        //远程方法 扣减账户余额

        LOGGER.info("------->扣减账户开始order中");
        accountApi.decrease(order1.getUserId(), order1.getMoney());
        LOGGER.info("------->扣减账户结束order中");

        LOGGER.info("------->交易结束");
    }
}
