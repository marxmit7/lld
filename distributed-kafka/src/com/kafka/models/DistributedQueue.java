package com.kafka.models;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Objects;

public class DistributedQueue{
    private Map<String, Topic> topics = new ConcurrentHashMap<>();

    public void createTopic(String topicName){
        this.topics.put(topicName, new Topic());
    }

    public void publish(String topicName, Message message){
        Topic topic = topics.get(topicName);

        if(!Objects.isNull(topic)){
            topic.publish(message);
        }
    }

    public void subscribe(String topicName, String consumerId){
        Topic topic = topics.get(topicName);

        if(topic!=null){
            new Thread(() ->{
                while(true){
                    Message message = topic.consume();

                    if(message!=null){
                        System.out.println("consumerId: "+consumerId+"  message: "+message.getMessage());
                    }
                }
            }).start();
        }

    }
}