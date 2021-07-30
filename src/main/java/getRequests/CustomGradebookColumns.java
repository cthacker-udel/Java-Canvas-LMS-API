package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
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
    private String customGradebookColumnId;
    private String userId;

    private Integer order;

    private ArrayList<Map<String,Object>> columnData = new ArrayList<>();

    private Integer columnId;
    private String content;

    public Map<String,Object> generateColumnDatum(){

        Map<String,Object> datum = new LinkedHashMap<>();
        if(this.columnId != null){
            datum.put("column_id",this.columnId);
        }
        if(this.content != null){
            datum.put("content",this.content);
        }
        if(this.userId != null){
            datum.put("user_id",this.userId);
        }
        return datum;

    }

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.columnData.size() > 0){
            queries.put("column_data",this.columnData.toArray(Object[]::new));
        }
        if(this.order != null){
            queries.put("order[]",this.order);
        }
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
        this.customGradebookColumnId = null;
        this.order = null;
        this.columnData = null;
        this.columnId = null;
        this.content = null;
        this.userId = null;

    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<Map<String, Object>> getColumnData() {
        return columnData;
    }

    public void setColumnData(ArrayList<Map<String, Object>> columnData) {
        this.columnData = columnData;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getColumnTitle() {
        return columnTitle;
    }

    public void setColumnTitle(String columnTitle) {
        this.columnTitle = columnTitle;
    }

    public Integer getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(Integer columnPosition) {
        this.columnPosition = columnPosition;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getTeacherNotes() {
        return teacherNotes;
    }

    public void setTeacherNotes(Boolean teacherNotes) {
        this.teacherNotes = teacherNotes;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getCustomGradebookColumnId() {
        return customGradebookColumnId;
    }

    public void setCustomGradebookColumnId(String customGradebookColumnId) {
        this.customGradebookColumnId = customGradebookColumnId;
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
