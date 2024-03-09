//Abstract class
abstract class Shapes{
//    abstract method no implementation
    public abstract void draw();
//    concrete methods
    public void displayArea(){
        System.out.println("Area : " + calculateArea());
    }
//    abstract method
    protected abstract double calculateArea();
}

class Circles extends Shapes{
    private double radius;
    public Circles(double radius){
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("Drawing a circle");
    }

    @Override
    protected double calculateArea(){
        return java.lang.Math.PI * radius * radius;
    }
}
public class Abstraction_Program {
    public static void main(String[] args){
        Circles circle = new Circles(12);
        Shapes shape = circle;
        shape.draw();
        shape.displayArea();
    }
}
