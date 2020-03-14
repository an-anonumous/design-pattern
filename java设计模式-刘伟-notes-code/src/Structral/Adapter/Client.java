package Structral.Adapter;

public class Client {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayerAdapter();
        player.play("mp3", "一路上有你.mp3");
        player.play("mp4", "一我只在乎你-mv.mp4");
    }
}
