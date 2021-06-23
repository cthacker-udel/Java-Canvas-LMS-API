package Controller.AssignmentsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NeedsGradingCount {

    @SerializedName("section_id")
    @Expose
    private String sectionId;
    @SerializedName("needs_grading_count")
    @Expose
    private Integer needsGradingCount;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getNeedsGradingCount() {
        return needsGradingCount;
    }

    public void setNeedsGradingCount(Integer needsGradingCount) {
        this.needsGradingCount = needsGradingCount;
    }


}
