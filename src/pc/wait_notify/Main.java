package pc.wait_notify;

public class Main {
    public static void main(String[] args) {
        Resource resource=new Resource();
        //生产者线程
                 Producter p1 = new Producter(resource);
        Producter p2 = new Producter(resource);
        Producter p3 = new Producter(resource);
                 //消费者线程
                 Cumserter c1 = new Cumserter(resource);
                 Cumserter c2 = new Cumserter(resource);
                 //Cumserter c3 = new Cumserter(resource);

                 p1.start();
                 p2.start();
                 p3.start();
              c1.start();
              c2.start();
    }
}
