package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExternalTool extends CanvasClient {

    private String courseId;
    private String exToolAccountId;
    private String groupId;

    private String searchTerm;
    private Boolean selectable;
    private Boolean include_parents;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.searchTerm != null){
            queries.put("search_term",this.searchTerm);
        }
        if(this.selectable != null){
            queries.put("selectable",this.selectable);
        }
        if(this.include_parents != null){
            queries.put("include_parents",this.include_parents);
        }
        return queries;

    }

    public void clearQueries(){

        this.searchTerm = null;
        this.selectable = null;
        this.include_parents = null;

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getExToolAccountId() {
        return exToolAccountId;
    }

    public void setExToolAccountId(String exToolAccountId) {
        this.exToolAccountId = exToolAccountId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public Boolean getInclude_parents() {
        return include_parents;
    }

    public void setInclude_parents(Boolean include_parents) {
        this.include_parents = include_parents;
    }
}
