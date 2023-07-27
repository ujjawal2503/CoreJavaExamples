package Thread;
  class  UserThread extends Thread{

      public void run() {
          //Creating task
          System.out.println("User Thread is here");
      }
  }
public class ThreadOperation {
    public static void main(String[] args) {
        System.out.println("program started");
        int x= 89+22;
        System.out.println("Sum is =="+x);
        Thread t = Thread.currentThread();
        String tName = t.getName();
        System.out.println("The Current thread name == "+tName);
        t.setName("myThread");
        System.out.println("The Current thread name == "+t.getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("id of thread === "+t.getId());
        UserThread userThread = new UserThread();
        userThread.start();

        System.out.println("Program end here....");
    }
}
