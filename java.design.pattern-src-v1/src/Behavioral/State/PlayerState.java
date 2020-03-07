package Behavioral.State;

public abstract class PlayerState {

  protected PlayerContext playerContext;

  public PlayerState(PlayerContext playerContext) {
    this.playerContext = playerContext;
  }

  public PlayerState() {}

  public PlayerContext getPlayerContext() {
    return playerContext;
  }

  public void setPlayerContext(PlayerContext playerContext) {
    this.playerContext = playerContext;
  }

  //  开始播放
  public abstract void play();

  //  关闭播放器
  public abstract void close();

  //  暂停
  public abstract void pause();

  //  快进
  public abstract void speed();
}
