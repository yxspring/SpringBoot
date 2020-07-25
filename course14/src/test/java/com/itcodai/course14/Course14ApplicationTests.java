package com.itcodai.course14;

import com.alibaba.fastjson.JSON;
import com.itcodai.course14.domain.User;
import com.itcodai.course14.service.RedisService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class Course14ApplicationTests {
   private static final Logger logger= LoggerFactory.getLogger(Course14ApplicationTests.class);
   @Resource
   private RedisService redisService;
	@Test
	public void contextLoads() {
	    //测试redis的String类型
	    redisService.setString("weichat","yxspring");
	    logger.info("测试redis的String类型:{}",redisService.getString("weichat"));
	    //测试redis的对象类型
        User user=new User(1,"yxs");
        redisService.setString("user", JSON.toJSONString(user));
        logger.info("测试redis的对象类型：{}",redisService.getString("user"));
        //测试redis的hash类型
        redisService.setHash("user","name",JSON.toJSONString(user));
        logger.info("测试Hash的对象类型：{}",redisService.getHash("user","name"));
        //测试redis的list类型
        redisService.setList("list","football");
        redisService.setList("list","basketball");
        List<String> list=redisService.getList("list",0,-1);
        for(String value:list){
            logger.info("list中有{}",value);
        }

	}

}
