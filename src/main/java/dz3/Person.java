package dz3;

public class Person {
    public String name;
    public int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.print(name + " возраст ");
        System.out.println(age + " лет");
    }

}
