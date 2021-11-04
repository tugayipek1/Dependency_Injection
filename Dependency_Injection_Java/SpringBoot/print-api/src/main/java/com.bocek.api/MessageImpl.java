package com.bocek.api;

public class MessageImpl implements Message{
    @Override
    public String message() {
        return "Mesaj gönderildi";
    }
}
