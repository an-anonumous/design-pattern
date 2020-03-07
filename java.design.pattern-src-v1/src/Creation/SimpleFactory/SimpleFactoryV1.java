package Creation.SimpleFactory;

public class SimpleFactoryV1 {
	
	public ICourse createCourse(String courseNameString) {
		ICourse course=null;

		if ("java".equalsIgnoreCase(courseNameString)) {
			course = new JavaCourse();
		}
		else if ("python".equalsIgnoreCase(courseNameString)) {
			course = new PythonCourse();
		}

		return course;
	}

}
