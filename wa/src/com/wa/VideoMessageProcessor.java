package wa.src.com.wa;

public class VideoMessageProcessor implements MessageProcessor{
    @Override
     public void processMessage(Message message){
      System.out.println("message: "+((VideoMessage)message).getContent()+" sent By: "+message.sendByUserId +" type: "+MessageType.VIDEO.name());
   }
}