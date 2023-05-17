package Thread;

public class Threadone extends Thread{
    public void run(){
        System.out.println("this is first way of creating thread");
    }

    public static void main(String[] args) {
        Threadone t1= new Threadone();
        t1.start();

    }
}
