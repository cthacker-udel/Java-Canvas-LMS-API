package Controller.ExternalToolsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VisibleCourseNavTools {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("context_id")
    @Expose
    private Integer contextId;
    @SerializedName("context_name")
    @Expose
    private String contextName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getContextId() {
        return contextId;
    }

    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

}
