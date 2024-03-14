package com.hb.orderservice.validation.customvalidation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = ProductTypeValidator.class)
public @interface ValidateProductType {

    public String message() default "Invalid product type (electronics/fashion/education)";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
