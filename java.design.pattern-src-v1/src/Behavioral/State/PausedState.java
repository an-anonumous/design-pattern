package Behavioral.State;

public class PausedState extends PlayerState {

  public PausedState(PlayerContext playerContext) {
    super(playerContext);
  }

  public PausedState() {
    System.out.println("播放已经暂停");
  }

  @Override
  public void play() {
    System.out.println("开始播放");
    this.playerContext.setCurrState(PlayerContext.PLAYING_STATE);
  }

  @Override
  public void close() {
    System.out.println("播放器已经关闭");
    this.playerContext.setCurrState(PlayerContext.CLOSED_STATE);
  }

  @Override
  public void pause() {
    System.out.println("暂停");
    this.playerContext.setCurrState(PlayerContext.STOP_STATE);
  }

  @Override
  public void speed() {
    System.out.println("加速播放");
    this.playerContext.setCurrState(PlayerContext.SPEED_STATE);
  }

  @Override
  public String toString() {
    return "暂停状态";
  }
}
