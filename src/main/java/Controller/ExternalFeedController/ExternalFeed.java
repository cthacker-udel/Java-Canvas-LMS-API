package Controller.ExternalFeedController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExternalFeed {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("header_match")
    @Expose
    private String headerMatch;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("verbosity")
    @Expose
    private String verbosity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHeaderMatch() {
        return headerMatch;
    }

    public void setHeaderMatch(String headerMatch) {
        this.headerMatch = headerMatch;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getVerbosity() {
        return verbosity;
    }

    public void setVerbosity(String verbosity) {
        this.verbosity = verbosity;
    }

}
