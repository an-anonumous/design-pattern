package Creation.FactoryMethod;

public class Test {
    public static void main(String[] args) {
        CourseFacroty facroty=new JavaCourseFactory();
        ICourse course = facroty.getCourse();
        course.beginCourse();

        facroty=new PythonCourseFactory();
        course=facroty.getCourse();
        course.beginCourse();

        facroty=new AlgorithmCourseFactory();
        course=facroty.getCourse();
        course.beginCourse();
    }
}
