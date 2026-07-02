package com.ryvo.websocket.controller;
import com.ryvo.websocket.config.MessageHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class NotificationController {

    @Autowired
    private MessageHandler messageHandler;

    @PostMapping("/pushNotification")
    public String sendMessage(@RequestBody String message) {
        messageHandler.sendMessageToAll(message);
        return "Mensagem enviada para todos os clientes WebSocket!";
    }

}
