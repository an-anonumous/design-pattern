package Creation.Builder.v2;

public class Test {

  public static void main(String[] args) {
    Course.CourseBuilder builder = new Course.CourseBuilder();
    builder
        .buildeCourseCode("C++從入門到放棄.cpp")
        .buildeCourseName("C++從入門到放棄")
        .buildeCoursePPT("C++從入門到放棄.PPT")
        .buildeCourseVideo("C++從入門到放棄.mp4")
        .buildeDuration(12.36);
    Course course = builder.build();
    System.out.println(course);
  }
}
