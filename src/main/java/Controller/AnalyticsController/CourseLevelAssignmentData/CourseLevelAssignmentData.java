package Controller.AnalyticsController.CourseLevelAssignmentData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseLevelAssignmentData {

    @SerializedName("assignment_id")
    @Expose
    private Integer assignmentId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("points_possible")
    @Expose
    private Integer pointsPossible;
    @SerializedName("due_at")
    @Expose
    private String dueAt;
    @SerializedName("unlock_at")
    @Expose
    private Object unlockAt;
    @SerializedName("muted")
    @Expose
    private Boolean muted;
    @SerializedName("min_score")
    @Expose
    private Integer minScore;
    @SerializedName("max_score")
    @Expose
    private Integer maxScore;
    @SerializedName("median")
    @Expose
    private Integer median;
    @SerializedName("first_quartile")
    @Expose
    private Integer firstQuartile;
    @SerializedName("third_quartile")
    @Expose
    private Integer thirdQuartile;
    @SerializedName("tardiness_breakdown")
    @Expose
    private TardinessBreakdown tardinessBreakdown;

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPointsPossible() {
        return pointsPossible;
    }

    public void setPointsPossible(Integer pointsPossible) {
        this.pointsPossible = pointsPossible;
    }

    public String getDueAt() {
        return dueAt;
    }

    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }

    public Object getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(Object unlockAt) {
        this.unlockAt = unlockAt;
    }

    public Boolean getMuted() {
        return muted;
    }

    public void setMuted(Boolean muted) {
        this.muted = muted;
    }

    public Integer getMinScore() {
        return minScore;
    }

    public void setMinScore(Integer minScore) {
        this.minScore = minScore;
    }

    public Integer getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(Integer maxScore) {
        this.maxScore = maxScore;
    }

    public Integer getMedian() {
        return median;
    }

    public void setMedian(Integer median) {
        this.median = median;
    }

    public Integer getFirstQuartile() {
        return firstQuartile;
    }

    public void setFirstQuartile(Integer firstQuartile) {
        this.firstQuartile = firstQuartile;
    }

    public Integer getThirdQuartile() {
        return thirdQuartile;
    }

    public void setThirdQuartile(Integer thirdQuartile) {
        this.thirdQuartile = thirdQuartile;
    }

    public TardinessBreakdown getTardinessBreakdown() {
        return tardinessBreakdown;
    }

    public void setTardinessBreakdown(TardinessBreakdown tardinessBreakdown) {
        this.tardinessBreakdown = tardinessBreakdown;
    }

}
