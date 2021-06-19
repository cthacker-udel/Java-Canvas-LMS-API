package Controller.AnalyticsController.UserInCourseAssignmentData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Submission {

    @SerializedName("posted_at")
    @Expose
    private Object postedAt;
    @SerializedName("submitted_at")
    @Expose
    private String submittedAt;
    @SerializedName("score")
    @Expose
    private Integer score;

    public Object getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Object postedAt) {
        this.postedAt = postedAt;
    }

    public String getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


}
