interface Flyer{
    void fly();
}
class Bird{
    void chirp() {
        System.out.println("The Bird Chirps");
    }
}

class Sparrow extends Bird implements Flyer{
    @Override
    public void fly(){
        System.out.println("Sparrow is flying!");
    }
}
public class Hybrid_Inheritance {
    public static void main(String[] args){
        Sparrow myObj = new Sparrow();
        myObj.fly();
        myObj.chirp();
    }
}
