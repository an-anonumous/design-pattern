package Behavioral.State;

public class PlayerContext {

  public static final PlayingState PLAYING_STATE = new PlayingState();
  public static final PausedState STOP_STATE = new PausedState();
  public static final ClosedState CLOSED_STATE = new ClosedState();
  public static final SpeedState SPEED_STATE = new SpeedState();

  protected PlayerState currState;

  public PlayerContext(PlayerState currState) {
    this.currState = currState;
  }

  public PlayerContext() {}

  public PlayerState getCurrState() {
    return currState;
  }

  public void setCurrState(PlayerState currState) {
    this.currState = currState;
    this.currState.setPlayerContext(this);
  }

  //  开始播放
  public void play() {
    this.currState.play();
  }

  //  关闭播放器
  public void close() {
    this.currState.close();
  }

  //  暂停
  public void pause() {
    this.currState.pause();
  }

  //  快进
  public void speed() {
    this.currState.speed();
  }
}
