package Controller.GradeChangeLogController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GradeChangeEventLinks {

    @SerializedName("assignment")
    @Expose
    private Integer assignment;
    @SerializedName("course")
    @Expose
    private Integer course;
    @SerializedName("student")
    @Expose
    private Integer student;
    @SerializedName("grader")
    @Expose
    private Integer grader;
    @SerializedName("page_view")
    @Expose
    private String pageView;

    public Integer getAssignment() {
        return assignment;
    }

    public void setAssignment(Integer assignment) {
        this.assignment = assignment;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getStudent() {
        return student;
    }

    public void setStudent(Integer student) {
        this.student = student;
    }

    public Integer getGrader() {
        return grader;
    }

    public void setGrader(Integer grader) {
        this.grader = grader;
    }

    public String getPageView() {
        return pageView;
    }

    public void setPageView(String pageView) {
        this.pageView = pageView;
    }


}
