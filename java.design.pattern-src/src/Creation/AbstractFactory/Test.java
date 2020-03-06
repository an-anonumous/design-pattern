package Creation.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        IAbstarctFactory factory=new JavaCourseFactory();
        CourseVideo video = factory.getCourseVideo();
        CoursePPT ppt = factory.getCoursePPT();
        video.produceVideoBytesStream();
        ppt.produceCoursePPTBytesstream();

        factory=new CppCourseFactory();
        ppt=factory.getCoursePPT();
        video=factory.getCourseVideo();
        video.produceVideoBytesStream();
        ppt.produceCoursePPTBytesstream();

    }
}
