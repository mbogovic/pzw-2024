package org.example;

public class Police {
    private Hero hero;

    public Police(Hero hero) {
        this.hero = hero;
    }

    public String callHero() {
        return "Calling hero with superpowers -> " + hero.showMySuperpower();
    }
}
