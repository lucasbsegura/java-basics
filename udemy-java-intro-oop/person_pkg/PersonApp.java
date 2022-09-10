package person_pkg;

public class PersonApp {
    public static void main(String[] args)    {
        Person person1 = new Person(1, "Lucas");
        Person person2 = new Person(2, "Robert");

        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}
