package pc.wait_notify;

public class Cumserter extends Thread {
    private Resource resource;

    public Cumserter(Resource resource){
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
