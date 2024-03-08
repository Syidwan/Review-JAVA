public class Relational {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        float f0 = 0.0f;
        float f1 = -0.0f;
        float f2 = -0.0f;

        // Relational #*****
        System.out.println();
        System.out.println("Relational operators:");
        System.out.println("##****");
        System.out.println("x < y: " + (x < y));
        System.out.println("x <= y: " + (x <= y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));

        System.out.println("\tLess than: -0.0 < 0.0 \t " + (f1 < f0));
        System.out.println("\tLess than or equal to: -0.0 <= 0.0 \t " + (f1 <= f0));
        System.out.println("\tGreater than: 5 > NaN \t " + (x > (f0 / f2)));
    }
}