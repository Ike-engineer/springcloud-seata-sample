package com.zxs.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zxs.entity.Storage;
import com.zxs.mapper.StorageMapper;
import com.zxs.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Package：com.warape.seatstorage.filter
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */
@Service("storageServiceImpl")
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Autowired
    private StorageMapper storageMapper;

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->扣减库存开始");
        storageMapper.decrease(productId,count);
        LOGGER.info("------->扣减库存结束");
    }
}
