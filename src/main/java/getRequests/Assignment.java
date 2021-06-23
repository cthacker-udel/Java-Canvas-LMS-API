package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment extends CanvasClient {

    private String courseId;
    private String assignmentId;
    private String include;
    private String searchTerm;
    private Boolean overrideAssignmentDates;
    private Boolean needsGradingCountBySection;
    private String bucket;
    private String assignmentIds;
    private String orderBy;
    private Boolean postToSis;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<String,Object>();

        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.searchTerm != null){
            queries.put("search_term",this.searchTerm);
        }
        if(this.overrideAssignmentDates != null){
            queries.put("override_assignment_dates",this.overrideAssignmentDates);
        }
        if(this.needsGradingCountBySection != null){
            queries.put("needs_grading_count_by_section",this.needsGradingCountBySection);
        }
        if(this.bucket != null){
            queries.put("bucket",this.bucket);
        }
        if(this.assignmentIds != null){
            queries.put("assignment_ids[]",this.assignmentIds);
        }
        if(this.orderBy != null){
            queries.put("order_by",this.orderBy);
        }
        if(this.postToSis != null){
            queries.put("post_to_sis",this.postToSis);
        }

        return queries;
    }

    public void clearQueries(){

        this.include = null;
        this.searchTerm = null;
        this.overrideAssignmentDates = null;
        this.needsGradingCountBySection = null;
        this.bucket = null;
        this.assignmentIds = null;
        this.orderBy = null;
        this.postToSis = null;


    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }
}
