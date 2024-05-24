package wa.src.com.wa;

import java.util.ArrayList;
import java.util.List;
public abstract class Chat{
    private String chatId;
    protected List<Message> messages;

    public Chat(String chatId){
        this.chatId = chatId;
        this.messages = new ArrayList<>();
    }


    public abstract void addParticipant(String userId);
    public abstract void addMessages(Message message);

    public String getChatId(){
        return chatId;
    }

    
}