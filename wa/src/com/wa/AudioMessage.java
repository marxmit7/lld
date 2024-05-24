package wa.src.com.wa;

public class AudioMessage extends Message{
    private String content;

    public AudioMessage(){};

    public void setContent(String content, String sender){
        this.content = content;
        sendByUserId=sender;
    }
    
    public String getContent(){
        return content;
    }
}