package io.github.superslowjelly.assignment71.shapes;

public class Rectangle extends Shape {

    public Rectangle(double length, double height) {
        this.LENGTH = length;
        this.HEIGHT = height;
    }

    private final double HEIGHT;

    public double getHeight() {
        return HEIGHT;
    }

    private final double LENGTH;

    public double getLength() {
        return LENGTH;
    }

    @Override
    public double getArea() {
        return LENGTH * HEIGHT;
    }

    @Override
    public String toString() {
        return "Type: Rectangle | Length: " + LENGTH + " | Height: " + HEIGHT + " | Area: " + getArea();
    }

}
