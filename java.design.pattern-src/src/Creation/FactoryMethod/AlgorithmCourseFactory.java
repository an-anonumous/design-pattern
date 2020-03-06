package Creation.FactoryMethod;

public class AlgorithmCourseFactory extends CourseFacroty {
    @Override
    public ICourse getCourse() {
        return new AlgorithmCourse();
    }
}
