public class Lesson3 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Car myCar;
        myCar = new Car();
        System.out.println(myCar.price);
    }
}

class Car {
    int price;
String model;
    public int getPrice() {
        return price;
    }
}




