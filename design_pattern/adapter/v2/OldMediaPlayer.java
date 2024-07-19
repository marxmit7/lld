package design_pattern.adapter.v2;

public class OldMediaPlayer{

    public OldMediaPlayer(){};

    public void playMp4(String fileName){
        System.out.println("playing mp4: "+fileName );
        
    }

    public void playVlc(String fileName){
        System.out.println("playing vlc: "+fileName);

    }
}