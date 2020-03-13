package Creational.Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Actor actor = director.construct(new AngleBuilder());
        System.out.println(actor);
    }
}
