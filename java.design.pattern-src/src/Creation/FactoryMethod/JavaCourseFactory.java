package Creation.FactoryMethod;

public class JavaCourseFactory extends CourseFacroty{

    @Override
    public ICourse getCourse() {
        return new JavaCourse();
    }
}
