package com.reborne.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observerList) {
            observer.update();
        }
    }
}
