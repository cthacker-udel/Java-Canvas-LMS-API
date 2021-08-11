package Controller.EnrollmentTermsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentEnrollment {

    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("end_at")
    @Expose
    private String endAt;

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
