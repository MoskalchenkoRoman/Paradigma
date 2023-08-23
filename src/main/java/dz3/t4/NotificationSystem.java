package dz3.t4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class NotificationSystem {
    private static final Logger LOGGER = Logger.getLogger(NotificationSystem.class.getName());
    private List messages;
    private Set<iObserver> observers;
    public NotificationSystem(){
        observers = new HashSet<>();
        messages = new ArrayList<>();
    }
    public void addObserver(iObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(iObserver observer) {
        observers.remove(observer);
    }

    public void addMessage(String message) {
        messages.add(message);
        LOGGER.info(String.format("Chat get new message: %s", message));
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (iObserver observer : observers) {
            observer.update(message);
        }
    }
}
