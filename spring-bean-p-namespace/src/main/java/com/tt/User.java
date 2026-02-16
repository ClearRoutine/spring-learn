package com.tt;

/**
 * 用于演示 p-namespace Setter 注入
 */
public class User {

    private String name;
    private int age;
    private String email;
    private User manager;  // 对象引用，用 p:manager-ref

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setManager(User manager) {
        this.manager = manager;
    }

    public User getManager() {
        return manager;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + ", email='" + email
                + "', manager=" + (manager != null ? manager.getName() : "null") + "}";
    }
}
