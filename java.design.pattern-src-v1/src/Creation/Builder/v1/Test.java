package Creation.Builder.v1;

public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        coach.setBuilder(new courseActualBuilder());
        Course course = coach.makeCourse("java从入门到放弃", "java从入门到放弃.ppt",
                "java从入门到放弃.video", "java从入门到放弃.jar", 56.0);
        System.out.println(course);
    }

}
