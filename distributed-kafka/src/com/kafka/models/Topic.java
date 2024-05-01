package com.kafka.models;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;

public class Topic{
    private Queue<Message> messages = new ConcurrentLinkedQueue<>();

    public void publish(Message message){
        this.messages.offer(message);
    }

    public Message consume(){
       return this.messages.poll();
    }
}