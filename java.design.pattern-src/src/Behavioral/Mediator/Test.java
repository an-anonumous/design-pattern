package Behavioral.Mediator;

public class Test {

  public static void main(String[] args) {
    User 熊大 = new User("熊大");
    User 张麻子 = new User("张麻子");

    张麻子.sendMessage("打劫");
    熊大.sendMessage("吃俺老孙一棒");
  }
}
