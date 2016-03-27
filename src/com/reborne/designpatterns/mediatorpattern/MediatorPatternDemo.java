package com.reborne.designpatterns.mediatorpattern;


/*
 *Mediator pattern is used to reduce communication complexity between multiple
 *objects or classes. This pattern provides a mediator class which normally handles
 *all the communications between different classes and supports easy maintenance
 *of the code by loose coupling. Mediator pattern falls under behavioral pattern
 *category. 
 */
public class MediatorPatternDemo {
	
	public static void main(String[] args) {
		User sender = new User("Robert");
		User receiver = new User("John");
		
		sender.sendMessage("Hello, John!");
		receiver.sendMessage("Hello Robert!");
	}

}
