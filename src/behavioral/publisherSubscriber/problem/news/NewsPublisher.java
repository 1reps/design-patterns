package behavioral.publisherSubscriber.problem.news;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
    private List<NewsSubscriber> sportsSubscribers = new ArrayList<>();
    private List<NewsSubscriber> weatherSubscribers = new ArrayList<>();
    private List<NewsSubscriber> politicsSubscribers = new ArrayList<>();
    
    public void subscribeSports(NewsSubscriber subscriber) {
        sportsSubscribers.add(subscriber);
    }
    
    public void subscribeWeather(NewsSubscriber subscriber) {
        weatherSubscribers.add(subscriber);
    }
    
    public void subscribePolitics(NewsSubscriber subscriber) {
        politicsSubscribers.add(subscriber);
    }
    
    public void unsubscribeSports(NewsSubscriber subscriber) {
        sportsSubscribers.remove(subscriber);
    }
    
    public void unsubscribeWeather(NewsSubscriber subscriber) {
        weatherSubscribers.remove(subscriber);
    }
    
    public void unsubscribePolitics(NewsSubscriber subscriber) {
        politicsSubscribers.remove(subscriber);
    }
    
    public void publishSportsNews(String news) {
        for (NewsSubscriber subscriber : sportsSubscribers) {
            subscriber.receiveNews("스포츠", news);
        }
    }
    
    public void publishWeatherNews(String news) {
        for (NewsSubscriber subscriber : weatherSubscribers) {
            subscriber.receiveNews("날씨", news);
        }
    }
    
    public void publishPoliticsNews(String news) {
        for (NewsSubscriber subscriber : politicsSubscribers) {
            subscriber.receiveNews("정치", news);
        }
    }
}