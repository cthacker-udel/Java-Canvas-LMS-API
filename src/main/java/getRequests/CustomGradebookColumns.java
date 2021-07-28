package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomGradebookColumns extends CanvasClient {

    private String courseId;
    private Boolean includeHidden;

    private String columnTitle;
    private Integer columnPosition;
    private Boolean hidden;
    private Boolean teacherNotes;
    private Boolean readOnly;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.columnTitle != null){
            queries.put("column[title]",this.columnTitle);
        }
        if(this.columnPosition != null){
            queries.put("column[position]",this.columnPosition);
        }
        if(this.hidden != null){
            queries.put("column[hidden]",this.hidden);
        }
        if(this.teacherNotes != null){
            queries.put("column[teacher_notes]",this.teacherNotes);
        }
        if(this.readOnly != null){
            queries.put("column[read_only]",this.readOnly);
        }
        if(this.includeHidden != null){
            queries.put("include_hidden",this.includeHidden);
        }
        return queries;

    }

    public void clearQueries(){

        this.includeHidden = null;
        this.columnTitle = null;
        this.columnPosition = null;
        this.hidden = null;
        this.teacherNotes = null;
        this.readOnly = null;

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
