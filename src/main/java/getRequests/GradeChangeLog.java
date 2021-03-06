package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class GradeChangeLog extends CanvasClient {

    private String assignmentId;
    private String courseId;
    private String studentId;
    private String graderId;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.assignmentId != null){
            queries.put("assignment_id",this.assignmentId);
        }
        if(this.courseId != null) {
            queries.put("course_id", this.courseId);
        }
        if(this.studentId != null){
            queries.put("student_id",this.studentId);
        }
        if(this.graderId != null){
            queries.put("grader_id",this.graderId);
        }
        if(this.startTime != null){
            queries.put("start_time",this.startTime);
        }
        if(this.endTime != null){
            queries.put("end_time",this.endTime);
        }
        return queries;
    }

    public void clearQueries(){

        this.courseId = null;
        this.assignmentId = null;
        this.studentId = null;
        this.graderId = null;
        this.startTime = null;
        this.endTime = null;

    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getGraderId() {
        return graderId;
    }

    public void setGraderId(String graderId) {
        this.graderId = graderId;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }
}
