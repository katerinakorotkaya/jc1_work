package my.array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] testarray = {1, 4, 7, 3, 4, 5, 9, 3, 4};
        System.out.println(Arrays.toString(testarray));
        Arrays.sort(testarray);
        System.out.println(Arrays.toString(testarray));

        String[] testStrArray = {"b", "c", "d", "a", "aa", "ye", "bb"};
        Arrays.sort(testStrArray);
        System.out.println(Arrays.toString(testStrArray));
    }
}
