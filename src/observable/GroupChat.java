package observable;

import observers.IObserver;

import java.util.ArrayList;

public class GroupChat implements IObservable {
    ArrayList<IObserver> observers = new ArrayList<>();
    int counter = 0;

    @Override
    public boolean addObserver(IObserver observer) {
        return this.observers.add(observer);
    }

    @Override
    public boolean removeObserver(IObserver observer) {
        return this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        try {
            for (IObserver observer : observers) {
                observer.update();
            }
        } catch (Exception e) {
            System.out.println("method fired!!");
        }
    }

    public String getNewMessages() {
        return "new message received " + String.valueOf(this.counter);
    }

    public void updateState() {
        this.counter = this.counter + 1;
        System.out.println("State updated " + this.counter);

    }

    public String getData() {
        return this.getNewMessages();
    }

}
