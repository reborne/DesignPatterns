package com.reborne.designpatterns.observerpattern;

/*
 * Observer pattern uses three actor classes.Subject, Observer and Client.
 * Subject is an object having methods to attach and detach observers to a client object.
 */

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new OctaObserver(subject);
        System.out.println("First state is set to 20");
        subject.setState(20);
        System.out.println("Second state is set to 55");
        subject.setState(55);
    }
}
