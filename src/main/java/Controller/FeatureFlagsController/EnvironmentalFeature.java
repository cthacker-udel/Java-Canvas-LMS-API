package Controller.FeatureFlagsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnvironmentalFeature {

    @SerializedName("telepathic_navigation")
    @Expose
    private Boolean telepathicNavigation;
    @SerializedName("fancy_wickets")
    @Expose
    private Boolean fancyWickets;
    @SerializedName("automatic_essay_grading")
    @Expose
    private Boolean automaticEssayGrading;

    public Boolean getTelepathicNavigation() {
        return telepathicNavigation;
    }

    public void setTelepathicNavigation(Boolean telepathicNavigation) {
        this.telepathicNavigation = telepathicNavigation;
    }

    public Boolean getFancyWickets() {
        return fancyWickets;
    }

    public void setFancyWickets(Boolean fancyWickets) {
        this.fancyWickets = fancyWickets;
    }

    public Boolean getAutomaticEssayGrading() {
        return automaticEssayGrading;
    }

    public void setAutomaticEssayGrading(Boolean automaticEssayGrading) {
        this.automaticEssayGrading = automaticEssayGrading;
    }

}
