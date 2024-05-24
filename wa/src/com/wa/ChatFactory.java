package wa.src.com.wa;

public class ChatFactory{

    public static Chat getChat(String type, String chatId, String... userIds){

        switch (type) {
            case "one-to-one":
                return new OneToOneChat(chatId,userIds[0],userIds[1]);

            case "groupd":
                GroupChat groupChat = new GroupChat(chatId);
                for(String user :userIds) groupChat.addParticipant(user);
                
                return groupChat;
                   
            default:
                break;
        }
    }
}