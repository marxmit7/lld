package wa.src.com.wa;

public class TextMessage extends Message{

    private String content;

    public TextMessage(){};

    public void setContent(String content){
        this.content = content;
    }
    public void getContent(){
        return content;
    }
}