package com.example.learnspring.loosecoupled;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

public class GameRunner {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        // Using the primary bean (MarioGame)
        GamingConsole primaryGame = context.getBean(GamingConsole.class);
        System.out.println("Primary Game:");
        primaryGame.up();
        primaryGame.down();
        primaryGame.left();
        primaryGame.right();

        // Using the qualified bean (ContraGame)
        GamingConsole contraGame = context.getBean("contraGame", GamingConsole.class);
        System.out.println("Qualified Game (ContraGame):");
        contraGame.up();
        contraGame.down();
        contraGame.left();
        contraGame.right();
    }
}
