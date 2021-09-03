package Controller.FeatureFlagsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeatureFlag {

    @SerializedName("context_type")
    @Expose
    private String contextType;
    @SerializedName("context_id")
    @Expose
    private Integer contextId;
    @SerializedName("feature")
    @Expose
    private String feature;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("locked")
    @Expose
    private Boolean locked;

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Integer getContextId() {
        return contextId;
    }

    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

}
