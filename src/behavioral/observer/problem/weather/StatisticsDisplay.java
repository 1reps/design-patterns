package behavioral.observer.problem.weather;

public class StatisticsDisplay {
    
    public void update(float temp, float humidity, float pressure) {
        System.out.println("Statistics: Avg temp " + temp);
    }
}