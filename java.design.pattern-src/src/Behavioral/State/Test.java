package Behavioral.State;

public class Test {
  //  public static void main(String[] args) {
  //    PlayerContext context = new PlayerContext();
  //    PlayerState state = new PlayingState();
  //
  //    context.setCurrState(state);
  //    state.setPlayerContext(context);
  //
  //    state.close();
  //    state = context.getCurrState();
  //    state.setPlayerContext(context);
  //    System.out.println(state);
  //
  //    state.play();
  //    state = context.getCurrState();
  //    state.setPlayerContext(context);
  //    System.out.println(state);
  //  }

  public static void main(String[] args) {
    PlayerContext context = new PlayerContext();
    PlayerState state = new PlayingState();
    context.setCurrState(state);

    state.play();
    System.out.println(state);

    state.speed();
    System.out.println(state);

    state.pause();
    System.out.println(state);

    state.close();
    System.out.println(state);
  }
}
