package com.itcodai.course14.service;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.List;

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
    /**
     * set redis:hash类型
     * */
    public void setHash(String key,String filedKey,String value){
        HashOperations<String,Object,Object> hashOperations= stringRedisTemplate.opsForHash();
        hashOperations.put(key,filedKey,value);
    }
    /**
     * get redis :hash类型
     * */
    public String getHash(String key,String filedKey){
        return (String) stringRedisTemplate.opsForHash().get(key,filedKey);
    }
    /**
     * set redis: List 类型
     * */
    public void setList(String key,String value){
        ListOperations<String,String> listOperations= stringRedisTemplate.opsForList();
        listOperations.leftPush(key,value);
    }
    /**
     * get redis:List 类型
     * */
    public List<String> getList(String key, Integer start, Integer end){
       return  stringRedisTemplate.opsForList().range(key,start,end);
    }
}
