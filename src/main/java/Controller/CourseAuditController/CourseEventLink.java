package Controller.CourseAuditController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseEventLink {

    @SerializedName("course")
    @Expose
    private Integer course;
    @SerializedName("user")
    @Expose
    private Integer user;
    @SerializedName("page_view")
    @Expose
    private String pageView;
    @SerializedName("copied_from")
    @Expose
    private Integer copiedFrom;
    @SerializedName("copied_to")
    @Expose
    private Integer copiedTo;
    @SerializedName("sis_batch")
    @Expose
    private Integer sisBatch;

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public String getPageView() {
        return pageView;
    }

    public void setPageView(String pageView) {
        this.pageView = pageView;
    }

    public Integer getCopiedFrom() {
        return copiedFrom;
    }

    public void setCopiedFrom(Integer copiedFrom) {
        this.copiedFrom = copiedFrom;
    }

    public Integer getCopiedTo() {
        return copiedTo;
    }

    public void setCopiedTo(Integer copiedTo) {
        this.copiedTo = copiedTo;
    }

    public Integer getSisBatch() {
        return sisBatch;
    }

    public void setSisBatch(Integer sisBatch) {
        this.sisBatch = sisBatch;
    }


}
