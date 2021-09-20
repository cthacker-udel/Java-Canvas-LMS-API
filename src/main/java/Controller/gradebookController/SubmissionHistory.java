package Controller.gradebookController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubmissionHistory {

    @SerializedName("submission_id")
    @Expose
    private Integer submissionId;
    @SerializedName("versions")
    @Expose
    private Object versions;

    public Integer getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(Integer submissionId) {
        this.submissionId = submissionId;
    }

    public Object getVersions() {
        return versions;
    }

    public void setVersions(Object versions) {
        this.versions = versions;
    }

}
