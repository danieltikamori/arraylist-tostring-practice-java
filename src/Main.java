import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Jane", 30);
        Person person3 = new Person("Joe", 35);

        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);

        System.out.println("List size of people is: " + personArrayList.size());
        System.out.println("First person is: " + personArrayList.get(0));
        System.out.println("Person list:");
        for (Person person : personArrayList) {
            System.out.println(person);
        }

    }
}
