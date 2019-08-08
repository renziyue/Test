package pc.wait_notify;

public class Producter extends Thread {
    private Resource resource;

    public Producter (Resource resource){
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
