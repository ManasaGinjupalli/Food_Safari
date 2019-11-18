package com.example.food_safari;

public class User {

    public String fname;
    public String email;
    public String password;
    public String address;
    public String number;


    public User(String fname, String email, String password, String address, String number) {

        this.fname = fname;
        this.email = email;
        this.password = password;
        this.address = address;
        this.number = number;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

