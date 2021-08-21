package Controller.ErrorReportController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorReport {

    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("user_perceived_severity")
    @Expose
    private String userPerceivedSeverity;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("context_asset_string")
    @Expose
    private String contextAssetString;
    @SerializedName("user_roles")
    @Expose
    private String userRoles;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getUserPerceivedSeverity() {
        return userPerceivedSeverity;
    }

    public void setUserPerceivedSeverity(String userPerceivedSeverity) {
        this.userPerceivedSeverity = userPerceivedSeverity;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getContextAssetString() {
        return contextAssetString;
    }

    public void setContextAssetString(String contextAssetString) {
        this.contextAssetString = contextAssetString;
    }

    public String getUserRoles() {
        return userRoles;
    }

    public void setUserRoles(String userRoles) {
        this.userRoles = userRoles;
    }

}
