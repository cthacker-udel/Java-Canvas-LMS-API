package Controller.BlueprintCourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlueprintMigration {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("template_id")
    @Expose
    private Integer templateId;
    @SerializedName("subscription_id")
    @Expose
    private Integer subscriptionId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("exports_started_at")
    @Expose
    private String exportsStartedAt;
    @SerializedName("imports_queued_at")
    @Expose
    private String importsQueuedAt;
    @SerializedName("imports_completed_at")
    @Expose
    private String importsCompletedAt;
    @SerializedName("comment")
    @Expose
    private String comment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Integer subscriptionId) {
        this.subscriptionId = subscriptionId;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getExportsStartedAt() {
        return exportsStartedAt;
    }

    public void setExportsStartedAt(String exportsStartedAt) {
        this.exportsStartedAt = exportsStartedAt;
    }

    public String getImportsQueuedAt() {
        return importsQueuedAt;
    }

    public void setImportsQueuedAt(String importsQueuedAt) {
        this.importsQueuedAt = importsQueuedAt;
    }

    public String getImportsCompletedAt() {
        return importsCompletedAt;
    }

    public void setImportsCompletedAt(String importsCompletedAt) {
        this.importsCompletedAt = importsCompletedAt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }


}
