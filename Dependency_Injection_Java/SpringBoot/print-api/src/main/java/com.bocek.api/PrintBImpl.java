package com.bocek.api;

public class PrintBImpl implements Print{
private Message message;

    public PrintBImpl(Message message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println("B çalıştı" + message.message());
    }
}
