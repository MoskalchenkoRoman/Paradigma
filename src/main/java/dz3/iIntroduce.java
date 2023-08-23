package dz3;

public interface iIntroduce {
   static void introduce(Person person){
        System.out.print(person.name + " возраст ");
        System.out.print(person.age + " лет");
    }
}
