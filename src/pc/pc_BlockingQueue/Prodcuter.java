package pc.pc_BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class Prodcuter implements Runnable {

    private  final BlockingQueue blockingQueue;

    public Prodcuter(BlockingQueue blockingQueue){
        this.blockingQueue=blockingQueue;
    }
    @Override
    public void run() {
     for(int i=0;i<10;i++){
         System.out.println("producter放入"+i);
         try {
             blockingQueue.put(i);
         } catch (InterruptedException e) {
             System.out.println(e);
         }
     }
    }
}
