package com.java1234.mapper;


import org.apache.ibatis.annotations.Param;

/**
 * 用户账号Mapper接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company Java知识分享网
 * @create 2020-07-12 23:34
 */
public interface UserAccountMapper {

    /**
     * 入账
     * @param amount 金额
     * @param userId 用户
     * @return
     */
    public Integer addAmount(@Param("amount")Integer amount, @Param("userId")Integer userId);

}
