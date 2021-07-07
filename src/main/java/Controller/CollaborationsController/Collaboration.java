package Controller.CollaborationsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Collaboration {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("collaboration_type")
    @Expose
    private String collaborationType;
    @SerializedName("document_id")
    @Expose
    private String documentId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("context_id")
    @Expose
    private Integer contextId;
    @SerializedName("context_type")
    @Expose
    private String contextType;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("title")
    @Expose
    private Object title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("update_url")
    @Expose
    private Object updateUrl;
    @SerializedName("user_name")
    @Expose
    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCollaborationType() {
        return collaborationType;
    }

    public void setCollaborationType(String collaborationType) {
        this.collaborationType = collaborationType;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getContextId() {
        return contextId;
    }

    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(Object updateUrl) {
        this.updateUrl = updateUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
