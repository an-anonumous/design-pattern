package Creation.Builder.v1;

public class Coach {
    CourseAbstarctBuilder builder=null;

    public void setBuilder(CourseAbstarctBuilder builder) {
        this.builder = builder;
    }

//    private String CourseName;//课程名
//    private String CoursePPT;//课程ppt
//    private String CourseVideo;//课程视频
//    private String CourseCode;//课程源代码
//    private Double duration;//课程时长

    public Course makeCourse(String CourseName,String CoursePPT,String CourseVideo,String CourseCode, Double duration)
    {
        builder.buildeCourseName(CourseName);
        builder.buildeCourseCode(CourseCode);
        builder.buildeCoursePPT(CoursePPT);
        builder.buildeCourseVideo(CourseVideo);
        builder.buildeDuration(duration);

    return builder.makeCourse();
    }
}
