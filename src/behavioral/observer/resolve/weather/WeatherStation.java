package behavioral.observer.resolve.weather;

// Subject interface
public interface WeatherStation {

    void registerObserver(WeatherObserver o);

    void removeObserver(WeatherObserver o);

    void notifyObservers();

}
