package in.kunal.chatapp.model;

import lombok.*;

import java.nio.file.FileStore;
/**
 * Represents a chat message in the chat application.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String content;
    private String sender;
    private String senderId;
    private MessageType type;


    public enum MessageType {
        CHAT, LEAVE, JOIN
    }


}
