package com.annotation;

public class Mobile {
    @CheckThis(template = "+7....")
    private String phone;

    public Mobile(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
