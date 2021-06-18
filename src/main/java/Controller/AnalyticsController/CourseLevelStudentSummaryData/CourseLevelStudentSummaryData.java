package Controller.AnalyticsController.CourseLevelStudentSummaryData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseLevelStudentSummaryData {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("page_views")
    @Expose
    private Integer pageViews;
    @SerializedName("page_views_level")
    @Expose
    private String pageViewsLevel;
    @SerializedName("max_page_view")
    @Expose
    private Integer maxPageView;
    @SerializedName("participations")
    @Expose
    private Integer participations;
    @SerializedName("participations_level")
    @Expose
    private String participationsLevel;
    @SerializedName("max_participations")
    @Expose
    private Integer maxParticipations;
    @SerializedName("tardiness_breakdown")
    @Expose
    private TardinessBreakdown tardinessBreakdown;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPageViews() {
        return pageViews;
    }

    public void setPageViews(Integer pageViews) {
        this.pageViews = pageViews;
    }

    public String getPageViewsLevel() {
        return pageViewsLevel;
    }

    public void setPageViewsLevel(String pageViewsLevel) {
        this.pageViewsLevel = pageViewsLevel;
    }

    public Integer getMaxPageView() {
        return maxPageView;
    }

    public void setMaxPageView(Integer maxPageView) {
        this.maxPageView = maxPageView;
    }

    public Integer getParticipations() {
        return participations;
    }

    public void setParticipations(Integer participations) {
        this.participations = participations;
    }

    public String getParticipationsLevel() {
        return participationsLevel;
    }

    public void setParticipationsLevel(String participationsLevel) {
        this.participationsLevel = participationsLevel;
    }

    public Integer getMaxParticipations() {
        return maxParticipations;
    }

    public void setMaxParticipations(Integer maxParticipations) {
        this.maxParticipations = maxParticipations;
    }

    public TardinessBreakdown getTardinessBreakdown() {
        return tardinessBreakdown;
    }

    public void setTardinessBreakdown(TardinessBreakdown tardinessBreakdown) {
        this.tardinessBreakdown = tardinessBreakdown;
    }


}
