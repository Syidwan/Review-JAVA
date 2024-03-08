public class DefValue {
    boolean b;
    int i;
    double d;
    long l;
    char c;
    float f;
    byte y;

    public static void main(String[] args) {
        DefValue val = new DefValue();
        System.out.println("Default boolean: " + val.b);
        System.out.println("Default integer: " + val.i);
        System.out.println("Default double: " + val.d);
        System.out.println("Default long: " + val.l);
        System.out.println("Default float: " + val.f);
        System.out.println("Default byte: " + val.y);
        System.out.println("Default char: " + val.c);
    }
}