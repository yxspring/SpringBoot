package com.itcodai.course06.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: course06
 * @Package: com.itcodai.course06.bean
 * @ClassName: MicroServiceUtl
 * @Author: yuxingsheng
 * @Description: 多个微服务组成的组件
 * @Date: 2020/2/24 16:07
 * @Version: 1.0
 */
@Component
@ConfigurationProperties(prefix = "url")
public class MicroServiceUtl {
    private String orderUrl;
    private String userUrl;
    private String shoppingUrl;

    public String getOrderUrl() {
        return orderUrl;
    }

    public void setOrderUrl(String orderUrl) {
        this.orderUrl = orderUrl;
    }

    public String getUserUrl() {
        return userUrl;
    }

    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl;
    }

    public String getShoppingUrl() {
        return shoppingUrl;
    }

    public void setShoppingUrl(String shoppingUrl) {
        this.shoppingUrl = shoppingUrl;
    }
}
