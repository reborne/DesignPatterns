package com.reborne.designpatterns.businessdelegatepattern;

public class JMSService implements BusinessService {

    @Override
    public void processing() {
        System.out.println("Prccessing some logic invoking JS Service");
    }

}
