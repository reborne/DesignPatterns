package com.reborne.designpatterns.businessdelegatepattern;

public class BusinessDelegate {
    private BusinessLookup lookup = new BusinessLookup();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doProcess() {
        businessService = lookup.getBusinessService(serviceType);
        businessService.processing();
    }
}
