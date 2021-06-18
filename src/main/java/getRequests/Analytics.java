package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Analytics extends CanvasClient {

    private Integer accountId;

    private Integer termId;

    private Integer courseId;

    private Boolean async;

    private String sortColumn;

    private String studentId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(async != null){
            queries.put("async",async);
        }
        if(sortColumn != null){
            queries.put("sort_column",this.sortColumn);
        }
        if(this.studentId != null){
            queries.put("student_id",this.studentId);
        }

        return queries;


    }

    public void clearQueries(){

        this.accountId = null;
        this.termId = null;
        this.async = null;
        this.sortColumn = null;
        this.studentId = null;

    }

    public Boolean getAsync() {
        return async;
    }

    public void setAsync(Boolean async) {
        this.async = async;
    }

    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getAccountId(){
        return this.accountId;
    }

    public Integer getTermId(){
        return this.termId;
    }

    public void setAccountId(Integer newAccountId){
        this.accountId = newAccountId;
    }

    public void setTermId(Integer newTermId){
        this.termId = newTermId;
    }

    
}