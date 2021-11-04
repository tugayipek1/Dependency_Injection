package com.bocek.api;

public class PrintAImpl implements Print{
   private Message message;

    public PrintAImpl(Message message) {
        this.message = message;
    }

    @Override
    public void print() {
        System.out.println("A çalıştı." + message.message());
    }
}
