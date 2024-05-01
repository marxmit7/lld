package com.kafka.models;

public class Consumer{
    private DistributedQueue distributedQueue;
    private String consumerId;

    public Consumer(DistributedQueue queue, String consumerId){
        this.distributedQueue=queue;
        this.consumerId = consumerId;
    }

    public void subscribe(String topicName){
        distributedQueue.subscribe(topicName, consumerId);
    }
}