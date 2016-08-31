package com.reborne.designpatterns.mvcpattern;


public class StudentView {
    public void displayDetails(String stringName, Long id) {
        System.out.println("===== Student =====");
        System.out.println("Name: "+ stringName);
        System.out.println("Student ID: "+ id);
    }
}
