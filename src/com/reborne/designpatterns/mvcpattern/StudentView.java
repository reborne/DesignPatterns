package com.reborne.designpatterns.mvcpattern;

/**
 * Created by Reborn on 8/31/2016.
 */
public class StudentView {
    public void displayDetails(String stringName, Long id) {
        System.out.println("===== Student =====");
        System.out.println("Name: "+ stringName);
        System.out.println("Student ID: "+ id);
    }
}
