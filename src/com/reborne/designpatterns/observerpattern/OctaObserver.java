package com.reborne.designpatterns.observerpattern;

import java.util.*;


public class OctaObserver extends Observer {

    public OctaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("This is octal string: "+ Integer.toOctalString(subject.getState()));
    }
}
