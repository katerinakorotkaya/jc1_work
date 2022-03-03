package my.cycle;

public class Main {


    static void tryWhile() {
        int i = 1;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }
    }

    static void tryDoWhile() {
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i < 5);
    }

    public static void main(String[] args) {
        tryDoWhile();
    }
}
