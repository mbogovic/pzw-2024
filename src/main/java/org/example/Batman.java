package org.example;

public class Batman implements Hero {

    private String name;

    public Batman(String name) {
        this.name = name;
    }

    @Override
    public String showMySuperpower() {
        return this.name + ": Mind, cool gadgets & deep voice";
    }
}
