package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Gradebook extends CanvasClient {

    private String courseId;
    private String gradebookDate;
    private String graderId;
    private String assignmentId;
    private Boolean ascending;


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.ascending != null){
            queries.put("ascending",this.ascending);
        }
        return queries;

    }

    public void clearQueries(){

        this.courseId =  null;
        this.gradebookDate = null;
        this.graderId = null;
        this.assignmentId = null;
        this.ascending = null;

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getGradebookDate() {
        return gradebookDate;
    }

    public void setGradebookDate(String gradebookDate) {
        this.gradebookDate = gradebookDate;
    }

    public String getGraderId() {
        return graderId;
    }

    public void setGraderId(String graderId) {
        this.graderId = graderId;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Boolean getAscending() {
        return ascending;
    }

    public void setAscending(Boolean ascending) {
        this.ascending = ascending;
    }
}
