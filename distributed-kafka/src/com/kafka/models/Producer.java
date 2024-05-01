package com.kafka.models;

public class Producer{
    private DistributedQueue distributedQueue ;

    public Producer(DistributedQueue queue){
        this.distributedQueue=queue;
    }

    public void publish(Message message, String topicName){
        distributedQueue.publish(topicName, message);
    }
}