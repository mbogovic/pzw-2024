package org.example;

public class Superman implements Hero {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String showMySuperpower() {
        return this.name + ": Flying, strength & red boots";
    }
}
