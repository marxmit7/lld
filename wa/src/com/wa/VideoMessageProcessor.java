package wa.src.com.wa;

public class VideoMessageProcessor implements MessageProcessor{
    @Override
     public void processMessage(Message message){
        System.out.println("processing video message: "+message);
     }
}