package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class AssignmentOverride extends CanvasClient {

    private ArrayList<Integer> studentIds = new ArrayList<>();
    private String title;
    private Integer groupId;
    private Integer courseSectionId;
    private ZonedDateTime dueAt;
    private ZonedDateTime unlockAt;
    private ZonedDateTime lockAt;
    private Integer courseId;
    private Integer assignmentId;
    private Integer assignmentOverrideId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.studentIds.size() > 0){
            queries.put("assignment_override[student_ids][]",this.studentIds.toArray(Integer[]::new));
        }
        if(this.title != null){
            queries.put("assignment_override[title]",this.title);
        }
        if(this.groupId != null){
            queries.put("assignment_override[group_id]",this.groupId);
        }
        if(this.courseSectionId != null){
            queries.put("assignment_override[course_section_id]",this.courseSectionId);
        }
        if(this.dueAt != null){
            queries.put("assignment_override[due_at]",this.dueAt);
        }
        if(this.unlockAt != null){
            queries.put("assignment_override[unlock_at]",this.unlockAt);
        }
        if(this.lockAt != null){
            queries.put("assignment_override[lock_at]",this.lockAt);
        }
        return queries;

    }

    public void clearQueries(){

        this.studentIds = new ArrayList<>();
        this.title = null;
        this.groupId = null;
        this.courseSectionId = null;
        this.dueAt = null;
        this.unlockAt = null;
        this.lockAt = null;

    }

    public Integer getAssignmentOverrideId() {
        return assignmentOverrideId;
    }

    public void setAssignmentOverrideId(Integer assignmentOverrideId) {
        this.assignmentOverrideId = assignmentOverrideId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public ArrayList<Integer> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(ArrayList<Integer> studentIds) {
        this.studentIds = studentIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public ZonedDateTime getDueAt() {
        return dueAt;
    }

    public void setDueAt(ZonedDateTime dueAt) {
        this.dueAt = dueAt;
    }

    public ZonedDateTime getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(ZonedDateTime unlockAt) {
        this.unlockAt = unlockAt;
    }

    public ZonedDateTime getLockAt() {
        return lockAt;
    }

    public void setLockAt(ZonedDateTime lockAt) {
        this.lockAt = lockAt;
    }
}
