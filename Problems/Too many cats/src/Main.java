class Cat {

    // write static and instance variables
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return Cat.counter;
    }
}
//enum Direction {
//    EAST("E"),
//    WEST("W"),
//    NORTH("N"),
//    SOUTH("S");
//
//    private final String shortCode;
//
//    Direction(String code) {
//        this.shortCode = code;
//    }
//
//    public String getShortCode() {
//        return this.shortCode;
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println(Direction.NORTH.name());
//        System.out.println(Direction.NORTH.toString());
//        System.out.println(Direction.NORTH.getShortCode());
//        //System.out.println(Direction.valueOf("N"));
//        System.out.println(Direction.valueOf("NORTH"));
//    }
//}


