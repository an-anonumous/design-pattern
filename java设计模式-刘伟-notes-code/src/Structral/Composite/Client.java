package Structral.Composite;

public class Client {
    public static void main(String[] args) {
        AbstractFile root = new Floder("root");
        root.add(new TextFile("九阴真经"));

        Floder f1 = new Floder("张学友歌曲");
        root.add(f1);
        f1.add(new VideoFile("一路上有你.mv"));
        f1.add(new VideoFile("想和你再去吹吹风.mv"));
        f1.add(new VideoFile("吻别.mv"));

        root.add(new ImageFile("小龙女"));

        root.killVirus();
    }
}
