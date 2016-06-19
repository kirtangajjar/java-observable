package java_observable;

public interface Subject {
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifyObservers();
}