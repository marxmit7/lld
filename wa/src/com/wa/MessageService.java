package wa.src.com.wa;

import java.util.HashMap;
import java.util.Map;

public class MessageService{

    private Map<Class<? extends Message>, MessageProcessor> processorMap;

    public MessageService(){
        processorMap = new HashMap<>();
        processorMap.put(TextMessage.class, new TextMessageProcessor());
        processorMap.put(AudioMessage.class, new AudioMessageProcessor());
        processorMap.put(VideoMessage.class, new VideoMessageProcessor());
        processorMap.put(PhotoMessage.class, new PhotoMessageProcessor());
    }

    public void processMessage(Message message){
        MessageProcessor messageProcessor = processorMap.get(message.getClass());

        if(messageProcessor!=null){
            messageProcessor.processMessage(message);
        }
    }
}