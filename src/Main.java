public class Main {
    public static void main(String[] args) {

        App app = new App();
        app.addPerson(new Person("Jan", "Kowalski", 30, 180));
        app.addPerson(new Person("Adam", "Kowalski", 30, 180));
        app.addPerson(new Person("Tom", "Waits", 45, 160));
        app.addPerson(new Person("Vit", "667", 18, 190));
        app.addPerson(new Person("John", "Walter", 35, 170));

        System.out.println("My List of Persons:");
        app.showList();

        app.sortBySurname();
        app.sortByAge();
        app.sortByHeight();

        app.findMaxAge();
        app.findMinAge();
        app.findMaxHeight();
        app.findMinHeight();
    }
}
