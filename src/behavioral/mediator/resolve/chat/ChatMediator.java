package behavioral.mediator.resolve.chat;

interface ChatMediator {

    void sendMessage(String message, User user);

    void addUser(User user);
}
