package observable;
import observers.*;

public interface IObservable {
    boolean addObserver(IObserver observer);
    boolean removeObserver(IObserver observer);
    void notifyObservers();

    String getData();
    void updateState();
}
