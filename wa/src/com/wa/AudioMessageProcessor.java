package wa.src.com.wa;

public class AudioMessageProcessor implements MessageProcessor{

    @Override
    public void processMessage(Message message){
        System.out.println("message: "+((AudioMessage)message).getContent()+" sent By: "+message.sendByUserId +" type: "+MessageType.AUDIO.name());
    }
}