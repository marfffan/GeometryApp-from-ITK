package com.example.geometryapp;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Геометрические фигуры ===");

        Circle circle = new Circle(5);
        System.out.println("Круг:");
        System.out.println("  Площадь: " + circle.getArea());
        System.out.println("  Периметр: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("Прямоугольник:");
        System.out.println("  Площадь: " + rectangle.getArea());
        System.out.println("  Периметр: " + rectangle.getPerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Треугольник:");
        System.out.println("  Площадь: " + triangle.getArea());
        System.out.println("  Периметр: " + triangle.getPerimeter());
    }
}