package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Hero batman = context.getBean("batman", Batman.class);
        print(batman);
        Hero superman = context.getBean("superman", Superman.class);
        print(superman);
        Police police = context.getBean("police", Police.class);
        System.out.println((police.callHero()));
    }

    private static void print(Hero hero) {
        System.out.println(hero.showMySuperpower());
    }

}