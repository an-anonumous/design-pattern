package Creation.Builder.v1;

public abstract class CourseAbstarctBuilder {

    public abstract void buildeCourseName(String courseName);
    public abstract void buildeCoursePPT(String coursePPT);
    public abstract  void buildeCourseVideo(String courseVideo);
    public abstract void buildeCourseCode(String courseCode);
    public abstract void buildeDuration(Double duration);

    public abstract Course makeCourse();

}
