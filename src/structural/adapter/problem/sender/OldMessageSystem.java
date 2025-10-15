package structural.adapter.problem.sender;

public class OldMessageSystem implements OldMessageSender {

    @Override
    public int sent(String[] messageData) {
        System.out.println(
            "OldMessageSystem: Sending message: "
                + messageData[0] + " to " + messageData[1]
        );
        return 1;
    }
}

