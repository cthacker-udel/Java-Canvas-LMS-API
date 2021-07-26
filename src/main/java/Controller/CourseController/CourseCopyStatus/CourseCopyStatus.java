package Controller.CourseController.CourseCopyStatus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseCopyStatus {

    @SerializedName("progress")
    @Expose
    private Integer progress;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("status_url")
    @Expose
    private String statusUrl;

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

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

    public String getStatusUrl() {
        return statusUrl;
    }

    public void setStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
    }


}
