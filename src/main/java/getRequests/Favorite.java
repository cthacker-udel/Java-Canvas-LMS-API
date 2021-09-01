package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Favorite extends CanvasClient {

    private String groupId;
    private String id;
    private String courseId;

    private Boolean excludeBlueprintCourses;


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.excludeBlueprintCourses != null){

            queries.put("exclude_blueprint_courses",this.excludeBlueprintCourses);

        }

        if(this.id != null){

            queries.put("id",this.id);

        }
        return queries;

    }

    public void clearQueries(){

        this.groupId = null;
        this.id = null;
        this.courseId = null;
        this.excludeBlueprintCourses = null;

    }

    public Boolean getExcludeBlueprintCourses() {
        return excludeBlueprintCourses;
    }

    public void setExcludeBlueprintCourses(Boolean excludeBlueprintCourses) {
        this.excludeBlueprintCourses = excludeBlueprintCourses;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
