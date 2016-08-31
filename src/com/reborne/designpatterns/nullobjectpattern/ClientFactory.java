package com.reborne.designpatterns.nullobjectpattern;

public class ClientFactory {

    public static final String[] names = {"Edward", "Steffany", "Julie"};

    public static AbstractClient getCustomer(String name){

        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new Client(name);
            }
        }
        return new NullClient();
    }
}
