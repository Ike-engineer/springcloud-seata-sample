package com.zxs.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zxs.entity.Order;

/**
 * @Package：com.warape.seatstorage.filter
 * @Table
 * @Description:
 * @Author：ZhangXuSheng
 * @QQ：a15873194117@163.com
 * @Date： 2021/2/5
 * @Version V1.0
 */
public interface OrderService extends IService<Order> {

    /**
     * 创建订单
     * @param order1
     * @return
     */
    void create(Order order1);
}
