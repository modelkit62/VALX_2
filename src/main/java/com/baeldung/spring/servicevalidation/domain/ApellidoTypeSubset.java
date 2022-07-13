package com.baeldung.spring.servicevalidation.domain;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = ApellidoTypeSubSetValidator.class)
public @interface ApellidoTypeSubset {

    Apellido[] anyOf();


    String message() default "must be any of {anyOf}";


    Class<?>[] groups() default {};


    Class<? extends Payload>[] payload() default {};

}