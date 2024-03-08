public class TestConversions {
    public static void main(String[] args) {
        /** Widening **********/
        double d = 2.12345D;
        float f = -150.50F;
        long l = 15000L;
        int i = 55;
        char c = 20;
        short s = 1000;
        byte b = 126;

        // Following compile OK
        System.out.println();
        System.out.println("Implicit Widening conversions:");
        System.out.println("--");
        System.out.println("byte to short: " + (short) b);
        System.out.println("short to int: " + (int) s);
        System.out.println("int to long: " + (long) i);
        System.out.println("long to float: " + (float) l);
        System.out.println("float to double: " + (double) f);

        // Following compile OK with cast
        System.out.println();
        System.out.println("Explicit Widening conversions:");
        System.out.println("--");
        System.out.println("cast byte to char: " + (char) b);
        System.out.println("cast short to char: " + (char) s);

        /** Narrowing ***************************************/
        double a = 150.234256421235409645;
        System.out.println();
        System.out.println("Explicit Narrowing conversions:");
        System.out.println("--");
        System.out.println("double to float: " + (float) a);
        System.out.println("float to long: " + (long) f);
        System.out.println("long to int: " + (int) l);
        System.out.println("int to short: " + (short) i);
        System.out.println("short to byte: " + (byte) s);

        // Using the values of d and c
        System.out.println("Value of d: " + d);
        System.out.println("Value of c: " + c);
    }
}