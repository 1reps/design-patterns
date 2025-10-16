package behavioral.observer.problem.news;

public class NewsChannel {
    
    private String name;
    
    public NewsChannel(String name) {
        this.name = name;
    }
    
    public void update(String news) {
        System.out.println(name + " received news: " + news);
    }
}