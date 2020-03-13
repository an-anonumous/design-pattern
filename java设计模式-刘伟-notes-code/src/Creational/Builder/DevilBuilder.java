package Creational.Builder;

public class DevilBuilder extends IActorBuilder {
    @Override
    public void buildType() {
        actor.setType("惡魔");
    }

    @Override
    public void buildsex() {
        actor.setGender("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("奇醜無比");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHairstyle("光頭");
    }
}
