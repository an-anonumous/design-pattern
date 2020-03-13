package Creational.Builder;

public class HeroBuilder extends IActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildsex() {
        actor.setGender("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("帥");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("鎧甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("飄逸");
    }
}
