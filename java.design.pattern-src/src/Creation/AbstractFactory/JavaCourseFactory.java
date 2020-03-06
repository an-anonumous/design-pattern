package Creation.AbstractFactory;

public class JavaCourseFactory implements IAbstarctFactory {
    @Override
    public CourseVideo getCourseVideo() {
        return new JavaCourseVideo();
    }

    @Override
    public CoursePPT getCoursePPT() {
        return new JavaCoursePPT();
    }
}
