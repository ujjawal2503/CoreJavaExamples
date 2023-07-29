package Thread;

public class ThreadOne extends Thread{
    public void run(){

        System.out.println("this is first way of creating thread");
        for (int i = 10; i >0 ; i--) {
            System.out.println("value of i for other thread"+i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void main(String[] args) {
        ThreadOne t1= new ThreadOne();
        t1.start();

    }
}
