public class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public synchronized void startCrying(){
        System.out.println(Thread.currentThread().getName() + " comes to comfort " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
