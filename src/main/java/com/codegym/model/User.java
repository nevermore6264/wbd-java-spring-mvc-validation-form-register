package com.codegym.model;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Valid
public class User {
    @NotEmpty(message = "Không được để trống")
    @Size(min = 5, max = 45, message = "Tên từ 2 đến 30 ký tự")
    private String firstName;

    @NotEmpty(message = "Không được để trống")
    @Size(min = 5, max = 45, message = "Tên từ 2 đến 30 ký tự")
    private String lastName;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^[0]{1}[0-9-+]{9,10}+$",message = "SDT bắt đầu với số 0, từ 10-11 số ")
    private String phoneNumber;

    @NotNull(message = "Không được để trống")
    @Min(value = 18, message = "Tuổi nhỏ nhất 18")
    private int age;

    @NotEmpty(message = "Không được để trống")
    @Pattern(regexp = "^([\\w-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([\\w-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$")
    private String email;

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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}