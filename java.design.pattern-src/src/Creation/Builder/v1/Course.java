package Creation.Builder.v1;

public class Course {
    private String CourseName;//课程名
    private String CoursePPT;//课程ppt
    private String CourseVideo;//课程视频
    private String CourseCode;//课程源代码
    private Double duration;//课程时长

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCoursePPT() {
        return CoursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        CoursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return CourseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        CourseVideo = courseVideo;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "CourseName='" + CourseName + '\'' +
                ", CoursePPT='" + CoursePPT + '\'' +
                ", CourseVideo='" + CourseVideo + '\'' +
                ", CourseCode='" + CourseCode + '\'' +
                ", duration=" + duration +
                '}';
    }
}
