package pc.pc_BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue blockingQueue=new ArrayBlockingQueue(10);
        Thread pro=new Thread(new Prodcuter(blockingQueue));
        Thread cum1=new Thread(new Coustmer(blockingQueue,"线程1"));
        Thread cum2=new Thread(new Coustmer(blockingQueue,"线程2"));

        pro.start();
        cum1.start();
        cum2.start();
    }
}
