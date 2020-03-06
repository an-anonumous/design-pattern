package Behavioral.State;

public class SpeedState extends PlayerState {

  public SpeedState(PlayerContext playerContext) {
    super(playerContext);
  }

  public SpeedState() {}

  @Override
  public void play() {
    System.out.println("播放中");
  }

  @Override
  public void close() {
    System.out.println("关闭播放器");
    this.playerContext.setCurrState(PlayerContext.CLOSED_STATE);
  }

  @Override
  public void pause() {
    System.out.println("播放暂停");
    this.playerContext.setCurrState(PlayerContext.STOP_STATE);
  }

  @Override
  public void speed() {
    System.out.println("快进中");
    this.playerContext.setCurrState(PlayerContext.SPEED_STATE);
  }

  @Override
  public String toString() {
    return "加速播放";
  }
}
