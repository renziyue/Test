package pc.BlockingQueue;

public class producter implements Runnable{
    private Resouse resouse;
    String name;


    public producter(Resouse resouse,String name){
        this.resouse=resouse;
        this.name=name;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep((long) (1000 * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            resouse.add();
        }
    }
}
