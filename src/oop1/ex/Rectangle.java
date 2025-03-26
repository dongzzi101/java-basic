package oop1.ex;

public class Rectangle {

    int width;
    int height;


    int calculatePerimeter() {
        return (width + height) * 2;
    }

    boolean isSquare() {
        return width == height;
    }

    int calculateArea() {
        return width * height;
    }

}
