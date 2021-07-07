package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Collaborations extends CanvasClient {

    private String courseId;
    private String groupId;
    private String collaborationId;

    private String include;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.include != null){
            queries.put("include[]",this.include);
        }




        return queries;

    }

    public void clearQueries() {
        this.include = null;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getCollaborationId() {
        return collaborationId;
    }

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
