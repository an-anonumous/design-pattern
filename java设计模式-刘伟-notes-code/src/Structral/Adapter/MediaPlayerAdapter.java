package Structral.Adapter;

public class MediaPlayerAdapter implements MediaPlayer {
    private Mp3Player mp3Player = new Mp3Player();
    private MP4Player mp4Player = new MP4Player();

    @Override
    public void play(String mediaType, String fileName) {
        if ("mp3".equalsIgnoreCase(mediaType)) {
            mp3Player.playMp3(fileName);
        } else if ("mp4".equalsIgnoreCase(mediaType)) {
            mp4Player.playMp4(fileName);
        }
    }
}
