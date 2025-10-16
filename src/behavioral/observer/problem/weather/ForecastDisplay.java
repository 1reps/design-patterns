package behavioral.observer.problem.weather;

public class ForecastDisplay {
    
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Forecast: " + (pressure < 29.92 ? "Rain" : "Sunny"));
    }
}