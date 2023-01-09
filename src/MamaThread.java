public class MamaThread extends Thread{
    private Child c;

    public MamaThread(Child c) {
        this.c = c;
    }

    @Override
    public void run(){
        c.startCrying();
    }
}
