package wa.src.com.wa;

public class MessageFactory{


    public static Message createMessage(MessageType messageType){

        switch (messageType) {
            case TEXT:
                    return new TextMessage();
            case AUDIO:
                    return new AudioMessage();
            case VIDEO:
                    return new VideoMessage();
            case PHOTO:
                    return new PhotoMessage();
            default:
                    return new TextMessage();        
                }
    }
}