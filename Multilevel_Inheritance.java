class Animals{
    void eat(){
        System.out.println("Animals eats food!");
    }
}
class Mammal extends Animals{
    void giveBirth(){
        System.out.println("Mammal gives birth");
    }
}
class Dogs extends Mammal{
    void bark(){
        System.out.println("The dog barks");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args){
    Dogs myObj = new Dogs();
    myObj.eat();
    myObj.giveBirth();
    }
}
