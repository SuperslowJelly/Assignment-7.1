package io.github.superslowjelly.assignment71;

import io.github.superslowjelly.assignment71.shapes.*;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Square(15),
                new Square(30),
                new Rectangle(15, 30),
                new Rectangle(30, 60),
                new Triangle(15, 15, 15),
                new Triangle(30, 15, 30),
                new Circle(15),
                new Circle(30)
        };

        StringBuilder output = new StringBuilder();

        for (Shape shape : shapes) {
            if (shape instanceof Square)
                output.append("\n• Square:")
                        .append("\n\tLength: ").append(((Square) shape).getLength());
            else if (shape instanceof Rectangle)
                output.append("\n• Rectangle:")
                        .append("\n\tLength: ").append(((Rectangle) shape).getLength())
                        .append("\n\tHeight: ").append(((Rectangle) shape).getHeight());
            else if (shape instanceof Triangle)
                output.append("\n• Triangle:")
                        .append("\n\tSide 1: ").append(((Triangle) shape).getSide1())
                        .append("\n\tSide 2: ").append(((Triangle) shape).getSide2())
                        .append("\n\tSide 3: ").append(((Triangle) shape).getSide3());
            else if (shape instanceof Circle)
                output.append("\n• Circle:")
                        .append("\n\tRadius: ").append(((Circle) shape).getRadius());
            output.append("\n\tArea: ").append(shape.getArea()).append('\n');
        }

        System.out.print(output);
    }

}
