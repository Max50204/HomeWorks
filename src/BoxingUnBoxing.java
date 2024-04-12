public class BoxingUnBoxing {
    public static void main(String[] args) {
        // неявное преобразование
        int i = 127; // byte
        int i2 = 32000; // short
        double d1 = i;

        //  явное преобразование

        int i3 = 129; // -128...127
        byte b = (byte)i3;
        System.out.println(b);


    }
}
