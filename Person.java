public class Person {
    String name;
    int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    void show(){
        System.out.println("Name : "+ name +" , Age : "+ age);
    }
    public static void main(String[] args){
        Person myObj = new Person("Yash",22);
        myObj.show();
    }
}
