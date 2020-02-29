package com.itcodai.course06.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ProjectName: course06
 * @Package: com.itcodai.course06.config
 * @ClassName: SwaggerConfig
 * @Author: yuxingsheng
 * @Description:
 * @Date: 2020/2/29 11:36
 * @Version: 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.itcodai.course06.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * 构建api文档的详细信息
     * @return
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //设置文章标题
                .title("Spring Boot集成Swagger2接口总览")
                //设置接口描述
                .description("于兴胜学习Spring Boot的第六节课")
                //设置联系方法
                .contact("yxs"+"github:https://github.com/yxspring")
                //设置版本
                .version("1.0")
                //构建
                .build();
    }
}
