//class Counter {
//
//    int current;
//
//    public int getCurrent() {
//        return current;
//    }
//    public void inc() {
//        current++;
//    }
//
//
//}
public class Main {

    public static void main(String args[]) {

        Person person = new Person("R. Johnson");

        System.out.println(Person.getNextId()); // (1)
    }
}

class Person {

    private static long nextId = 1;

    long id;
    String name;

    public Person(String name) {
        this.name = name; // (2)
        this.id = nextId;
        nextId++; // (3)
    }

    public static long getNextId() { // (4)
        return nextId;
    }
}