package org.github.finance.mall.share;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ligaofeng 2017年1月12日 下午5:23:46
 */
@Target({ ElementType.FIELD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface NotNull {

    /**
     * @return
     */
    boolean notNull() default true;

    /**
     * @return
     */
    String errorMessage() default "the field can not be null";
}
