package dev.rikthipranadhik.chatroomapp.controller;

import dev.rikthipranadhik.chatroomapp.elements.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    private SimpMessagingTemplate template;

    @MessageMapping("/public-message")
    @SendTo("/room/public")
    private Message recievePublicMessage(@Payload Message message) {
        return message;
    }

    @MessageMapping("/private-message")
    public Message recievePrivateMessage(@Payload Message message) {
        template.convertAndSendToUser(message.getReceiverID(),"/private", message); // sends to user/{userID}/private
        return message;
    }
}
