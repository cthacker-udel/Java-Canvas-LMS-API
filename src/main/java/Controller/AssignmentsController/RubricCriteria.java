package Controller.AssignmentsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RubricCriteria {

    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("learning_outcome_id")
    @Expose
    private String learningOutcomeId;
    @SerializedName("vendor_guid")
    @Expose
    private String vendorGuid;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("long_description")
    @Expose
    private String longDescription;
    @SerializedName("criterion_use_range")
    @Expose
    private Boolean criterionUseRange;
    @SerializedName("ratings")
    @Expose
    private Object ratings;
    @SerializedName("ignore_for_scoring")
    @Expose
    private Boolean ignoreForScoring;

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLearningOutcomeId() {
        return learningOutcomeId;
    }

    public void setLearningOutcomeId(String learningOutcomeId) {
        this.learningOutcomeId = learningOutcomeId;
    }

    public String getVendorGuid() {
        return vendorGuid;
    }

    public void setVendorGuid(String vendorGuid) {
        this.vendorGuid = vendorGuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Boolean getCriterionUseRange() {
        return criterionUseRange;
    }

    public void setCriterionUseRange(Boolean criterionUseRange) {
        this.criterionUseRange = criterionUseRange;
    }

    public Object getRatings() {
        return ratings;
    }

    public void setRatings(Object ratings) {
        this.ratings = ratings;
    }

    public Boolean getIgnoreForScoring() {
        return ignoreForScoring;
    }

    public void setIgnoreForScoring(Boolean ignoreForScoring) {
        this.ignoreForScoring = ignoreForScoring;
    }

}
