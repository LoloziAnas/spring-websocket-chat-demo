package com.anaslolozi.chat.model;

public record ChatMessage(String sender, String content, MessageType type) {
}
