package Behavioral.State;

public class PlayingState extends PlayerState {
  public PlayingState(PlayerContext playerContext) {
    super(playerContext);
  }

  public PlayingState() {}

  @Override
  public void play() {
    System.out.println("播放器已经再播放中");
  }

  @Override
  public void close() {
    System.out.println("播放器关闭");
    this.playerContext.setCurrState(PlayerContext.CLOSED_STATE);
  }

  @Override
  public void pause() {
    System.out.println("播放暂停");
    this.playerContext.setCurrState(PlayerContext.STOP_STATE);
  }

  @Override
  public void speed() {
    System.out.println("加速播放");
    this.playerContext.setCurrState(PlayerContext.SPEED_STATE);
  }

  @Override
  public String toString() {
    return "正在播放中";
  }
}
