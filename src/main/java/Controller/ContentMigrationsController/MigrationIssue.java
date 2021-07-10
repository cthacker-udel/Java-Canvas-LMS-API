package Controller.ContentMigrationsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MigrationIssue {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("content_migration_url")
    @Expose
    private String contentMigrationUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("fix_issue_html_url")
    @Expose
    private String fixIssueHtmlUrl;
    @SerializedName("issue_type")
    @Expose
    private String issueType;
    @SerializedName("error_report_html_url")
    @Expose
    private String errorReportHtmlUrl;
    @SerializedName("error_message")
    @Expose
    private String errorMessage;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContentMigrationUrl() {
        return contentMigrationUrl;
    }

    public void setContentMigrationUrl(String contentMigrationUrl) {
        this.contentMigrationUrl = contentMigrationUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public String getFixIssueHtmlUrl() {
        return fixIssueHtmlUrl;
    }

    public void setFixIssueHtmlUrl(String fixIssueHtmlUrl) {
        this.fixIssueHtmlUrl = fixIssueHtmlUrl;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getErrorReportHtmlUrl() {
        return errorReportHtmlUrl;
    }

    public void setErrorReportHtmlUrl(String errorReportHtmlUrl) {
        this.errorReportHtmlUrl = errorReportHtmlUrl;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
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

}
