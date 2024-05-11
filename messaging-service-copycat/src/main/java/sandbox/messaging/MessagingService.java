package sandbox.messaging;

import java.util.ArrayList;
import java.util.List;

public class MessagingService {

    private final List<String> publishedMessages = new ArrayList<>();

    public void publishMessage(String message) {
        publishedMessages.add(message);
    }

    public List<String> getPublishedMessages() {
        return publishedMessages;
    }
}
