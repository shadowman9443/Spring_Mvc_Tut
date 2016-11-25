/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

/**
 *
 * @author shadowman
 */
@Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PhoneValidatorCheck.class)
public @interface Phone {
    
    /**
     *
     * @return
     */
    public String message() default "Not a valid phone number";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

    public int min() default 0;

    public int max() default 2147483647;
    
}
