package com.example.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.ChatMessage;

@Controller
public class ChatController {
	    @MessageMapping("/sendMessage")
	    @SendTo("/topic/messages")
	    public ChatMessage send(ChatMessage message) {
	        return message;
	    }

    // Loads the chat.html template when user visits "/"
    @GetMapping("/")
    public String chat() {
        return "chat"; // thymeleaf template: chat.html
    }
}
