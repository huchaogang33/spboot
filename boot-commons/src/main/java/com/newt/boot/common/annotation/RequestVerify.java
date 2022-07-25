package com.newt.boot.common.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface RequestVerify {

    boolean signed() default true;

    boolean encrypted() default false;
}
