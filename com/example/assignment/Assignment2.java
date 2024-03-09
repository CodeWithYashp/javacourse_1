package com.example.assignment;
interface Shape{
    double area();
    double perimeter();
}

class Circle implements Shape{
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.round(Math.PI * this.radius * this.radius);
    }
    @Override
    public double perimeter(){
        return Math.round(2 * Math.PI * this.radius);
    }
}

class Rectangle implements Shape{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area(){
        return this.length * this.breadth;
    }
    @Override
    public double perimeter(){
        return 2 * ( this.length + this.breadth);
    }
}

class createShapes{
    public static Shape createRectangle(int length, int breadth){
        return new Rectangle(length, breadth);
    }

    public static Shape createCircle(int radius){
        return new Circle(radius);
    }
}
public class Assignment2 {
    public static void main(String[] args){
        Shape myCircle = createShapes.createCircle(25);
        System.out.println("Area of circle is: " + myCircle.area() + " and the perimeter is: " + myCircle.perimeter());

        Shape myRect = createShapes.createRectangle(10,15);
        System.out.println("Area of the rectangle is: " + myRect.area() + " and the perimeter is: "+ myRect.perimeter());
    }
}
