package wa.src.com.wa;

public class AudioMessageProcessor implements MessageProcessor{

    @Override
    public void processMessage(Message message){
        System.out.println("processing audio message: "+message);
    }
}