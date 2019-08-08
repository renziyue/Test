package pc.Lock;

import static java.lang.Thread.sleep;

public class LCum extends Thread{

    private LResource resource;

    public LCum(LResource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        while (true){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.remove();
        }
    }
}
