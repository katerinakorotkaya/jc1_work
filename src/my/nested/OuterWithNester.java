package my.nested;

public class OuterWithNester {


    public OuterWithNester() {
        System.out.println("Hello from OuterWithNested");
    }

    public Nested createNested() {
        return new Nested();
    }

    // This is INNER (nested) class
    private class Nested {
        public Nested() {
            System.out.println("Hello from Nested");
        }
    }

    public static void main(String[] args) {
        Nested nested = new OuterWithNester().createNested();
        Nested2 nested2 = new Nested2();
    }
}

//This is not INNER (nested) class
//This is non-public class
class Nested2 {
}
