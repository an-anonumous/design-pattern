package Behavioral.State;

public class ClosedState extends PlayerState {

  public ClosedState(PlayerContext playerContext) {
    super(playerContext);
  }

  public ClosedState() {}

  @Override
  public void play() {
    System.out.println("开始播放视频");
    this.playerContext.setCurrState(PlayerContext.PLAYING_STATE);
  }

  @Override
  public void close() {
    System.out.println("播放器已经关闭，不能再关闭");
  }

  @Override
  public void pause() {
    System.out.println("播放器已经关闭，无法暂停");
  }

  @Override
  public void speed() {
    System.out.println("播放器已经关闭，不能加速");
  }

  @Override
  public String toString() {
    return "播放器已经关闭";
  }
}
