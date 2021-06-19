package Controller.AnalyticsController.UserInCourseParticipationData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserInCourseParticipationData {

    @SerializedName("page_views")
    @Expose
    private PageViews pageViews;
    @SerializedName("participations")
    @Expose
    private List<Participation> participations = null;

    public PageViews getPageViews() {
        return pageViews;
    }

    public void setPageViews(PageViews pageViews) {
        this.pageViews = pageViews;
    }

    public List<Participation> getParticipations() {
        return participations;
    }

    public void setParticipations(List<Participation> participations) {
        this.participations = participations;
    }


}
