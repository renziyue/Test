package pc.Lock;

public class LPro extends Thread {
    private LResource resource;

    public LPro (LResource resource){
        this.resource=resource;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
    }

}
