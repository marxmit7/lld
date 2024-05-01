package com.kafka;

import com.kafka.models.Consumer;
import com.kafka.models.DistributedQueue;
import com.kafka.models.Message;
import com.kafka.models.Producer;

public class Main{

    public static void main(String [] args){

        DistributedQueue distributedQueue = new DistributedQueue();

        distributedQueue.createTopic("topic_a");
        distributedQueue.createTopic("topic_b");
        distributedQueue.createTopic("topic_c");

        Message message_a = new Message("message_a");
        Message message_b = new Message("message_b");

        Producer producer = new Producer(distributedQueue);
        producer.publish(message_a, "topic_a");
        producer.publish(message_b, "topic_b");

        Consumer consumer = new Consumer(distributedQueue,"c1");

        consumer.subscribe("topic_a");
        consumer.subscribe("topic_b");
    }
}