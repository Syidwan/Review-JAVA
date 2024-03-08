public class CobaUnicode {
    public static void main(String[] args) {
        char a = 'a';
        char b = '\u0062';
        char c = '\u0063';
        String kata = "140061140062\u0063";

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("kata: " + kata);
    }
}