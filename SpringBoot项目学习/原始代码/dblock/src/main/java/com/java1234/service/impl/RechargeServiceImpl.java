package com.java1234.service.impl;

import com.java1234.entity.Order;
import com.java1234.entity.UserAccount;
import com.java1234.mapper.OrderMapper;
import com.java1234.mapper.UserAccountMapper;
import com.java1234.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * 充值Service接口实现类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-04 16:54
 */
@Service("rechargeService")
public class RechargeServiceImpl implements RechargeService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    @Transactional
    public boolean recharge(String orderId, UserAccount userAccount) throws Exception{
            System.out.println("查询订单");
            Order order = orderMapper.getByOrderId(orderId); // 根据订单id获取订单
            if(order.getStatus()==0){ // 假如是未支付状态
                System.out.println("未支付状态");
                order.setStatus(1); // 设置支付成功状态
                System.out.println("更新支付状态...");
                orderMapper.update(order); // 更新支付状态
                System.out.println("账户充值...");
                userAccountMapper.addAmount(order.getAmount(),userAccount.getUserId()); // 账户充值
                System.out.println("充值完毕...");
                return true;
            }else{  // 已经支付成功，订单已处理
                System.out.println("发现订单已处理");
                return true;
            }

    }
}
