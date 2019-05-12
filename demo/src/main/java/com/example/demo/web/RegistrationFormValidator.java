package com.example.demo.web;


import org.hibernate.validator.internal.constraintvalidators.bv.EmailValidator;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class RegistrationFormValidator implements Validator {

    private EmailValidator emailValidator;

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(RegistrationForm.class);
    }

    @Override
    public void validate(Object o, Errors errors) {
        RegistrationForm form = (RegistrationForm) o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "register.firstName.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "register.lastName.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "register.email.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "register.password.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirmation", "register.passwordConfirmation.required");

        if(!errors.hasErrors()) {

            if(form.getFirstName().length() < 3) {
                errors.rejectValue("firstName", "register.firstName.min.length");
            }

            if(form.getFirstName().length() > 100) {
                errors.rejectValue("firstName", "register.firstName.max.length");
            }

            if(form.getLastName().length() < 3) {
                errors.rejectValue("lastName", "register.lastName.min.length");
            }

            if(form.getLastName().length() > 100) {
                errors.rejectValue("lastName", "register.lastName.max.length");
            }

            if(form.getEmail().length() > 100) {
                errors.rejectValue("email", "register.email.max.length");
            }

//            if(!emailValidator.isValid(form.getEmail())) {
//                errors.rejectValue("email", "register.email.invalid");
//            } else {
//                // todo check email duplicate
//            }

            if(form.getPassword().length() < 8) {
                errors.rejectValue("password", "register.password.min.length");
            }

            if(!form.getPassword().equals(form.getPasswordConfirmation())) {
                errors.rejectValue("passwordConfirmation", "register.passwordConfirmation.mismatch");
            }

            // todo check password strength
        }
    }
}

