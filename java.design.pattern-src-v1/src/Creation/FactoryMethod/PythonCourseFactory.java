package Creation.FactoryMethod;

public class PythonCourseFactory extends CourseFacroty {
    @Override
    public ICourse getCourse() {
        return new PythonCourse();
    }
}
