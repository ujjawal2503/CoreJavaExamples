package Thread;

public class ThreadTwo implements Runnable{
    @Override
    public void run() {

        System.out.println("This is the second way of creating thread");
        for (int i = 0; i <10 ; i++) {
            System.out.println("Value of i----"+(i+1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadTwo t2 =new ThreadTwo();
        Thread t = new Thread(t2);
        //We can run two thread simultaneously..
        ThreadOne t1 =new ThreadOne();
        t.start();
        t1.start();
    }
}
