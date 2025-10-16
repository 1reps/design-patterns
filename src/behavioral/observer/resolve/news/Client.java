package behavioral.observer.resolve.news;

public class Client {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        NewsChannel channel1 = new NewsChannel("Channel 1");
        NewsChannel channel2 = new NewsChannel("Channel 2");

        agency.registerObserve(channel1);
        agency.registerObserve(channel2);

        agency.setNews("Breaking news: Observer Pattern in action!");

        agency.removeObserve(channel2);

        agency.setNews("Another update: Channel 2 unsubscribed.");
    }
}
