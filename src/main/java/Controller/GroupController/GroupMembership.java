package Controller.GroupController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupMembership {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("group_id")
    @Expose
    private Integer groupId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("moderator")
    @Expose
    private Boolean moderator;
    @SerializedName("just_created")
    @Expose
    private Boolean justCreated;
    @SerializedName("sis_import_id")
    @Expose
    private Integer sisImportId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
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

    public Boolean getModerator() {
        return moderator;
    }

    public void setModerator(Boolean moderator) {
        this.moderator = moderator;
    }

    public Boolean getJustCreated() {
        return justCreated;
    }

    public void setJustCreated(Boolean justCreated) {
        this.justCreated = justCreated;
    }

    public Integer getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }


}
