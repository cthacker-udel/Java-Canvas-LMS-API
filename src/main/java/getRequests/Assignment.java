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
    private String userId;
    private String resultType;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<String,Object>();

        if(this.resultType != null){
            queries.put("result_type",this.resultType);
        }
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

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Boolean getOverrideAssignmentDates() {
        return overrideAssignmentDates;
    }

    public void setOverrideAssignmentDates(Boolean overrideAssignmentDates) {
        this.overrideAssignmentDates = overrideAssignmentDates;
    }

    public Boolean getNeedsGradingCountBySection() {
        return needsGradingCountBySection;
    }

    public void setNeedsGradingCountBySection(Boolean needsGradingCountBySection) {
        this.needsGradingCountBySection = needsGradingCountBySection;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getAssignmentIds() {
        return assignmentIds;
    }

    public void setAssignmentIds(String assignmentIds) {
        this.assignmentIds = assignmentIds;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Boolean getPostToSis() {
        return postToSis;
    }

    public void setPostToSis(Boolean postToSis) {
        this.postToSis = postToSis;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
