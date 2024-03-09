//Super class
class Animal{
    void eat(){
        System.out.println("This animal eats food!");
    }

    void sleep(){
        System.out.println("This animal is sleeping!");
    }
}

//Sub class
class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks!");
    }
}
public class Inheritance_program {

    public static void main(String[] args){
        Animal myObj = new Animal();
        Dog myDog = new Dog();
        myObj.sleep();
        myDog.bark();
    }
}
