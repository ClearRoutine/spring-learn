package com.tt;

public class Fred {

    private Bob bob;

    public Bob getBob() {
        return bob;
    }

    public void setBob(Bob bob) {
        this.bob = bob;
    }

    @Override
    public String toString() {
        return "Fred{bob=" + bob + "}";
    }
}
