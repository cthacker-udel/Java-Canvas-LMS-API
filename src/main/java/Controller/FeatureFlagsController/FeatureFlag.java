package Controller.FeatureFlagsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FeatureFlag {

    @SerializedName("feature")
    @Expose
    private String feature;
    @SerializedName("state")
    @Expose
    private String state;

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

}
