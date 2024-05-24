package wa.src.com.wa;

public class MessageFactory{


    public static <T extends Message> T  createMessage(MessageType messageType){

        switch (messageType) {
            case TEXT:
                    return (T) new TextMessage();
            case AUDIO:
                    return (T) new AudioMessage();
            case VIDEO:
                    return (T) new VideoMessage();
            case PHOTO:
                    return (T) new PhotoMessage();
            default:
                    return (T) new TextMessage();        
                }
    }

    public static Class<? extends Message> getMessageClass(MessageType messageType){

        switch (messageType) {
            case TEXT:
                    return TextMessage.class;
            case AUDIO:
                    return AudioMessage.class;
            case VIDEO:
                    return VideoMessage.class;
            case PHOTO:
                    return PhotoMessage.class;
            default:
                    return TextMessage.class;
                }
    }

}