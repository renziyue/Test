package pc.BlockingQueue;

public class Main {

    public static void main(String[] args) {
        Resouse resouse=new Resouse();
        Thread pro1=new Thread(new producter(resouse,"生产1"));
        Thread pro2=new Thread(new producter(resouse,"生产2"));
        Thread cum2=new Thread(new Cusmer(resouse,"消费2"));
        Thread cum1=new Thread(new Cusmer(resouse,"消费1"));

        pro1.start();
        pro2.start();
        cum1.start();
        cum2.start();
    }
}
