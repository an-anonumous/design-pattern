package Creation.AbstractFactory;

public class JavaCourseVideo extends CourseVideo {
    @Override
    public void produceVideoBytesStream() {
        System.out.println("java视频流");
    }
}
