package org.brijframework.support.bean.mapper;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.brijframework.util.support.Constants;

@Target({ ElementType.TYPE, ElementType.FIELD, ElementType.METHOD , ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repeatable(value = BeanMappers.class)
public @interface BeanMapper {

	String id() default Constants.DEFAULT;

	String source();

	String destination() default Constants.DEFAULT;
}
