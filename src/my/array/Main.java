package my.array;

public class Main {
    static double average(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0.0;  //проверка входящих аргументов
        int sum = 0;
        for (int index = 0; index < numbers.length; index++) {
            if (Long.MAX_VALUE - sum < numbers.length) {
                sum += numbers[index];
            } else {
                System.out.println("Error out of bound");
            }

        }
        System.out.println("sum = " + sum);
        double result = (double) sum / numbers.length;
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2};
        System.out.println(average(test1));

        int[] test2 = new int[3];
        System.out.println(average(test2));

    }
}
