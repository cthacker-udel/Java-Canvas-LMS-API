package Controller.AssignmentsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExternalToolTagAttributes {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("new_tab")
    @Expose
    private Boolean newTab;
    @SerializedName("resource_link_id")
    @Expose
    private String resourceLinkId;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getNewTab() {
        return newTab;
    }

    public void setNewTab(Boolean newTab) {
        this.newTab = newTab;
    }

    public String getResourceLinkId() {
        return resourceLinkId;
    }

    public void setResourceLinkId(String resourceLinkId) {
        this.resourceLinkId = resourceLinkId;
    }

}
