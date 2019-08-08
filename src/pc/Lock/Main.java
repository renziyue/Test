package pc.Lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
                    Condition producerCondition = lock.newCondition();
                     Condition consumerCondition = lock.newCondition();
                      LResource resource = new LResource(lock,producerCondition,consumerCondition);

                     //生产者线程
                     LPro producer1 = new LPro(resource);

                     //消费者线程
                     LCum consumer1 = new LCum(resource);
                      LCum consumer2 = new LCum(resource);
                   LCum consumer3 = new LCum(resource);

                     producer1.start();
                     consumer1.start();
                     consumer2.start();
                     consumer3.start();
    }
}
