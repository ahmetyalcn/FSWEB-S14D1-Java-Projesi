package com.workintech.model;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = checker(width);
        this.length = checker(length);
    }
    public double checker(double value){
        if (value < 0){
            return 0;
        }else {
            return value;
        }
    }
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return length * width;
    }
}
