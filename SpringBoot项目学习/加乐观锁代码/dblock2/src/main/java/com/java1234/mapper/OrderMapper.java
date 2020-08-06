package com.java1234.mapper;

import com.java1234.entity.Order;


/**
 * 订单Mapper接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-12 23:34
 */
public interface OrderMapper {

    /**
     * 更新订单
     * @param order
     * @return
     */
    public Integer update(Order order);

    /**
     * 根据订单ID查询订单
     * @param orderId
     * @return
     */
    public Order getByOrderId(String orderId);
}
