package com.itcodai.course14.service;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * @ProjectName: course14
 * @Package: com.itcodai.course14.service
 * @ClassName: RedisService
 * @Author: yuxingsheng
 * @Description: 通过该对象读写数据库
 * @Date: 2020/7/24 17:17
 * @Version: 1.0
 */
public class RedisService {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    /**
    * set redis:string类型
    * */
    public void setString(String key,String value){
        ValueOperations<String,String> valueOpetations=stringRedisTemplate.opsForValue();
        valueOpetations.set(key, value);
    }
    /**
     * get redis :string类型
     *
     * */
    public String getString(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }

}
