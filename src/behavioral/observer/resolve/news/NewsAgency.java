package behavioral.observer.resolve.news;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class NewsAgency implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String news;

    @Override
    public void registerObserve(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserve(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(news));
    }

    public void setNews(String news) {
        this.news = news;

        notifyObservers();
    }
}
