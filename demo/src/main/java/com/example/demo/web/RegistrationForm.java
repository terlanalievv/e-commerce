package com.example.demo.web;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class RegistrationForm implements Serializable {

    private static final long serialVersionUID = 3589443095313627818L;

    @NotEmpty(message = "{register.name.required}")
    @Size(min = 5, max = 70, message = "{register.name.size}")
    private String firstName;

    @NotEmpty(message = "{register.surname.required}")
    @Size(min = 4, max = 100, message = "{register.surname.size}")
    private String lastName;

    @NotEmpty
    @Size(max = 100)
    @Email
    private String email;

    @NotEmpty
    @Size(min = 8, max = 16)
    private String password;

    @NotEmpty
    @Size(min = 8, max = 16)
    private String passConfirmation;

    public RegistrationForm() {
        this.firstName = "";
        this.lastName = "";
        this.email = "";
        this.password = "";
        this.passConfirmation = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirmation() {
        return passConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passConfirmation = passwordConfirmation;
    }

    @Override
    public String toString() {
        return "RegistrationForm{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", passwordConfirmation='" + passConfirmation + '\'' +
                '}';
    }
}