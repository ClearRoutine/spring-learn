package com.tt;

/**
 * 用于演示 "" 与 null 的区别
 */
public class ExampleBean {

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public int getEmailLength() {
        return email.length();
    }
}
