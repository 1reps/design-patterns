package behavioral.observer.resolve.weather;

public class ForecastDisplay implements WeatherObserver {

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println(
            "Forecast: " + (pressure < 29.92 ? "Rain" : "Sunny")
        );
    }
}
