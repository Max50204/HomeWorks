import java.util.Objects;

public class StringTest {
    public static void main(String[] args) {


        String str1 = "Hello Java!";
        String str2 = "Java";
        String str3 = new String("Java");// neue Verweis erstellt.

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);// vergleicht Verweis
        System.out.println(Objects.equals(str1, str2));// vergleicht Inhalt

        System.out.println(str1 + " = " + str1.length());
        System.out.println(str1 + " => " + str1.toLowerCase());
      //  str1 = str1 + "###";
        System.out.println(str1);
        System.out.println(str1.toUpperCase());
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(str1.length() - 1));
        System.out.println(str1.indexOf(' '));
        System.out.println(str1.repeat(5));
        System.out.println(str1.startsWith("j"));
        System.out.println(str1.endsWith("!"));
        System.out.println(str1.substring(3));
        System.out.println(str1.substring(2,7));
        System.out.println(str1.indexOf('y'));

    }
}