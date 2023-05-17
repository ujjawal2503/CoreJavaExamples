package LambdaExpressionWithFunctionalInterface;

public class ThreadDemo {
    public static void main(String[] args) {


        //Creating thread using Lambda expression...
        Runnable thread1 = () -> {
            //this is the body of the thread
            for (int i = 0; i < 10; i++) {
                System.out.println("I---" + i);
             /*   try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        };
        Runnable thread2 = () -> {
            //this is the body of the thread
            for (int i = 10; i < 20; i++) {
                System.out.println("I---" + i);
               /* try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }*/
            }
        };
        Thread t1 = new Thread(thread1);
        t1.setName("Ujjawal");
        t1.setPriority(1);
        t1.start();
        System.out.println(t1.getName());

        Thread t2 = new Thread(thread2);
        t2.setPriority(10);
        t2.setName("Aseem ka thread");
        t2.start();
       // t1.start();
        System.out.println(t2.getName());

    }
}
