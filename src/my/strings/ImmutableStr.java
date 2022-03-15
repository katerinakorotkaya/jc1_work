package my.strings;

public class ImmutableStr {
    public static void main(String[] args) {

        String s = "a";
        System.out.println(s);
        String s2 = s.concat("b");
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
    }
}
