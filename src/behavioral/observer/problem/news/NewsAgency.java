package behavioral.observer.problem.news;

import behavioral.observer.resolve.news.NewsChannel;

public class NewsAgency {

    private String news;

    // 모든 채널을 직접 참조 - 강결합
    private NewsChannel channel1;
    private NewsChannel channel2;
    private NewsChannel channel3;

    public NewsAgency() {
        // 채널들을 직접 생성 - 의존성 하드코딩
        this.channel1 = new NewsChannel("Channel 1");
        this.channel2 = new NewsChannel("Channel 2");
        this.channel3 = new NewsChannel("Channel 3");
    }

    public void setNews(String news) {
        this.news = news;

        // 모든 채널을 직접 호출 - 채널 추가/제거 시 코드 수정 필요
        if (channel1 != null) {
            channel1.update(news);
        }
        if (channel2 != null) {
            channel2.update(news);
        }
        if (channel3 != null) {
            channel3.update(news);
        }
    }

    // 특정 채널을 비활성화하려면 이런 식으로 해야함 - 매우 비효율적
    public void disableChannel2() {
        this.channel2 = null;
    }

    public void enableChannel2() {
        this.channel2 = new NewsChannel("Channel 2");
    }
}