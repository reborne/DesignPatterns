package com.reborne.designpatterns.businessdelegatepattern;

public class EJBService implements BusinessService {

    @Override
    public void processing() {
        System.out.println("Doing some logic invoking EJB Service");
    }

}
