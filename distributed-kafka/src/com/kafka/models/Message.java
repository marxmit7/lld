package com.kafka.models;

public class Message{

    private String message;
    public Message(String content){
            this.message = content;
    }

    public String getMessage(){
        return this.message;
    }
}