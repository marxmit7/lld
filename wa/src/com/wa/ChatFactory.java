package wa.src.com.wa;

public class ChatFactory{

    public static <T extends Chat> T createChat(String type, String chatId, String... userIds){

        switch (type) {
            case "one-to-one":
                return (T) new OneToOneChat(chatId,userIds[0],userIds[1]);

            case "groupd":
                GroupChat groupChat = new GroupChat(chatId);
                for(String user :userIds) groupChat.addParticipant(user);
                
                return (T) groupChat;
                   
            default:
                break;
        }
		return null;
    }
}