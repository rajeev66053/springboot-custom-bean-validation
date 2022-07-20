package com.java.usermanagement.dto;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

public class AddressValidator implements ConstraintValidator<AddressValidation, String> {
    List<String> addresses = Arrays.asList("Iowa","California");
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return addresses.contains(value);
    }
}