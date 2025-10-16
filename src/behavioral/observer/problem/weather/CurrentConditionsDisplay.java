package behavioral.observer.problem.weather;

public class CurrentConditionsDisplay {
    
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Current: " + temp + "F, " + humidity + "% humidity");
    }
}