package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseProgress {

    @SerializedName("requirement_count")
    @Expose
    private Integer requirementCount;
    @SerializedName("requirement_completed_count")
    @Expose
    private Integer requirementCompletedCount;
    @SerializedName("next_requirement_url")
    @Expose
    private String nextRequirementUrl;
    @SerializedName("completed_at")
    @Expose
    private String completedAt;

    public Integer getRequirementCount() {
        return requirementCount;
    }

    public void setRequirementCount(Integer requirementCount) {
        this.requirementCount = requirementCount;
    }

    public Integer getRequirementCompletedCount() {
        return requirementCompletedCount;
    }

    public void setRequirementCompletedCount(Integer requirementCompletedCount) {
        this.requirementCompletedCount = requirementCompletedCount;
    }

    public String getNextRequirementUrl() {
        return nextRequirementUrl;
    }

    public void setNextRequirementUrl(String nextRequirementUrl) {
        this.nextRequirementUrl = nextRequirementUrl;
    }

    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }


}
