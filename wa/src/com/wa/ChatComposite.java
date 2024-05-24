package wa.src.com.wa;

import java.util.HashMap;
import java.util.Map;

public class ChatComposite{
    Map<String , Chat> chatMap ;

    public ChatComposite(){
        this.chatMap = new HashMap<>();
    }

    public void addChat(Chat chat){
        chatMap.put(chat.getChatId(),chat);
    }

    public Chat getChat(String chatId){
        return chatMap.get(chatId);
    }

    public void remove(Chat chat){
        chatMap.remove(chat.getChatId());
    }
}