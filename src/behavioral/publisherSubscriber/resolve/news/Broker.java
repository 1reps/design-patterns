package behavioral.publisherSubscriber.resolve.news;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Broker {

    private Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void subscriber(String topic, Subscriber subscriber) {
        subscribers.computeIfAbsent(
            topic,
            k -> new ArrayList<>()
        ).add(subscriber);
    }

    public void publish(Message message) {
        List<Subscriber> topicSubscribers = subscribers.get(message.getTopic());

        if (topicSubscribers != null) {
            for (Subscriber subscriber : topicSubscribers) {
                subscriber.update(message);
            }
        }
    }
}
