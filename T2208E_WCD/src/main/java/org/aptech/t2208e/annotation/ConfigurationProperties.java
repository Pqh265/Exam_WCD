package org.aptech.t2208e.annotation;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigurationProperties {
    String path() default  "";
}
