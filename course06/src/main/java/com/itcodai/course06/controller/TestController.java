package com.itcodai.course06.controller;

import com.itcodai.course06.bean.User;
import com.itcodai.course06.config.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @ProjectName: course06
 * @Package: com.itcodai.course06.controller
 * @ClassName: TestController
 * @Author: yuxingsheng
 * @Description: 接口展示
 *      @Api 注解用于类上，表示标识这个类是 swagger 的资源。
 *      @ApiOperation 注解用于方法，表示一个 http 请求的操作。
 *      @ApiParam 注解用于参数上，用来标明参数信息。
 * @Date: 2020/2/29 14:13
 * @Version: 1.0
 */
@RestController
@RequestMapping(value = "/swagger")
@Api(value = "Swagger2在线接口展示文档")
public class TestController {
    @GetMapping("/get/{id}")
    @ApiOperation(value = "根据用户唯一标识获取用户信息")
    public JsonResult<User> getUserInfo(@PathVariable(value = "id") Long id){
        //模拟从数据库中根据用户id 获取用户信息
        User user=new User(1,"yxs","Richard1314!");
        return new JsonResult<User>(user);
    }
    @PostMapping(value = "/insert/{user}")
    @ApiOperation(value = "插入用户信息")
    public JsonResult<User> insertUser(@RequestBody @ApiParam(value = "用户信息") User user){
        return new JsonResult<User>(user);
    }
}
