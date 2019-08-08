package pc.BlockingQueue;

import javax.crypto.Cipher;

public class Cusmer implements Runnable{

    private Resouse resouse;

    private String name;

    public Cusmer(Resouse resouse,String name){
        this.name=name;
        this.resouse=resouse;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resouse.take();
        }
    }
}
