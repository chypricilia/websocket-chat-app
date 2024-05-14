/**
 * Author: Pricilia Anna V
 * Date:5/14/2024
 * Time:6:40 PM
 */

package org.example.websocketchatapp.model;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

/**
 * Author: Pricilia Anna V
 * Date:5/14/2024
 * Time:6:40 PM
 */

@Getter
@Setter
public class ChatMessage {
    
    private MessageType type;
    private String content;
    private String sender;
    
    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
    
}
