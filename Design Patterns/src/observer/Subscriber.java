package observer;

public class Subscriber implements Observer {

    private String nameOfSubscriber;

    public Subscriber(String name) {
        this.nameOfSubscriber = name;
    }

    @Override
    public void notified() {
        System.out.println("Hey " + this.nameOfSubscriber + "! New Video Uploaded");
    }
}
