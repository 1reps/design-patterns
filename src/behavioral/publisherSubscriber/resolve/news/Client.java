package behavioral.publisherSubscriber.resolve.news;

public class Client {

    public static void main(String[] args) {
        Broker broker = new Broker();

        NewsPublisher publisher = new NewsPublisher(broker);

        NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
        NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");

        broker.subscriber("sports", subscriber1);
        broker.subscriber("weather", subscriber2);
        broker.subscriber("sports", subscriber2);

        publisher.publish(new Message("Liverpool won the match", "sports"));
        publisher.publish(new Message("It`s sunny today", "weather"));
    }
}
