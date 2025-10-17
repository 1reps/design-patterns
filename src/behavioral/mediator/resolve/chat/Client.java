package behavioral.mediator.resolve.chat;

public class Client {

    public static void main(String[] args) {
        ChatMediatorImpl mediator = new ChatMediatorImpl();

        UserImpl user1 = new UserImpl(mediator, "John");
        UserImpl user2 = new UserImpl(mediator, "Jane");
        UserImpl user3 = new UserImpl(mediator, "Bob");
        UserImpl user4 = new UserImpl(mediator, "Alice");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");
    }
}
