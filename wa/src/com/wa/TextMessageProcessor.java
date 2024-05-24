package wa.src.com.wa;

public class TextMessageProcessor implements MessageProcessor{
    @Override
     public void processMessage(Message message){
        System.out.println("message: "+((TextMessage)message).getContent()+" sent By: "+message.sendByUserId +" type: "+MessageType.TEXT.name());
     }
}