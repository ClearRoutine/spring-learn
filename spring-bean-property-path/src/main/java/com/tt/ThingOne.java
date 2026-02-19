package com.tt;

public class ThingOne {

    private Fred fred;

    public Fred getFred() {
        return fred;
    }

    public void setFred(Fred fred) {
        this.fred = fred;
    }

    @Override
    public String toString() {
        return "ThingOne{fred=" + fred + "}";
    }
}
