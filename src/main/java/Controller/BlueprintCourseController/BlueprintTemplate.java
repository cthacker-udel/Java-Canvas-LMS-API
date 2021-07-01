package Controller.BlueprintCourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlueprintTemplate {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("course_id")
    @Expose
    private Integer courseId;
    @SerializedName("last_export_completed_at")
    @Expose
    private String lastExportCompletedAt;
    @SerializedName("associated_course_count")
    @Expose
    private Integer associatedCourseCount;
    @SerializedName("latest_migration")
    @Expose
    private Object latestMigration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getLastExportCompletedAt() {
        return lastExportCompletedAt;
    }

    public void setLastExportCompletedAt(String lastExportCompletedAt) {
        this.lastExportCompletedAt = lastExportCompletedAt;
    }

    public Integer getAssociatedCourseCount() {
        return associatedCourseCount;
    }

    public void setAssociatedCourseCount(Integer associatedCourseCount) {
        this.associatedCourseCount = associatedCourseCount;
    }

    public Object getLatestMigration() {
        return latestMigration;
    }

    public void setLatestMigration(Object latestMigration) {
        this.latestMigration = latestMigration;
    }

}
