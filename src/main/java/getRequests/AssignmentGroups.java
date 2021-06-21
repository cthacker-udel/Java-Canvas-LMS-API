package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class AssignmentGroups extends CanvasClient {

    private String courseId;
    private ArrayList<String> include = new ArrayList<>();
    private ArrayList<String> assignmentIds = new ArrayList<>();
    private ArrayList<String> excludeAssignmentSubmissionTypes = new ArrayList<>();
    private Boolean overrideAssignmentDates;
    private Integer gradingPeriodId;
    private Boolean scopeAssignmentToStudent;

    public Map<String,Object> generateQueries(){

        Map<String,Object> body = new LinkedHashMap<>();
        if(this.include.size() > 0){
            body.put("include[]",this.include.toArray(String[]::new));
        }
        if(this.assignmentIds.size() > 0){
            body.put("assignment_ids[]",this.assignmentIds.toArray(String[]::new));
        }
        if(this.excludeAssignmentSubmissionTypes.size() > 0){
            body.put("exclude_assignment_submission_types[]",this.excludeAssignmentSubmissionTypes.toArray(String[]::new));
        }
        if(this.overrideAssignmentDates != null){
            body.put("override_assignment_dates",this.overrideAssignmentDates);
        }
        if(this.gradingPeriodId != null){
            body.put("grading_period_id",this.gradingPeriodId);
        }
        if(this.scopeAssignmentToStudent != null){
            body.put("scope_assignments_to_student",this.scopeAssignmentToStudent);
        }
        return body;

    }

    public void clearQueries(){

        this.include.clear();
        this.assignmentIds.clear();
        this.excludeAssignmentSubmissionTypes.clear();
        this.overrideAssignmentDates = null;
        this.gradingPeriodId = null;
        this.scopeAssignmentToStudent = null;

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public ArrayList<String> getInclude() {
        return include;
    }

    public void setInclude(ArrayList<String> include) {
        this.include = include;
    }

    public ArrayList<String> getAssignmentIds() {
        return assignmentIds;
    }

    public void setAssignmentIds(ArrayList<String> assignmentIds) {
        this.assignmentIds = assignmentIds;
    }

    public ArrayList<String> getExcludeAssignmentSubmissionTypes() {
        return excludeAssignmentSubmissionTypes;
    }

    public void setExcludeAssignmentSubmissionTypes(ArrayList<String> excludeAssignmentSubmissionTypes) {
        this.excludeAssignmentSubmissionTypes = excludeAssignmentSubmissionTypes;
    }

    public Boolean getOverrideAssignmentDates() {
        return overrideAssignmentDates;
    }

    public void setOverrideAssignmentDates(Boolean overrideAssignmentDates) {
        this.overrideAssignmentDates = overrideAssignmentDates;
    }

    public Integer getGradingPeriodId() {
        return gradingPeriodId;
    }

    public void setGradingPeriodId(Integer gradingPeriodId) {
        this.gradingPeriodId = gradingPeriodId;
    }

    public Boolean getScopeAssignmentToStudent() {
        return scopeAssignmentToStudent;
    }

    public void setScopeAssignmentToStudent(Boolean scopeAssignmentToStudent) {
        this.scopeAssignmentToStudent = scopeAssignmentToStudent;
    }
}