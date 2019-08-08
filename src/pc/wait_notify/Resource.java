package pc.wait_notify;

public class Resource {

    private int num=0;

    public synchronized void add(){
//        if(num>=10){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//
//                System.out.println(e);
//            }
//        }
//        num++;
//        System.out.println("生产者"+Thread.currentThread().getName()+"放入，"+"当前拥有"+num);
//        notifyAll();

        if(num<10){
            num++;
        System.out.println("生产者"+Thread.currentThread().getName()+"放入，"+"当前拥有"+num);
        notifyAll();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
    public synchronized void remove(){
//        if(num<=0){
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//        num--;
//        notifyAll();

//        System.out.println("消费者"+Thread.currentThread().getName()+"消费，"+"当前拥有"+num);


        if(num>0){
            num--;
            System.out.println("消费者"+Thread.currentThread().getName()+"消费，"+"当前拥有"+num);
            notifyAll();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
