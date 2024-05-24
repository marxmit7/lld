package wa.src.com.wa;

public class TextMessage extends Message{

    private String content;

    public TextMessage(){};

    public void setContent(String content, String sender){
        this.content = content;
        sendByUserId=sender;
    }
    
    public String getContent(){
        return content;
    }
}