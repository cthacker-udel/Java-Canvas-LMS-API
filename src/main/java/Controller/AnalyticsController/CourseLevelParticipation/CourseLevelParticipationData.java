package Controller.AnalyticsController.CourseLevelParticipation;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseLevelParticipationData {

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("participations")
    @Expose
    private Integer participations;
    @SerializedName("views")
    @Expose
    private Integer views;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getParticipations() {
        return participations;
    }

    public void setParticipations(Integer participations) {
        this.participations = participations;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

}
