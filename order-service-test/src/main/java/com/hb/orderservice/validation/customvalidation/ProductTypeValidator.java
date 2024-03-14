package com.hb.orderservice.validation.customvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class ProductTypeValidator implements ConstraintValidator<ValidateProductType, String> {
    @Override
    public boolean isValid(String productType, ConstraintValidatorContext constraintValidatorContext) {
        List<String> productTypes = Arrays.asList("electronics","fashion","education");
        return !productTypes.contains(productType);
    }
}
