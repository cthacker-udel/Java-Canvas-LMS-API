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

    }

}
