package com.jasper.handlerinterceptor.interceptor;

import com.jasper.handlerinterceptor.annotation.AccessLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author jasper
 * @date 2022-04-02 17:30
 */
@Component
public class AccessLimitInterceptor implements HandlerInterceptor {

//    @Autowired
//    private RedisService redisService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //判断请求是否属于方法的请求
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;

            //获取方法中的注解,看是否有该注解
            AccessLimit accessLimit = handlerMethod.getMethodAnnotation(AccessLimit.class);
            if (accessLimit == null) {
                return true;
            }
            int seconds = accessLimit.seconds();
            int maxCount = accessLimit.maxCount();
            boolean login = accessLimit.needLogin();
            String key = request.getRequestURI();
            //如果需要登录
            if (login) {
                //获取登录的session进行判断
                //.....
                key += "" + "1";
            }

//            从redis中获取用户访问的次数
//            Integer count = redisService.get(accessKey, key, Integer.class);
//            if (count == null) {
//                //第一次访问
//                redisService.set(accessKey, key, 1);
//            } else if (count < maxCount) {
//                //加1
//                redisService.incr(accessKey, key);
//            } else {
//                return false;
//            }
        }
        return true;
    }
}
