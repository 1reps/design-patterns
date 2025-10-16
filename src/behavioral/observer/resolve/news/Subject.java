package behavioral.observer.resolve.news;

// Subject (Publisher) interface
public interface Subject {

    void registerObserve(Observer observer);

    void removeObserve(Observer observer);

    void notifyObservers();
}
