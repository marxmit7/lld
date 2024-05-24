package wa.src.com.wa;

public class TextMessageProcessor implements MessageProcessor{
    @Override
     public void processMessage(Message message){
        System.out.println("processing text message: "+message);
     }
}