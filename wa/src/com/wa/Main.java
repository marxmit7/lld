package wa.src.com.wa;


import java.util.List;

public class Main{
    public static void main(String[] args){

        UserProfile amit = UserProfileBuilder.builder()
                                    .addName("amit")
                                    .addPhone("7004798230")
                                    .addProfilePicture("profilePic")
                                    .addUserId("userId1").build();

    
        UserProfile yash = UserProfileBuilder.builder()
                                    .addName("yash")
                                    .addPhone("7004798230")
                                    .addProfilePicture("profilePic")
                                    .addUserId("userId2").build();


        OneToOneChat amit_yash = (OneToOneChat)ChatFactory.createChat("one-to-one", "chadId1", "userId1","userId2");

        MessageService  messageService = new MessageService();

        for(int i=0;i<20;i++){
            TextMessage textMessage = new TextMessage();

            if(i%2==0)
                textMessage.setContent(i+"_message",amit.getName());
            else 
                textMessage.setContent(i+"_message",yash.getName());

            amit_yash.addMessages(textMessage);
        }

        List<Message> messageList = amit_yash.getMessages();

        for(Message msg : messageList){

            messageService.processMessage(msg);

        }
    }
}