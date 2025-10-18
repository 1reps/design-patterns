package behavioral.publisherSubscriber.problem.news;

public class NewsSubscriber {
    private String name;
    
    public NewsSubscriber(String name) {
        this.name = name;
    }
    
    public void receiveNews(String topic, String news) {
        System.out.println(name + "가 " + topic + " 뉴스를 받음: " + news);
    }
    
    public String getName() {
        return name;
    }
}