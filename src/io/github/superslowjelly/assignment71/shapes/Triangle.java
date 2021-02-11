package io.github.superslowjelly.assignment71.shapes;

public class Triangle extends Shape {

    public Triangle(double side1, double side2, double side3) {
        this.SIDE1 = side1;
        this.SIDE2 = side2;
        this.SIDE3 = side3;
    }

    private final double SIDE1;

    public double getSide1() {
        return SIDE1;
    }

    private final double SIDE2;

    public double getSide2() {
        return SIDE2;
    }

    private final double SIDE3;

    public double getSide3() {
        return SIDE3;
    }

    @Override
    public double getArea() {
        double perimeter = (SIDE1 + SIDE2 + SIDE3) / 2;
        return Math.sqrt(perimeter * (perimeter - SIDE1) * (perimeter - SIDE2) * (perimeter - SIDE3));
    }

    @Override
    public String toString() {
        return "Type: Triangle | Side 1: " + SIDE1 + " | Side 2: " + SIDE2 +  " | Side 3: " + SIDE3 + " | Area: " + getArea();
    }

}
