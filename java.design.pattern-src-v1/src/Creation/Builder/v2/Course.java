package Creation.Builder.v2;

import Creation.AbstractFactory.CourseVideo;

public class Course {

    public Course(CourseBuilder builder) {
        this.CourseName = builder.CourseName;
        this.CoursePPT = builder.CoursePPT;
        this.CourseCode=builder.CourseCode;
        this.duration=builder.duration;
        this.CourseVideo=builder.CourseVideo;
    }

    private String CourseName;   //课程名
    private String CoursePPT;    //课程ppt
    private String CourseVideo;  //课程视频
    private String CourseCode;   //课程源代码
    private Double duration;     //课程时长

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

    public static class CourseBuilder {
        private String CourseName;   //课程名
        private String CoursePPT;    //课程ppt
        private String CourseVideo;  //课程视频
        private String CourseCode;   //课程源代码
        private Double duration;     //课程时长

        public CourseBuilder buildeCourseName(String courseName) {
            this.CourseName = courseName;
            return this;
        }

        public CourseBuilder buildeCoursePPT(String coursePPT) {
            this.CoursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildeCourseVideo(String courseVideo) {
            this.CourseVideo = courseVideo;
            return this;
        }

        public CourseBuilder buildeCourseCode(String courseCode) {
            this.CourseCode = courseCode;
            return this;
        }

        public CourseBuilder buildeDuration(Double duration) {
            this.duration = duration;
            return this;
        }

        public Course build() {
            return new Course(this);//调用Course的构造函数
        }
    }

}
