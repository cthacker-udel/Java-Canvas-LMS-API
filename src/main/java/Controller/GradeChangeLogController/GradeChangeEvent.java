package Controller.GradeChangeLogController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GradeChangeEvent {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("event_type")
    @Expose
    private String eventType;
    @SerializedName("excused_after")
    @Expose
    private Boolean excusedAfter;
    @SerializedName("excused_before")
    @Expose
    private Boolean excusedBefore;
    @SerializedName("grade_after")
    @Expose
    private String gradeAfter;
    @SerializedName("grade_before")
    @Expose
    private String gradeBefore;
    @SerializedName("graded_anonymously")
    @Expose
    private Boolean gradedAnonymously;
    @SerializedName("version_number")
    @Expose
    private String versionNumber;
    @SerializedName("request_id")
    @Expose
    private String requestId;
    @SerializedName("links")
    @Expose
    private Object links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public Boolean getExcusedAfter() {
        return excusedAfter;
    }

    public void setExcusedAfter(Boolean excusedAfter) {
        this.excusedAfter = excusedAfter;
    }

    public Boolean getExcusedBefore() {
        return excusedBefore;
    }

    public void setExcusedBefore(Boolean excusedBefore) {
        this.excusedBefore = excusedBefore;
    }

    public String getGradeAfter() {
        return gradeAfter;
    }

    public void setGradeAfter(String gradeAfter) {
        this.gradeAfter = gradeAfter;
    }

    public String getGradeBefore() {
        return gradeBefore;
    }

    public void setGradeBefore(String gradeBefore) {
        this.gradeBefore = gradeBefore;
    }

    public Boolean getGradedAnonymously() {
        return gradedAnonymously;
    }

    public void setGradedAnonymously(Boolean gradedAnonymously) {
        this.gradedAnonymously = gradedAnonymously;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Object getLinks() {
        return links;
    }

    public void setLinks(Object links) {
        this.links = links;
    }


}
