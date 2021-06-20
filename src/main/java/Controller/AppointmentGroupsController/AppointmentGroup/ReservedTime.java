package Controller.AppointmentGroupsController.AppointmentGroup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReservedTime {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("end_at")
    @Expose
    private String endAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

}
