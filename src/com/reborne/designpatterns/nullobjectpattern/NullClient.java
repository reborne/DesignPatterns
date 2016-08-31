package com.reborne.designpatterns.nullobjectpattern;

public class NullClient extends AbstractClient {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Can't be found in Customer Database";
    }
}
