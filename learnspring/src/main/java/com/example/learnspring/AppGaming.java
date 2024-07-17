// package com.example.learnspring;

// import com.example.learnspring.loosecoupled.ContraGame;
// import com.example.learnspring.loosecoupled.GameRunner;
// import com.example.learnspring.loosecoupled.GamingConsole;
// import com.example.learnspring.loosecoupled.MarioGame;

// public class AppGaming {
//     public static void main(String[] args) {

//         //tight coupled
//         // var g=new MarioGame();
//         // var gameRunner =new GameRunner(g);
//         // gameRunner.run();


//         //loose coupled
//       GamingConsole marioGame = new MarioGame();
        
//         // Create an instance of GameRunner with MarioGame
//         GameRunner gameRunnerMario = new GameRunner(marioGame);
//         gameRunnerMario.run();

//         // Create an instance of ContraGame
//         GamingConsole contraGame = new ContraGame();
        
//         // Create an instance of GameRunner with ContraGame
//         GameRunner gameRunnerContra = new GameRunner(contraGame);
//         gameRunnerContra.run();


//     }
// }
