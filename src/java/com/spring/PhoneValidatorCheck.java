/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring;

import java.lang.annotation.Annotation;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author shadowman
 */
public class PhoneValidatorCheck implements ConstraintValidator<Phone,String>{

    @Override
    public void initialize(Phone a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isValid(String phoneNumb, ConstraintValidatorContext cvc) {
        if(phoneNumb==null){
            return false;
        }
        if(phoneNumb.matches("\\d{10}")){
            return true;
        }
        else{
            return false;
        }
    }


}