package com.baeldung.spring.servicevalidation.domain;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.ArrayList;

public class UserAccount {

    @NotNull
    @ApellidoTypeSubset(anyOf = { Apellido.SMITH, Apellido.BECERRA })
    private Apellido primerApellido;

    @NotNull
    @Pattern(regexp="SMITH|BECERRA")
    private String apellido;

    @NotBlank(message = "Name must not be blank")
    private String name;

    @Min(value = 18, message = "Age should not be less than 18")
    private int age;

    @NotBlank(message = "Phone must not be blank")
    private String phone;

    @NotNull(message = "Password must be between 4 to 15 characters")
    @Size(min = 4, max = 15)
    private String password;

    @Valid
    @NotNull(message = "UserAddress must not be blank")
    private UserAddress useraddress;

    public UserAddress getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(UserAddress useraddress) {
        this.useraddress = useraddress;
    }

    public UserAccount() {

    }

    public Apellido getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(Apellido primerApellido) {
        this.primerApellido = primerApellido;
    }

    public UserAccount(String email, String password, String name, int age) {
        this.password = password;
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
