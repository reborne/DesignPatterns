package com.reborne.designpatterns.templatepattern;

public class Football extends Game {

    @Override
    void init() {
        System.out.println(" Initalizing Football game...");
    }

    @Override
    void start() {
        System.out.println(" Football Game Initialized!");
        System.out.println(" Start playing.");
    }

    @Override
    void end() {
        System.out.println(" Football Game Started.");
        System.out.println(" Enjoy the game!");
    }
}
