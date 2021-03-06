package com.java1234.controller;

import com.java1234.entity.UserAccount;
import com.java1234.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账号Controller
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-08-04 17:36
 */
@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private RechargeService rechargeService;

    /**
     * 充值
     * @return
     */
    @RequestMapping(value = "/recharge")
    public boolean recharge(){
        String orderId="20200803213121";
        UserAccount userAccount=new UserAccount();
        userAccount.setUserId(1);
        try {
            return rechargeService.recharge(orderId,userAccount);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
