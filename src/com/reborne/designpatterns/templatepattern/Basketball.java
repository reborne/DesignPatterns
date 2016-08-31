package com.reborne.designpatterns.templatepattern;

public class Basketball extends Game {
    @Override
    void init() {
        System.out.println(" Initalizing Basketball game...");
    }

    @Override
    void start() {
        System.out.println(" Basketball Game Initialized!");
        System.out.println(" Start playing.");
    }

    @Override
    void end() {
        System.out.println(" Basketball Game Started.");
        System.out.println(" Enjoy the game!");
    }
}
