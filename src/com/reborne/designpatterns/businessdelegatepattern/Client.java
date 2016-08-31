package com.reborne.designpatterns.businessdelegatepattern;

public class Client {

    BusinessDelegate businessService;

    public Client(BusinessDelegate  businessService) {
        this.businessService = businessService;
    }

    public void doProcessing() {
        businessService.doProcess();
    }
}
