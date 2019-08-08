package pc.pc_BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Coustmer implements Runnable {

    private  final BlockingQueue blockingQueue; //put()   take()  具有阻塞的功能
    String name;

    public Coustmer(BlockingQueue blockingQueue,String name){
        this.blockingQueue=blockingQueue;
        this.name=name;
    }

    @Override
    public void run() {
        try {
            int i= (int) blockingQueue.take();
            System.out.println(name+" "+"取出"+i);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
