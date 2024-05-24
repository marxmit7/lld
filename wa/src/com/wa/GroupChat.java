package wa.src.com.wa;


import java.util.HashSet;
import java.util.Set;

public class GroupChat extends Chat{
    Set<String> participants;
    Set<String> admins;

    public GroupChat(String chatId){
        super(chatId);
        this.participants = new HashSet<>();
        this.admins = new HashSet<>();
    }

    @Override
    public void addMessages(Message message){
        messages.add(message);
    }

    @Override
    public void addParticipant(String userId){
        participants.add(userId);
    }

    public void removeParticipant(String userId){
        if(participants.contains(userId))
            participants.remove(userId);

        if(admins.contains(userId))
            participants.remove(userId);
    }

    public void promoteToAdmin(String userId){
        if(!admins.contains(userId)) admins.add(userId);
    }

    public void demoteFromAdmin(String userId){
        if(admins.contains(userId))admins.remove(userId);
    }

    public boolean isAdmin(String userId){
        return admins.contains(userId);
    }
    
}