package Controller.ContentMigrationsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentMigration {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("migration_type")
    @Expose
    private String migrationType;
    @SerializedName("migration_type_title")
    @Expose
    private String migrationTypeTitle;
    @SerializedName("migration_issues_url")
    @Expose
    private String migrationIssuesUrl;
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
    @SerializedName("started_at")
    @Expose
    private String startedAt;
    @SerializedName("finished_at")
    @Expose
    private String finishedAt;
    @SerializedName("pre_attachment")
    @Expose
    private PreAttachment preAttachment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMigrationType() {
        return migrationType;
    }

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    public String getMigrationTypeTitle() {
        return migrationTypeTitle;
    }

    public void setMigrationTypeTitle(String migrationTypeTitle) {
        this.migrationTypeTitle = migrationTypeTitle;
    }

    public String getMigrationIssuesUrl() {
        return migrationIssuesUrl;
    }

    public void setMigrationIssuesUrl(String migrationIssuesUrl) {
        this.migrationIssuesUrl = migrationIssuesUrl;
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

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(String finishedAt) {
        this.finishedAt = finishedAt;
    }

    public PreAttachment getPreAttachment() {
        return preAttachment;
    }

    public void setPreAttachment(PreAttachment preAttachment) {
        this.preAttachment = preAttachment;
    }

}
