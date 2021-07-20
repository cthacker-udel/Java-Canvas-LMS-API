package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class QuizExtension extends CanvasClient {

    private String quizExtensionCourseId;
    private String userId;
    private Integer extraAttempts;
    private Integer extraTime;
    private Boolean manuallyUnlocked;
    private Integer extendFromNow;
    private Integer extendFromEndAt;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.userId != null){
            queries.put("user_id",this.userId);
        }
        if(this.extraAttempts != null){
            queries.put("extra_attempts",this.extraAttempts);
        }
        if(this.extraTime != null){
            queries.put("extra_time",this.extraTime);
        }
        if(this.manuallyUnlocked != null){
            queries.put("manually_unlocked",this.manuallyUnlocked);
        }
        if(this.extendFromNow != null){
            queries.put("extend_from_now",this.extendFromNow);
        }
        if(this.extendFromEndAt != null){
            queries.put("extend_from_end_at",this.extendFromEndAt);
        }
        return queries;

    }

    public void clearQueries(){

        this.userId = null;
        this.extraAttempts = null;
        this.extraTime = null;
        this.manuallyUnlocked = null;
        this.extendFromNow = null;
        this.extendFromEndAt = null;

    }

    public String getQuizExtensionCourseId() {
        return quizExtensionCourseId;
    }

    public void setQuizExtensionCourseId(String quizExtensionCourseId) {
        this.quizExtensionCourseId = quizExtensionCourseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
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

    public Integer getExtendFromNow() {
        return extendFromNow;
    }

    public void setExtendFromNow(Integer extendFromNow) {
        this.extendFromNow = extendFromNow;
    }

    public Integer getExtendFromEndAt() {
        return extendFromEndAt;
    }

    public void setExtendFromEndAt(Integer extendFromEndAt) {
        this.extendFromEndAt = extendFromEndAt;
    }
}
