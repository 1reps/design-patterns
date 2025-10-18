package behavioral.publisherSubscriber.resolve.news;

public class NewsPublisher implements Publisher {

    private Broker broker;

    public NewsPublisher(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void publish(Message message) {
        System.out.println(
            "Publishing: " + message.getContent()
                + " on topic: " + message.getTopic()
        );

        broker.publish(message);
    }
}
