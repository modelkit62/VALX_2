package com.baeldung.spring.servicevalidation.domain;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;

public class ApellidoTypeSubSetValidator implements ConstraintValidator<ApellidoTypeSubset, Apellido> {

    private Apellido[] subset;

    @Override
    public void initialize(ApellidoTypeSubset constraint) {
        this.subset = constraint.anyOf();
    }

    @Override
    public boolean isValid(Apellido value, ConstraintValidatorContext context) {
        return value == null || Arrays.asList(subset).contains(value);
    }
}