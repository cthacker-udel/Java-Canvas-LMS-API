package Controller.EnrollmentController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Grade {

    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("current_grade")
    @Expose
    private String currentGrade;
    @SerializedName("final_grade")
    @Expose
    private String finalGrade;
    @SerializedName("current_score")
    @Expose
    private String currentScore;
    @SerializedName("final_score")
    @Expose
    private String finalScore;
    @SerializedName("current_points")
    @Expose
    private Integer currentPoints;
    @SerializedName("unposted_current_grade")
    @Expose
    private String unpostedCurrentGrade;
    @SerializedName("unposted_final_grade")
    @Expose
    private String unpostedFinalGrade;
    @SerializedName("unposted_current_score")
    @Expose
    private String unpostedCurrentScore;
    @SerializedName("unposted_final_score")
    @Expose
    private String unpostedFinalScore;
    @SerializedName("unposted_current_points")
    @Expose
    private Integer unpostedCurrentPoints;

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public String getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(String finalGrade) {
        this.finalGrade = finalGrade;
    }

    public String getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(String currentScore) {
        this.currentScore = currentScore;
    }

    public String getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(String finalScore) {
        this.finalScore = finalScore;
    }

    public Integer getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(Integer currentPoints) {
        this.currentPoints = currentPoints;
    }

    public String getUnpostedCurrentGrade() {
        return unpostedCurrentGrade;
    }

    public void setUnpostedCurrentGrade(String unpostedCurrentGrade) {
        this.unpostedCurrentGrade = unpostedCurrentGrade;
    }

    public String getUnpostedFinalGrade() {
        return unpostedFinalGrade;
    }

    public void setUnpostedFinalGrade(String unpostedFinalGrade) {
        this.unpostedFinalGrade = unpostedFinalGrade;
    }

    public String getUnpostedCurrentScore() {
        return unpostedCurrentScore;
    }

    public void setUnpostedCurrentScore(String unpostedCurrentScore) {
        this.unpostedCurrentScore = unpostedCurrentScore;
    }

    public String getUnpostedFinalScore() {
        return unpostedFinalScore;
    }

    public void setUnpostedFinalScore(String unpostedFinalScore) {
        this.unpostedFinalScore = unpostedFinalScore;
    }

    public Integer getUnpostedCurrentPoints() {
        return unpostedCurrentPoints;
    }

    public void setUnpostedCurrentPoints(Integer unpostedCurrentPoints) {
        this.unpostedCurrentPoints = unpostedCurrentPoints;
    }

}
