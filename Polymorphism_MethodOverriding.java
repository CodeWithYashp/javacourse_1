class Lion{
    void makeSound(){
        System.out.println("Lion Roars");
    }
}
class Tiger extends Lion{
    @Override
    void makeSound(){
        System.out.println("Tiger Bwraaah");
    }
}

public class Polymorphism_MethodOverriding {
    public static void main(String[] args){
        Lion myObj = new Lion();
        Tiger myObj2 = new Tiger();

        myObj.makeSound();
        myObj2.makeSound();
    }
}
