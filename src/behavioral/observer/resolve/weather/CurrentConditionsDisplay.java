package behavioral.observer.resolve.weather;

public class CurrentConditionsDisplay implements WeatherObserver {

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println(
            "Current: " + temp + "F, " + humidity + "% humidity"
        );
    }
}
