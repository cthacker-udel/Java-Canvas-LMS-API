package Controller.BlueprintCourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExceptionRecord {

    @SerializedName("course_id")
    @Expose
    private Integer courseId;
    @SerializedName("conflicting_changes")
    @Expose
    private List<String> conflictingChanges = null;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public List<String> getConflictingChanges() {
        return conflictingChanges;
    }

    public void setConflictingChanges(List<String> conflictingChanges) {
        this.conflictingChanges = conflictingChanges;
    }

}
