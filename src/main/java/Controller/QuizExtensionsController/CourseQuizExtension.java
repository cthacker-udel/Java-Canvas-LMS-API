package Controller.QuizExtensionsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseQuizExtension {

    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("extra_attempts")
    @Expose
    private Integer extraAttempts;
    @SerializedName("extra_time")
    @Expose
    private Integer extraTime;
    @SerializedName("manually_unlocked")
    @Expose
    private Boolean manuallyUnlocked;
    @SerializedName("end_at")
    @Expose
    private String endAt;

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

    public Integer getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(Integer extraTime) {
        this.extraTime = extraTime;
    }

    public Boolean getManuallyUnlocked() {
        return manuallyUnlocked;
    }

    public void setManuallyUnlocked(Boolean manuallyUnlocked) {
        this.manuallyUnlocked = manuallyUnlocked;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }


}
