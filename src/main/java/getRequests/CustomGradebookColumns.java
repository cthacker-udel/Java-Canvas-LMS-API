package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomGradebookColumns extends CanvasClient {

    private String courseId;
    private Boolean includeHidden;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.includeHidden != null){
            queries.put("include_hidden",this.includeHidden);
        }
        return queries;

    }

    public void clearQueries(){

        this.includeHidden = null;

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public Boolean getIncludeHidden() {
        return includeHidden;
    }

    public void setIncludeHidden(Boolean includeHidden) {
        this.includeHidden = includeHidden;
    }
}
