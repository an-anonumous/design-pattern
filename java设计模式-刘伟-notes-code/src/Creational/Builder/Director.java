package Creational.Builder;

public class Director {


    public Actor construct(IActorBuilder builder) {
        builder.buildType();
        builder.buildFace();
        builder.buildsex();
        builder.buildCostume();

//        恶魔没有头发
        if (builder.hasHair()) {
            builder.buildHairstyle();
        }

        return builder.createActor();
    }
}
