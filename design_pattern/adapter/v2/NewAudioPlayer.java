package design_pattern.adapter.v2;

public class NewAudioPlayer implements NewMediaPlayer{
    private MediaAdapter mediaAdapter;

    public NewAudioPlayer(){
        this.mediaAdapter = new MediaAdapter();
    }

    @Override
    public void play(String audioType, String fileName){

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing mp3: "+fileName);
        } else {
            mediaAdapter.play(audioType,fileName);
        }
    }
}

