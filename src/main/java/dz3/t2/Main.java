package dz3.t2;

import dz3.t2.Person;

import static dz3.t2.iIntroduce.introduce;

public class Main {

    public static void main(String[] args) {
        Person person0 = new Person("Lexa",25);
        Person person1 = new Person("Alexa",18);
        Person person2 = new Person("Leo",58);
        Person person3 = new Person("Leona",35);
        Person person4 = new Person("Legalaiz",27);
        Person person5 = new Person("Mexa",60);

        System.out.println("----ТУРНИРНАЯ ТАБЛИЦА----");
        introduce(person0);
        System.out.print(" - VS - ");
        person1.introduce();
        introduce(person2);
        System.out.print(" - VS - ");
        person3.introduce();
        introduce(person4);
        System.out.print(" - VS - ");
        person5.introduce();
        System.out.println("------------------------");

    }
}
