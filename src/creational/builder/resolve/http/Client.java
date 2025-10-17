package creational.builder.resolve.http;

import creational.builder.resolve.http.HttpRequest.Builder;

public class Client {

    public static void main(String[] args) {

        HttpRequest getRequest = new Builder("GET", "https://example.com/api")
            .addHeaders("Authorization", "Bearer token")
            .addParameters("query", "builder-pattern")
            .build();

        System.out.println(getRequest);
    }
}
