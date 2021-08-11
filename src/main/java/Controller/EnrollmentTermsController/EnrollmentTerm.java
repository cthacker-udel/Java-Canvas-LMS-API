package Controller.EnrollmentTermsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EnrollmentTerm {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sis_term_id")
    @Expose
    private String sisTermId;
    @SerializedName("sis_import_id")
    @Expose
    private Integer sisImportId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("end_at")
    @Expose
    private String endAt;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("overrides")
    @Expose
    private Overrides overrides;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSisTermId() {
        return sisTermId;
    }

    public void setSisTermId(String sisTermId) {
        this.sisTermId = sisTermId;
    }

    public Integer getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public Overrides getOverrides() {
        return overrides;
    }

    public void setOverrides(Overrides overrides) {
        this.overrides = overrides;
    }

}
