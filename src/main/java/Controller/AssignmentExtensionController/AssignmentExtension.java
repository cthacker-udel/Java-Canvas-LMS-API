package Controller.AssignmentExtensionController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AssignmentExtension {

    @SerializedName("assignment_id")
    @Expose
    private Integer assignmentId;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("extra_attempts")
    @Expose
    private Integer extraAttempts;

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExtraAttempts() {
        return extraAttempts;
    }

    public void setExtraAttempts(Integer extraAttempts) {
        this.extraAttempts = extraAttempts;
    }

}
