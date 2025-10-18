package behavioral.publisherSubscriber.resolve.news;

public class NewsSubscriber implements Subscriber {

    private String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(Message message) {
        System.out.println(
            name + " received: " + message.getContent()
                + " on topic: " + message.getTopic()
        );
    }
}
