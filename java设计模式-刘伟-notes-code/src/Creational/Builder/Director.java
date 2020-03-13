package Creational.Builder;

public class Director {


    public Actor construct(IActorBuilder builder) {
        builder.buildType();
        builder.buildFace();
        builder.buildsex();
        builder.buildCostume();
        builder.buildHairstyle();
        return builder.createActor();
    }
}
