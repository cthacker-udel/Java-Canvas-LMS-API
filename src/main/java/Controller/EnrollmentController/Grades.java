package Controller.EnrollmentController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Grades {

    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("current_score")
    @Expose
    private Integer currentScore;
    @SerializedName("current_grade")
    @Expose
    private Object currentGrade;
    @SerializedName("final_score")
    @Expose
    private Double finalScore;
    @SerializedName("final_grade")
    @Expose
    private Object finalGrade;

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Integer getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(Integer currentScore) {
        this.currentScore = currentScore;
    }

    public Object getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(Object currentGrade) {
        this.currentGrade = currentGrade;
    }

    public Double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Double finalScore) {
        this.finalScore = finalScore;
    }

    public Object getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(Object finalGrade) {
        this.finalGrade = finalGrade;
    }


}
