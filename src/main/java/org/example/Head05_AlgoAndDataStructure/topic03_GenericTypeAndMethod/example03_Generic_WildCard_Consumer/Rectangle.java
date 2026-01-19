package org.example.Head05_AlgoAndDataStructure.topic03_GenericTypeAndMethod.example03_Generic_WildCard_Consumer;

public class Rectangle implements Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    // Shape 인터페이스 구현
    public double getArea() {
        return width * height; // 직사각형 넓이 = 가로 * 세로
    }
}

