package cn.withstars.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class WebLogAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(public * cn.withstars.demo.controller..*.*(..))")
    public void webLog(){};

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable{
        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        logger.info("URL:"+request.getRequestURL().toString()+",HTTP_METHOD:"+request.getMethod()+",IP:"+
                request.getRemoteHost() + ",CLASS_METHOD:"+joinPoint.getSignature().getDeclaringTypeName()
                +",ARGS:"+ Arrays.toString(joinPoint.getArgs()));
    }


    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) throws Throwable{
        logger.info("RESPONSE:" + ret);
    }
}
