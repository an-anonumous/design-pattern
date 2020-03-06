package Creation.SimpleFactory;

public class TestV2 {

	public static void main(String[] args) {
		SimpleFactoryv2 factory = new SimpleFactoryv2();

		ICourse course = factory.createCourse(JavaCourse.class);
		course.beginCourse();

		course = factory.createCourse(PythonCourse.class);
		course.beginCourse();
	}

}
