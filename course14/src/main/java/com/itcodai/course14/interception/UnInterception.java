package com.itcodai.course14.interception;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ProjectName: course14
 * @Package: com.itcodai.course14.interception
 * @ClassName: UnInterception
 * @Author: yuxingsheng
 * @Description:
 * @Date: 2020/5/14 19:38
 * @Version: 1.0
 */
/*自定义一个注解 不需要拦截的时候就在方法上添加这个注解即可*/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UnInterception {

}
