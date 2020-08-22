import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private String surName;
    private int age;
    private int height;

    public Person(String name, String surName, int age, int height) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }


    @Override
    public int compareTo(Person o) {
        if (surName.compareTo(o.surName)==0)
            return name.compareTo(o.name);
        return surName.compareTo(o.surName);
    }

    static Comparator<Person> comparatorAge(){
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age==o2.age) return 0;
                return o1.age>o2.age?1:-1;
            }
        };
    }

    static Comparator<Person> comparatorHeight(){
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.height==o2.height) return 0;
                return o1.height>o2.height?1:-1;
            }
        };
    }



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
