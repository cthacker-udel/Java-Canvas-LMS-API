package Controller.AnalyticsController.UserInCourseParticipationData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Participation {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("url")
    @Expose
    private String url;

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
