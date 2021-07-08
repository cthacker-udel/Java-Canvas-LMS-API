package Controller.ContentExportsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentExport {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("export_type")
    @Expose
    private String exportType;
    @SerializedName("attachment")
    @Expose
    private Attachment attachment;
    @SerializedName("progress_url")
    @Expose
    private String progressUrl;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getProgressUrl() {
        return progressUrl;
    }

    public void setProgressUrl(String progressUrl) {
        this.progressUrl = progressUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

}
