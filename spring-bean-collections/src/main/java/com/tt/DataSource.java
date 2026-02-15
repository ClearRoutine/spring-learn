package com.tt;

/**
 * 用于 ref 引用的简单 bean
 */
public class DataSource {

    private final String name;

    public DataSource(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DataSource[" + name + "]";
    }
}
