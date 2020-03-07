package Creation.Builder.v1;

public class courseActualBuilder extends CourseAbstarctBuilder {

    private  Course course=new Course();

    public void buildeCourseName(String courseName) {
        course.setCourseName(courseName);
    }

    public void buildeCoursePPT(String coursePPT) {
        course.setCoursePPT(coursePPT);
    }

    public void buildeCourseVideo(String courseVideo) {
        course.setCourseVideo(courseVideo);
    }

    public void buildeCourseCode(String courseCode) {
        course.setCourseCode(courseCode);
    }

    @Override
    public Course makeCourse() {
        return course;
    }

    public void buildeDuration(Double duration) {
        course.setDuration(duration);
    }
}
