/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myProject.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 *
 * @author 79144
 */
public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String>    //<type of annotation,type of field we check>
{

    private String endOfEmail;  //contains end of mail

    @Override
    public void initialize(CheckEmail сheckEmail) {
        endOfEmail = сheckEmail.value();     //get the value
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) { //business logic
        return enteredValue.endsWith(endOfEmail);   // If the value ends in endOfEmail then return true otherwise false

    }

}
