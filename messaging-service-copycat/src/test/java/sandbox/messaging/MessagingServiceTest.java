package sandbox.messaging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessagingServiceTest {

    @Test
    void publishMessage() {
        MessagingService messagingService = new MessagingService();
        messagingService.publishMessage("foo baz");
        assertEquals("foo baz", messagingService.getPublishedMessage());
    }

}