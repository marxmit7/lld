package wa.src.com.wa;

public class OneToOneChat extends Chat{
    private String sender;
    private String receiver;


    public OneToOneChat(String chatId, String u1, String u2){
        super(chatId);
        this.sender = u1;
        this.sender = u2;
    }

    @Override
    public void addMessages(Message message){
        messages.add(message);
    }

    @Override
    public void addParticipant(String u1){
       System.out.println("cannot add extra participants");
    }
    
}