package com.reborne.designpatterns.facadepattern;

public class ShapeMaker {

	private Shape circle;
	private Shape square;
	private Shape rectangle;

	public ShapeMaker() {
		this.circle = new Circle();
		this.square = new Square();
		this.rectangle = new Rectangle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

}
