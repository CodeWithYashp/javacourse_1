//Interface 1
interface Walkable{
    void walk();
}
interface Swimmable{
    void swim();
}
//class implementation using both interfaces
class Amphibian implements Walkable,Swimmable{
    @Override
    public void walk(){
        System.out.println("Amphibian is walking");
    }

    @Override
    public void swim() {
        System.out.println("Amphibian is swimming");
    }
}
public class Multiple_Inheritance {
    public static void main(String[] args){
        Amphibian obj = new Amphibian();
        obj.swim();
        obj.walk();
    }
}
