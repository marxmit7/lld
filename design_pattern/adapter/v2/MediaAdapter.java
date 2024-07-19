package design_pattern.adapter.v2;

public class MediaAdapter implements NewMediaPlayer{
    private OldMediaPlayer oldMediaPlayer;

    public MediaAdapter(){
        this.oldMediaPlayer = new OldMediaPlayer();
    }

    @Override
    public void play(String audioType, String fileName){
        if("mp4".equalsIgnoreCase(audioType)){
            oldMediaPlayer.playMp4(fileName);
        } else if("vlc".equalsIgnoreCase(audioType)){
            oldMediaPlayer.playVlc(fileName);
        }
    }
}