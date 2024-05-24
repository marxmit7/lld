package wa.src.com.wa;

public class PhotoMessage extends Message{
    private String content;

    public PhotoMessage(){};

    public void setContent(String content, String sender){
        this.content = content;
        sendByUserId=sender;
    }
    
    public String getContent(){
        return content;
    }
}