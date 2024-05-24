package wa.src.com.wa;

public class PhotoMessageProcessor implements MessageProcessor{
    @Override
     public void processMessage(Message message){
        System.out.println("processing photo message: "+message);
     }
}