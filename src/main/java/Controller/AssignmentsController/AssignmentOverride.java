package Controller.AssignmentsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AssignmentOverride {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("assignment_id")
    @Expose
    private Integer assignmentId;
    @SerializedName("student_ids")
    @Expose
    private List<Integer> studentIds = null;
    @SerializedName("group_id")
    @Expose
    private Integer groupId;
    @SerializedName("course_section_id")
    @Expose
    private Integer courseSectionId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("due_at")
    @Expose
    private String dueAt;
    @SerializedName("all_day")
    @Expose
    private Boolean allDay;
    @SerializedName("all_day_date")
    @Expose
    private String allDayDate;
    @SerializedName("unlock_at")
    @Expose
    private String unlockAt;
    @SerializedName("lock_at")
    @Expose
    private String lockAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public List<Integer> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Integer> studentIds) {
        this.studentIds = studentIds;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getCourseSectionId() {
        return courseSectionId;
    }

    public void setCourseSectionId(Integer courseSectionId) {
        this.courseSectionId = courseSectionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueAt() {
        return dueAt;
    }

    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }

    public Boolean getAllDay() {
        return allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    public String getAllDayDate() {
        return allDayDate;
    }

    public void setAllDayDate(String allDayDate) {
        this.allDayDate = allDayDate;
    }

    public String getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(String unlockAt) {
        this.unlockAt = unlockAt;
    }

    public String getLockAt() {
        return lockAt;
    }

    public void setLockAt(String lockAt) {
        this.lockAt = lockAt;
    }

}
