package wa.src.com.wa;

public class PhotoMessageProcessor implements MessageProcessor{
    @Override
     public void processMessage(Message message){
      System.out.println("message: "+((PhotoMessage)message).getContent()+" sent By: "+message.sendByUserId +" type: "+MessageType.PHOTO.name());
   }
}