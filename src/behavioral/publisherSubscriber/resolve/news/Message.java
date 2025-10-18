package behavioral.publisherSubscriber.resolve.news;

class Message {

    private String content;
    private String topic;

    public Message(String content, String topic) {
        this.content = content;
        this.topic = topic;
    }

    public String getContent() {
        return content;
    }

    public String getTopic() {
        return topic;
    }
}
