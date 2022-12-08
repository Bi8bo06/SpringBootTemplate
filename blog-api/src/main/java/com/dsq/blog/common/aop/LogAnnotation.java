package com.dsq.blog.common.aop;

import java.lang.annotation.*;

/**
 * @author daishq
 * @date: 2022/12/7 15:27
 * @description:
 */
//type代表可以放在类的上面，method代表可以放在方法上
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogAnnotation {

    String module() default "";

    String operator() default "";
}
