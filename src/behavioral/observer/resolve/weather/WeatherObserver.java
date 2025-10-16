package behavioral.observer.resolve.weather;

// Observer interface
public interface WeatherObserver {

    void update(float temp, float humidity, float pressure);
}
