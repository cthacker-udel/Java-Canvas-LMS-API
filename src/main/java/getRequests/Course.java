package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Course extends CanvasClient {

    private String enrollmentType;
    private String enrollmentRole;
    private Integer enrollmentRoleId;
    private String enrollmentState;
    private Boolean excludeBlueprintCourses;
    private String include;
    private String state;
    private String userId;
    private Boolean homeroom;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.enrollmentType != null){
            queries.put("enrollment_type",this.enrollmentType);
        }
        if(this.enrollmentRole != null){
            queries.put("enrollment_role",this.enrollmentRole);
        }
        if(this.enrollmentRoleId != null){
            queries.put("enrollment_role_id",this.enrollmentRoleId);
        }
        if(this.enrollmentState != null){
            queries.put("enrollment_state",this.enrollmentState);
        }
        if(this.excludeBlueprintCourses != null){
            queries.put("exclude_blueprint_courses",this.excludeBlueprintCourses);
        }
        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.state != null){
            queries.put("state[]",this.state);
        }
        if(this.homeroom != null){
            queries.put("homeroom",this.homeroom);
        }
        return queries;

    }

    public void clearQueries(){

        this.enrollmentType = null;
        this.enrollmentRole = null;
        this.enrollmentRoleId = null;
        this.enrollmentState = null;
        this.excludeBlueprintCourses = null;
        this.include = null;
        this.state = null;
        this.homeroom = null;
        this.userId = null;

    }

    public String getEnrollmentType() {
        return enrollmentType;
    }

    public void setEnrollmentType(String enrollmentType) {
        this.enrollmentType = enrollmentType;
    }

    public String getEnrollmentRole() {
        return enrollmentRole;
    }

    public void setEnrollmentRole(String enrollmentRole) {
        this.enrollmentRole = enrollmentRole;
    }

    public Integer getEnrollmentRoleId() {
        return enrollmentRoleId;
    }

    public void setEnrollmentRoleId(Integer enrollmentRoleId) {
        this.enrollmentRoleId = enrollmentRoleId;
    }

    public String getEnrollmentState() {
        return enrollmentState;
    }

    public void setEnrollmentState(String enrollmentState) {
        this.enrollmentState = enrollmentState;
    }

    public Boolean getExcludeBlueprintCourses() {
        return excludeBlueprintCourses;
    }

    public void setExcludeBlueprintCourses(Boolean excludeBlueprintCourses) {
        this.excludeBlueprintCourses = excludeBlueprintCourses;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
