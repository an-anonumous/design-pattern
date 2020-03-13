package Creational.Builder;

public abstract class IActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildsex();

    public abstract void buildFace();

    public abstract void buildCostume();

    public abstract void buildHairstyle();

    public Actor createActor() {
        return actor;
    }

    //    钩子方法
    public boolean hasHair() {
        return true;
    }


}
