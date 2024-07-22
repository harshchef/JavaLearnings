package com.example.learnspring.game;

public class GameRunner {
//     private MarioGame game;
//    public GameRunner(MarioGame marioGame) {
//        this.game=marioGame;
//    }


   private ContraGame game;
   public GameRunner(ContraGame g) {
       this.game=g;
   }


    public void run() {
        System.out.println("Game runner class");
        game.left();
        game.right();
        game.up();
        game.down();
    }

}
