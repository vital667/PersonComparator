import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    List<Person> people = new ArrayList<>();


    void addPerson(Person person) {
        people.add(person);
    }

    void showList() {
        people.forEach(System.out::println);
    }

    void sortBySurname() {
        System.out.println("_____________Sorting by Surname and Name:____________");
        Collections.sort(people);
        people.forEach(System.out::println);
    }

    void sortByAge() {
        System.out.println("_____________Sorting by Age:____________");
        Collections.sort(people, Person.comparatorAge());
        people.forEach(System.out::println);
    }

    void sortByHeight() {
        System.out.println("_____________Sorting by Height:____________");
        Collections.sort(people, Person.comparatorHeight());
        people.forEach(System.out::println);
    }

    void findMaxAge() {
        Person person=Collections.max(people, Person.comparatorAge());
        System.out.println("Max age is "+person.getAge()+" has "+person.getName()+" "+person.getSurName());
    }

    void findMinAge() {
        Person person=Collections.min(people, Person.comparatorAge());
        System.out.println("Min age is "+person.getAge()+" has "+person.getName()+" "+person.getSurName());
    }

    void findMaxHeight(){
        Person person = Collections.max(people,Person.comparatorHeight());
        System.out.println("Max height is "+person.getHeight()+" has "+person.getName()+" "+person.getSurName());
    }

    void findMinHeight(){
        Person person = Collections.min(people,Person.comparatorHeight());
        System.out.println("Min height is "+person.getHeight()+" has "+person.getName()+" "+person.getSurName());
    }
}
