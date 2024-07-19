package design_pattern.adapter.v2;

public class Main{
    public static void main(String[] args ){

        NewAudioPlayer audioPlayer = new NewAudioPlayer();

        audioPlayer.play("mp4", "hey hi.mp4");
        audioPlayer.play("mp3", "no hi.mp3");
        audioPlayer.play("vlc", "yes hi.vlc");
    }
}