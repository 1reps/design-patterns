package behavioral.observer.problem.weather;

import behavioral.observer.resolve.weather.CurrentConditionsDisplay;
import behavioral.observer.resolve.weather.ForecastDisplay;
import behavioral.observer.resolve.weather.StatisticsDisplay;

public class WeatherData {
    
    private float temperature, humidity, pressure;
    
    // 디스플레이 객체들을 직접 참조 - 강결합
    private CurrentConditionsDisplay currentDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;
    
    public WeatherData() {
        // 디스플레이 객체들을 직접 생성 - 의존성 하드코딩
        this.currentDisplay = new CurrentConditionsDisplay();
        this.statisticsDisplay = new StatisticsDisplay();
        this.forecastDisplay = new ForecastDisplay();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        
        // 모든 디스플레이를 직접 호출 - 새로운 디스플레이 추가 시 코드 수정 필요
        currentDisplay.update(temperature, humidity, pressure);
        statisticsDisplay.update(temperature, humidity, pressure);
        forecastDisplay.update(temperature, humidity, pressure);
    }
    
    // 새로운 디스플레이 추가 시 이 메소드도 수정해야 함
    public void addNewDisplay() {
        // 새로운 디스플레이를 추가하려면 WeatherData 클래스를 수정해야 함
        // OCP 위반!
    }
}