package wa.src.com.wa;

public class TextMessage extends Message{

    private String content;

    public TextMessage(){};

    public void setContent(String content){
        this.content = content;
    }
    public String getContent(){
        return content;
    }
}