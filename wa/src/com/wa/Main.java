package wa.src.com.wa;

public class Main{
    public static void main(String[] args){

        UserProfile userProfile = UserProfileBuilder.builder()
                                    .addName("amit")
                                    .addPhone("7004798230")
                                    .addProfilePicture("profilePic")
                                    .addUserId("userId1").build();

                                    


    }
}