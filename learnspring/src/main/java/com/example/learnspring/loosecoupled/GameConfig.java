package com.example.learnspring.loosecoupled;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GameConfig {

    @Bean
    @Primary 
    public MarioGame marioGame() {
        return new MarioGame();
    }

    @Bean
    @Qualifier("contraGame")
    public GamingConsole contraGame() {
        return new ContraGame();
    }
}
