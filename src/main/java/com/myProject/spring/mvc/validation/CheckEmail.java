package com.myProject.spring.mvc.validation;

//create annotation validator for field email
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    public String value() default "@mail.ru";

    public String message() default "email must ends with @mail.ru";

    public Class<?>[] groups() default {};   //allows you to split annotations into groups. This is a required field. empty array by default

    public Class<? extends Payload>[] payload() default {};  //transfer of information according to customer metadata. empty array by default

}
