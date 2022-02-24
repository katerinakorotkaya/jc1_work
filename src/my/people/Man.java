package my.people;

public class Man {
    int age = 18;

    public Man() {
        age = 18;
    }

    public Man(int age) {
        this.age = age;
    }

    String firstName = "Vasia";
    char nameLetter = 'V';
    int binAge = 0b010101;
    int octAge = 025;
    int hexAge = 0xAB;
    long cell = 1_000_000L;
    float weight = 1.11F;
    double height = 0.34D;
    boolean isSingle = false; //true
    short s1 = 123;
    byte b1 = 123;

    public int getAge() {
        return age;
    }
}
