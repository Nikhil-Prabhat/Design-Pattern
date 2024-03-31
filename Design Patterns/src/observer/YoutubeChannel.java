package observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject {

    List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyChanges() {
        subscribers.stream().forEach(
                subscriber -> subscriber.notified()
        );
    }
}
