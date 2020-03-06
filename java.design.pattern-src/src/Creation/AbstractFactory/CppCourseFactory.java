package Creation.AbstractFactory;

public class CppCourseFactory implements  IAbstarctFactory {
    @Override
    public CourseVideo getCourseVideo() {
        return new CppCourseVideo();
    }

    @Override
    public CoursePPT getCoursePPT() {
        return new CppCoursePPT();
    }
}
