public class TestLogical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        System.out.println();
        System.out.println("Logical Operators:");
        System.out.println("==================");

        System.out.println("true & true: " + (a && b));
        System.out.println("true & false: " + (a && c));
        System.out.println("true | false: " + (a || c));
        System.out.println("true ^ true: " + (a ^ b));
        System.out.println("!true: " + (!a));
        System.out.println("false & true: " + (c && b));
        System.out.println("false | true: " + (c || b));
        System.out.println("false ^ true: " + (c ^ b));
        System.out.println("!false: " + (!c));
        System.out.println("true && true: " + (a && b));
        System.out.println("false && true: " + (c && b));
        System.out.println("false && false: " + (c && d));
        System.out.println("true || true: " + (a || b));
        System.out.println("false || true: " + (c || b));
        System.out.println("false || false: " + (c || d));
    }
}
