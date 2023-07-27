package Thread;

public class Company {
    int n;
    boolean f = false;
    // if f= false : Producer has chance.
    //if f = true : Consumer has chance.
    public synchronized  void produce_item(int n) throws InterruptedException {
        if(f){
            wait();
        }
        this.n =n;
        System.out.println("Produced N :"+n);
        f= true;
        notify();
    }
    public synchronized int consume_item() throws InterruptedException {
        if(!f)
            wait();
        System.out.println("Consumed N:"+ n);
        f=false;
        notify();
        return this.n;
    }
}
