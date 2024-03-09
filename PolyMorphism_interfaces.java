interface Sports{
    void play();
}
class Cricket implements Sports{
    @Override
    public void play(){
        System.out.println("Playing Cricket");
    }
}
class Football implements Sports{
    @Override
    public void play(){
        System.out.println("Playing Football");
    }
}
public class PolyMorphism_interfaces {
    public static void main(String[] args){
        Cricket obj = new Cricket();
        obj.play();

        Football obj2 = new Football();
        obj2.play();
    }
}
