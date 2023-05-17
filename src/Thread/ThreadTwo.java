package Thread;

public class ThreadTwo implements Runnable{
    @Override
    public void run() {
        System.out.println("This is the second way of creating thread");
    }

    public static void main(String[] args) {
        ThreadTwo t2 =new ThreadTwo();
        Thread t = new Thread(t2);
        t.start();
    }
}
