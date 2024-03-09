public class Rectangle {

    public int calculateArea(int length, int breadth){
        return length * breadth;
    }
    public static void main(String[] args){
        Rectangle myObj = new Rectangle();
        int area = myObj.calculateArea(3,4);
        System.out.println("Area is: " + area);
    }
}
