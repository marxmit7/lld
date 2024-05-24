package wa.src.com.wa;

public class VideoMessage extends Message{
    private String content;

    public VideoMessage(){};

    public void setContent(String content, String sender){
        this.content = content;
        sendByUserId=sender;
    }
    
    public String getContent(){
        return content;
    }
}