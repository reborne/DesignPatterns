package com.reborne.designpatterns.nullobjectpattern;

public class Client extends AbstractClient {

    public Client(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return null;
    }
}
