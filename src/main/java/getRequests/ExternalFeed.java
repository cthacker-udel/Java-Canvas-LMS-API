package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExternalFeed extends CanvasClient {

    private String courseId;
    private String groupId;
    private String url;
    private Boolean headerMatch;
    private String verbosity;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<String,Object>();

        if(this.url != null){
            queries.put("url",this.url);
        }
        if(this.headerMatch != null){
            queries.put("header_match",this.headerMatch);
        }
        if(this.verbosity != null){
            queries.put("verbosity",this.verbosity);
        }

        return queries;

    }

    public void clearQueries(){

        this.url = null;
        this.headerMatch = null;
        this.verbosity = null;

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getHeaderMatch() {
        return headerMatch;
    }

    public void setHeaderMatch(Boolean headerMatch) {
        this.headerMatch = headerMatch;
    }

    public String getVerbosity() {
        return verbosity;
    }

    public void setVerbosity(String verbosity) {
        this.verbosity = verbosity;
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
