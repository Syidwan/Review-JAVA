public class IncDec {
    public static void main(String[] args) {
        // Inisialisasi variabel a dan b
        int a = 1, b = 9;

        // Menampilkan nilai sebelum operasi increment-decrement
        System.out.println("Nilai sebelum increment-decrement");
        System.out.println("a=" + a + ": b=" + b);

        // Increment nilai a dan decrement nilai b
        a++;
        b--;

        // Menampilkan nilai setelah operasi increment-decrement
        System.out.println("Nilai setelah increment-decrement");
        System.out.println("a=" + a + ": b=" + b);
    }
}