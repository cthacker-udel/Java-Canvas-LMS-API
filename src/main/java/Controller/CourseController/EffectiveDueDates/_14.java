package Controller.CourseController.EffectiveDueDates;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _14 {

    @SerializedName("due_at")
    @Expose
    private String dueAt;
    @SerializedName("grading_period_id")
    @Expose
    private Object gradingPeriodId;
    @SerializedName("in_closed_grading_period")
    @Expose
    private Boolean inClosedGradingPeriod;

    public String getDueAt() {
        return dueAt;
    }

    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }

    public Object getGradingPeriodId() {
        return gradingPeriodId;
    }

    public void setGradingPeriodId(Object gradingPeriodId) {
        this.gradingPeriodId = gradingPeriodId;
    }

    public Boolean getInClosedGradingPeriod() {
        return inClosedGradingPeriod;
    }

    public void setInClosedGradingPeriod(Boolean inClosedGradingPeriod) {
        this.inClosedGradingPeriod = inClosedGradingPeriod;
    }


}
