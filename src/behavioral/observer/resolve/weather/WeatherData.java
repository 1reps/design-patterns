package behavioral.observer.resolve.weather;

import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class WeatherData implements WeatherStation {

    private List<WeatherObserver> observers = new ArrayList<>();
    private float temperature, humidity, pressure;

    @Override
    public void registerObserver(WeatherObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(WeatherObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    public void setMeasurements(
        float temperature, float humidity, float pressure
    ) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        notifyObservers();
    }
}
