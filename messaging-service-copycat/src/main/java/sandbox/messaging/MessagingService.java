package sandbox.messaging;

public class MessagingService {

    private String publishedMessage;

    public void publishMessage(String message) {
        publishedMessage = message;
    }

    public String getPublishedMessage() {
        return publishedMessage;
    }
}
