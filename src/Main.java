public class Main {
    public static void main(String[] args) {
        Child c = new Child("Vasyl");

        MamaThread m = new MamaThread(c);
        PapaThread p = new PapaThread(c);
        m.setName("Mama Thread");
        p.setName("Papa Thread");

        m.start();
        p.start();

    }
}
