class Shape{
    void draw(){
        System.out.println("Drawing a Shape");
    }
}
class Circle extends Shape{
    void drawCircle(){
        System.out.println("Drawing a Circle");
    }
}
class Square extends Shape{
    void drawSquare(){
        System.out.println("Drawing a Square");
    }
}

public class Hierarichal_Inheritance {
    public static void main(String[] args){
        Square myObj = new Square();
        myObj.drawSquare();
        myObj.draw();
    }
}
