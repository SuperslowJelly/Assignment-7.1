package io.github.superslowjelly.assignment71.shapes;

public class Circle extends Shape {

    public Circle(double radius) {
        this.RADIUS = radius;
    }

    private final double RADIUS;

    public double getRadius() {
        return RADIUS;
    }

    @Override
    public double getArea() {
        return Math.PI * (RADIUS * RADIUS);
    }

    @Override
    public String toString() {
        return "Type: Circle | Radius: " + RADIUS + " | Area: " + getArea();
    }

}
