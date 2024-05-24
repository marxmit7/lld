package wa.src.com.wa;

import java.util.List;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        MessageService messageService = new MessageService();
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

        OneToOneChat amit_yash = ChatFactory.createChat("one-to-one", "chadId1", "userId1", "userId2");

        for (int i = 0; i < 20; i++) {
            Message message = MessageFactory.createMessage(getRandomMessageType());
            if (message instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) message;
                textMessage.setContent("message--> " + i, i % 2 == 0 ? amit.getName() : yash.getName());
                amit_yash.addMessages(textMessage);
            } else if (message instanceof AudioMessage) {
                AudioMessage audioMessage = (AudioMessage) message;
                audioMessage.setContent("message--> " + i, i % 2 == 0 ? amit.getName() : yash.getName());
                amit_yash.addMessages(audioMessage);
            } else if (message instanceof PhotoMessage) {
                PhotoMessage photoMessage = (PhotoMessage) message;
                photoMessage.setContent("message--> " + i, i % 2 == 0 ? amit.getName() : yash.getName());
                amit_yash.addMessages(photoMessage);
            } else if (message instanceof VideoMessage) {
                VideoMessage videoMessage = (VideoMessage) message;
                videoMessage.setContent("message--> " + i, i % 2 == 0 ? amit.getName() : yash.getName());
                amit_yash.addMessages(videoMessage);
            }

        }

        List<Message> messageList = amit_yash.getMessages();

        for (Message msg : messageList) {
            messageService.processMessage(msg);
        }
    }

    public static MessageType getRandomMessageType() {
        MessageType[] messageTypes = MessageType.values();
        int randomIndex = RANDOM.nextInt(messageTypes.length);
        return messageTypes[randomIndex];
    }

}