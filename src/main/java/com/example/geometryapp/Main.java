package com.example.geometryapp;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;
import com.example.geometry.Triangle;
import com.example.geometryutils.GeometryUtils;
import com.example.threedimensionalshapes.Cube;
import com.example.threedimensionalshapes.Sphere;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Геометрические фигуры ===\n");

        System.out.println("--- 2D Фигуры ---");
        Circle circle = new Circle(5);
        System.out.println("Круг: площадь = " + circle.getArea());

        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("Прямоугольник: площадь = " + rectangle.getArea());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Треугольник: площадь = " + triangle.getArea());

        System.out.println("\n--- Утилиты ---");
        System.out.println("150 см = " + GeometryUtils.cmToMeters(150) + " метров");

        System.out.println("\n--- 3D Фигуры ---");
        Cube cube = new Cube(3);
        System.out.println("Куб: объём = " + cube.getVolume());

        Sphere sphere = new Sphere(2);
        System.out.println("Сфера: объём = " + sphere.getVolume());
    }
}