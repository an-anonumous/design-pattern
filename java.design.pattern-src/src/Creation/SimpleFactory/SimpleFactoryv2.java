package Creation.SimpleFactory;

public class SimpleFactoryv2 {
	
	public ICourse createCourse(Class c) {
		ICourse course = null;

		try {
			course = (ICourse) Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return course;

	}

}
