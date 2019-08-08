package pc.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Resouse {
    private BlockingQueue resouse =new LinkedBlockingQueue(10);

    public void add(){
        try {
            resouse.put(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生产者"+Thread.currentThread().getName()+"放入，"+"当前拥有"+resouse.size());
    }

    public void take(){
        try {
            int i= (int) resouse.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者" + Thread.currentThread().getName() + "消耗," + "当前资源池有" + resouse.size() + "个资源");
    }
}
