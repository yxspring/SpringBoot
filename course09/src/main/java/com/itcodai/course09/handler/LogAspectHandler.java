package com.itcodai.course09.handler;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;

/**
 * @ProjectName: course09
 * @Package: com.itcodai.course09.handler
 * @ClassName: LogAspectHandler
 * @Author: yuxingsheng
 * @Description: 定义切面和处理方法
 * @Date: 2020/3/26 15:27
 * @Version: 1.0
 */
// @Aspect 注解用来描述一个切面类 @Component 让该类交给Spring来管理

@Aspect
@Component
public class LogAspectHandler {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());
            /*1.@Pointcut：定义一个切面，即上面所描述的关注的某件事入口。
            2.@Before：在做某件事之前做的事。
            3.@After：在做某件事之后做的事。
            4.@AfterReturning：在做某件事之后，对其返回值做增强处理。
            5.@AfterThrowing：在做某件事抛出异常时，处理。
            */
    /**
     * 1、 @Pointcut 注解
     */
    //定义一个切面，拦截com.itcodai.course09.controller包和子包下的所有方法
    @Pointcut("execution(* com.itcodai.course09.controller..*.*(..))")
    public void pointCut(){
        logger.info("这是拦截了com.itcodai.course09.controller包及其包下所有类加方法：" +
                "以 execution(* com.itcodai.course09.controller..*.*(..))) 表达式为例，" +
                "语法如下：execution() 为表达式主体；第一个 * 号的位置：表示返回值类型，* 表示所有类型包名：表示需要拦截的包名，后面的两个句点表示当前包和当前包的所有子包，com.itcodai.course09.controller 包、子包下所有类的方法第二个 * 号的位置：表示类名，   * 表示所有类      *(..) ：这个星号表示方法名，    * 表示所有的方法，后面括弧里面表示方法的参数，两个句点表示任何参数");
        }
    /*  anotation()方式是针对某个注解来定义切面，比如我们对具有@GetMapping注解的方法做切面  */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void annotationCut(){
        System.out.println("切入注解是@GetMapping方法：还可能有@PostMapping @DeleteMapping");
    }
    /**
    * 2、@Before 注解指定的方法在切面切入目标方法之前执行，可以做一些log处理，也可以做一些信息统计
    * */
    //在上面定义的切面方法之前执行该方法
    @Before("pointCut()")
    public void doBefore(JoinPoint joinPoint){
        logger.info("====doBefore方法进入了===");
        //获取签名
        Signature signature=joinPoint.getSignature();
        //获取切入的包名
        String declaringTypeName =signature.getDeclaringTypeName();
        //获取即将执行的方法名
        String funName=signature.getName();
        logger.info("即将执行方法为{}，属于{}包",funName,declaringTypeName);
        // 也可以用来记录一些信息，比如获取请求的url和ip
        ServletRequestAttributes attributes=(ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request=attributes.getRequest();
        //获取请求的url
        String url=request.getRequestURL().toString();
        //获取请求ip
        String ip=request.getRemoteAddr();
        logger.info("用户请求的url为：{}，ip地址为：{}",url,ip);
    }
    /**
     * 3、 @After注解 制定的方法在切面切入目标方法之后执行，也可以做一些完成某些方法之后的log处理
     * */
    //在上面定义的切面方法之后执行该方法
    @After("pointCut()")
    public void doAfter(JoinPoint joinPoint){
        logger.info("====doAfter方法进入了====");
        Signature signature=joinPoint.getSignature();
        String method=signature.getName();
        logger.info("方法{}已经执行完了！",method);
    }
    /**
    * 4、 @AfterReturnning 方法 该注解和@After有些类似，区别在于@AfterReturning注解可以用来捕获切入方法
     * 执行完之后的返回值，对返回值进行业务逻辑上的增强处理。
    * */
    @AfterReturning(pointcut = "pointCut()",returning = "result")
    public void doAfterReturing(JoinPoint joinPoint,Object result){
        Signature signature=joinPoint.getSignature();
        String classMethod=signature.getName();
        logger.info("方法{}执行完毕，返回参数为：{}",classMethod,result);
        //实际项目中可以根据业务做具体的返回值增强
        logger.info("对返回参数进行业务上的增强：{}",result+"增强版");
    }
    /**
     * 5、 @AfterThrowing 方法
     * 当被切方法执行时抛出异常时，会进入@afterThrowing注解的方法中执行，在该方法
     * 中可以做一些异常的处理逻辑。
     * 要注意的是 throwing 属性的值必须要和参数一致，否则会报错。
     * 该方法中的第二个入参即为抛出的异常
     * */
     // 在上面定义的切面方法执行抛异常时，执行该方法
    @AfterThrowing(pointcut = "pointCut()",throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint,Throwable ex){
        Signature signature=joinPoint.getSignature();
        String method=signature.getName();
        //处理异常的逻辑
        logger.info("执行方法{}出错，异常为:{}",method,ex);
    }





















}
