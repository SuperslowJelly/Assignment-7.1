package io.github.superslowjelly.assignment71.shapes;

public class Square extends Shape {

    public Square(double length) {
        this.LENGTH = length;
    }

    private final double LENGTH;

    public double getLength() {
        return LENGTH;
    }

    @Override
    public double getArea() {
        return LENGTH * LENGTH;
    }

    @Override
    public String toString() {
        return "Type: Square | Length: " + LENGTH + " | Area: " + getArea();
    }

}
