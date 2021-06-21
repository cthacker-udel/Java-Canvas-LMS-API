package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class AssignmentExtensions extends CanvasClient {

    private Integer userId;
    private Integer extraAttempts;
    private Integer courseId;
    private Integer assignmentId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> body = new LinkedHashMap<>();
        if(userId != null){
            body.put("assignment_extensions[][user_id]",userId);
        }
        if(extraAttempts != null){
            body.put("assignment_extensions[][extra_attempts]",extraAttempts);
        }
        return body;

    }

    public void clearQueries(){
        this.userId = null;
        this.extraAttempts = null;
        this.courseId = null;
        this.assignmentId = null;
    }


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
}
