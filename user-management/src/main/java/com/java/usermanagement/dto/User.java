package com.java.usermanagement.dto;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class User {
    @Min(1000)
    @Max(1000000)
    private int id;

    @Length(min = 4, max = 20, message = "name length should be between 4 and 10")
    private String name;

    @NotNull
    @AddressValidation
    private String address;

    @Email
    private String email;

    /**
     * Password must be between 4 and 8 digits long and include at least one numeric digit.
     */
    @Pattern(regexp = "^(?=.*\\d).{4,8}$")
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}