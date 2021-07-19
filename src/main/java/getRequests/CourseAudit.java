package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class CourseAudit extends CanvasClient {

    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private String courseId;
    private String courseAuditAccountId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.startTime != null){
            queries.put("start_time",this.startTime);
        }
        if(this.endTime != null){
            queries.put("end_time",this.endTime);
        }
        return queries;
    }

    public void clearQueries(){

        this.startTime = null;
        this.endTime = null;

    }

    public String getCourseAuditAccountId() {
        return courseAuditAccountId;
    }

    public void setCourseAuditAccountId(String courseAuditAccountId) {
        this.courseAuditAccountId = courseAuditAccountId;
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

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
