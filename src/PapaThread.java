public class PapaThread extends Thread{
    private Child c;

    public PapaThread(Child c) {
        this.c = c;
    }

    @Override
    public void run(){
        c.startCrying();
    }
}
