package sandbox.messaging;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MessagingServiceTest {

    @Test
    void publishMessage() {
        MessagingService messagingService = new MessagingService();

        messagingService.publishMessage("Message A");
        messagingService.publishMessage("Message B");
        messagingService.publishMessage("Message C");

        assertEquals(List.of("Message A", "Message B", "Message C"), messagingService.getPublishedMessages());
    }

}