package com.tt;

public class Bob {

    private String sammy;

    public String getSammy() {
        return sammy;
    }

    public void setSammy(String sammy) {
        this.sammy = sammy;
    }

    @Override
    public String toString() {
        return "Bob{sammy='" + sammy + "'}";
    }
}
