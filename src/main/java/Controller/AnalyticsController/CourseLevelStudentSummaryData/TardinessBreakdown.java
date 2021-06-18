package Controller.AnalyticsController.CourseLevelStudentSummaryData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TardinessBreakdown {

    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("on_time")
    @Expose
    private Integer onTime;
    @SerializedName("late")
    @Expose
    private Integer late;
    @SerializedName("missing")
    @Expose
    private Integer missing;
    @SerializedName("floating")
    @Expose
    private Integer floating;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getOnTime() {
        return onTime;
    }

    public void setOnTime(Integer onTime) {
        this.onTime = onTime;
    }

    public Integer getLate() {
        return late;
    }

    public void setLate(Integer late) {
        this.late = late;
    }

    public Integer getMissing() {
        return missing;
    }

    public void setMissing(Integer missing) {
        this.missing = missing;
    }

    public Integer getFloating() {
        return floating;
    }

    public void setFloating(Integer floating) {
        this.floating = floating;
    }

}
