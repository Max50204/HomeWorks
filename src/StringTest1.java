import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        String s = "I like Java!!!";
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I like"));
        System.out.println(s.contains("Java"));
        System.out.println(s.substring(7,12));
        System.out.println(s.replace('a','o'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.indexOf("like"));

Scanner scanner = new Scanner(System.in);
        System.out.println("Wort eingeben");

        String s1 = scanner.next();




    }
}
