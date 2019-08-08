package pc.Lock;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LResource {
    private int num=0;//当前资源数量
    private int size=10;//资源池中允许存放的资源数目

    private Lock lock;
    private Condition proCondition;
    private Condition cusCondititon;

    public LResource(Lock lock,Condition proCondition,Condition cusCondititon){
        this.lock=lock;
        this.cusCondititon=cusCondititon;
        this.proCondition=proCondition;
    }


    public void add(){
        lock.lock();
        try {
            if(num<size){
                num++;
                System.out.println("生产者"+Thread.currentThread().getName()+"放入，"+"当前拥有"+num);
                cusCondititon.signalAll();
            }else {
                proCondition.await();
                System.out.println(Thread.currentThread().getName() + "生产线程进入等待");
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            lock.unlock();
        }
    }

    public void remove(){
        lock.lock();
        try {
            if(num>0){
                num--;
                System.out.println("消费者"+Thread.currentThread().getName()+"消费，"+"当前拥有"+num);
                proCondition.signalAll();
            }else {
                cusCondititon.await();
                System.out.println(Thread.currentThread().getName() + "消费线程进入等待");
            }
        }catch (Exception e){
            System.out.println(e);
        }finally {
            lock.unlock();
        }

    }
}
