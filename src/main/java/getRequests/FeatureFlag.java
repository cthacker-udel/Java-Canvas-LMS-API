package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class FeatureFlag extends CanvasClient {

    private String courseId;
    private String featureFlagAccountId;
    private String userId;
    private String feature;
    private String state;


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.state != null){
            queries.put("state",this.state);
        }
        return queries;
    }

    public void clearQueries(){

        this.courseId = null;
        this.featureFlagAccountId = null;
        this.userId = null;
        this.feature = null;
        this.state = null;

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getFeatureFlagAccountId() {
        return featureFlagAccountId;
    }

    public void setFeatureFlagAccountId(String featureFlagAccountId) {
        this.featureFlagAccountId = featureFlagAccountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
}
