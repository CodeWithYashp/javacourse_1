

public class PolyMorphism_MethodOverloading {
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){
        return a + b + c;
    }
    static double add(double a, double b){
        return a + b;
    }
    static String add(String a, String b){
        return a + b;
    }
    public static void main(String[] args){
        //calling overloaded methods
        int sum1 = add(5,4);
        int sum2 = add(5, 4, 2);
        double sum3 = add(5.5 ,2.5);
        String sum4 = add("Yash","Sharma");
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(sum4);
    }
}
