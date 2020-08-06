package com.java1234.service;

import com.java1234.entity.UserAccount;

/**
 * 充值Service接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-04 16:44
 */
public interface RechargeService {

    /**
     * 充值
     * @param orderId
     * @param userAccount
     * @return
     */
    public boolean recharge(String orderId, UserAccount userAccount)throws Exception;
}
