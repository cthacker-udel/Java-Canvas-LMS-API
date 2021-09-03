package Controller.FeatureFlagsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feature {

    @SerializedName("feature")
    @Expose
    private String feature;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("applies_to")
    @Expose
    private String appliesTo;
    @SerializedName("enable_at")
    @Expose
    private String enableAt;
    @SerializedName("feature_flag")
    @Expose
    private FeatureFlag featureFlag;
    @SerializedName("root_opt_in")
    @Expose
    private Boolean rootOptIn;
    @SerializedName("beta")
    @Expose
    private Boolean beta;
    @SerializedName("pending_enforcement")
    @Expose
    private Boolean pendingEnforcement;
    @SerializedName("autoexpand")
    @Expose
    private Boolean autoexpand;
    @SerializedName("release_notes_url")
    @Expose
    private String releaseNotesUrl;

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAppliesTo() {
        return appliesTo;
    }

    public void setAppliesTo(String appliesTo) {
        this.appliesTo = appliesTo;
    }

    public String getEnableAt() {
        return enableAt;
    }

    public void setEnableAt(String enableAt) {
        this.enableAt = enableAt;
    }

    public FeatureFlag getFeatureFlag() {
        return featureFlag;
    }

    public void setFeatureFlag(FeatureFlag featureFlag) {
        this.featureFlag = featureFlag;
    }

    public Boolean getRootOptIn() {
        return rootOptIn;
    }

    public void setRootOptIn(Boolean rootOptIn) {
        this.rootOptIn = rootOptIn;
    }

    public Boolean getBeta() {
        return beta;
    }

    public void setBeta(Boolean beta) {
        this.beta = beta;
    }

    public Boolean getPendingEnforcement() {
        return pendingEnforcement;
    }

    public void setPendingEnforcement(Boolean pendingEnforcement) {
        this.pendingEnforcement = pendingEnforcement;
    }

    public Boolean getAutoexpand() {
        return autoexpand;
    }

    public void setAutoexpand(Boolean autoexpand) {
        this.autoexpand = autoexpand;
    }

    public String getReleaseNotesUrl() {
        return releaseNotesUrl;
    }

    public void setReleaseNotesUrl(String releaseNotesUrl) {
        this.releaseNotesUrl = releaseNotesUrl;
    }

}
