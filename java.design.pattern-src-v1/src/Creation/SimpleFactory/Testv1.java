package Creation.SimpleFactory;

public class Testv1 {

	public static void main(String[] args) {
		SimpleFactoryV1 factory = new SimpleFactoryV1();
		ICourse course = null;

		course = factory.createCourse("java");
		course.beginCourse();

		course = factory.createCourse("python");
		course.beginCourse();

	}

}
