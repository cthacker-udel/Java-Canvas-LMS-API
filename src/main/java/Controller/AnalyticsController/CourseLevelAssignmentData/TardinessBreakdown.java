package Controller.AnalyticsController.CourseLevelAssignmentData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TardinessBreakdown {

    @SerializedName("on_time")
    @Expose
    private Double onTime;
    @SerializedName("missing")
    @Expose
    private Double missing;
    @SerializedName("late")
    @Expose
    private Double late;
    @SerializedName("total")
    @Expose
    private Integer total;

    public Double getOnTime() {
        return onTime;
    }

    public void setOnTime(Double onTime) {
        this.onTime = onTime;
    }

    public Double getMissing() {
        return missing;
    }

    public void setMissing(Double missing) {
        this.missing = missing;
    }

    public Double getLate() {
        return late;
    }

    public void setLate(Double late) {
        this.late = late;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}
