package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccountCalendarEvent extends CanvasClient {

    private String type = "event";
    private String userId;
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private Boolean undated;
    private ArrayList<String> contextCodes = new ArrayList<>();
    private ArrayList<String> excludes = new ArrayList<>();
    private ArrayList<String> submissionTypes = new ArrayList<>();
    private ArrayList<String> excludeSubmissionTypes = new ArrayList<>();


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.type != null){
            queries.put("type",this.type);
        }
        if(this.startDate != null){
            queries.put("start_date",this.startDate);
        }
        if(this.endDate != null){
            queries.put("end_date",this.endDate);
        }
        if(this.undated != null){
            queries.put("undated",this.undated);
        }
        if(this.contextCodes.size() > 0){
            queries.put("context_codes[]",String.join(",",this.contextCodes));
        }
        if(this.excludes.size() > 0){
            queries.put("excludes[]",String.join(",",this.excludes));
        }
        if(this.submissionTypes.size() > 0){
            queries.put("submission_types[]",String.join(",",this.submissionTypes));
        }
        if (this.excludeSubmissionTypes.size() > 0) {
            queries.put("exclude_submission_types[]",String.join(",",this.excludeSubmissionTypes));
        }
        return queries;
    }

    public void clearQueries(){

        this.type = null;
        this.startDate = null;
        this.endDate = null;
        this.undated = null;
        this.contextCodes = new ArrayList<>();
        this.excludes = new ArrayList<>();
        this.submissionTypes = new ArrayList<>();
        this.excludeSubmissionTypes = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Boolean getUndated() {
        return undated;
    }

    public void setUndated(Boolean undated) {
        this.undated = undated;
    }

    public ArrayList<String> getSubmissionTypes() {
        return submissionTypes;
    }

    public void setSubmissionTypes(ArrayList<String> submissionTypes) {
        this.submissionTypes = submissionTypes;
    }

    public ArrayList<String> getExcludeSubmissionTypes() {
        return excludeSubmissionTypes;
    }

    public void setExcludeSubmissionTypes(ArrayList<String> excludeSubmissionTypes) {
        this.excludeSubmissionTypes = excludeSubmissionTypes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public boolean isUndated() {
        return undated;
    }

    public void setUndated(boolean undated) {
        this.undated = undated;
    }

    public ArrayList<String> getContextCodes() {
        return contextCodes;
    }

    public void setContextCodes(ArrayList<String> contextCodes) {
        this.contextCodes = contextCodes;
    }

    public ArrayList<String> getExcludes() {
        return excludes;
    }

    public void setExcludes(ArrayList<String> excludes) {
        this.excludes = excludes;
    }
}
