package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExternalFeed extends CanvasClient {

    private String courseId;
    private String groupId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<String,Object>();



        return null;

    }

    public void clearQueries(){


    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
