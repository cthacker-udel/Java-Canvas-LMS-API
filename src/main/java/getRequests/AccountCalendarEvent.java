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

    private String contextCode;
    private String title;
    private String description;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;
    private String locationName;
    private String locationAddress;
    private String timeZoneEdited;
    private Boolean allDay;
    private ZonedDateTime childEventDateStartAt;
    private ZonedDateTime childEventDateEndAt;
    private String childEventDataContextCode;
    private String duplicateCount;
    private String duplicateInterval;
    private String calendarEventDuplicateFrequency;



    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.contextCode != null){
            queries.put("calendar_event[context_code]",this.contextCode);
        }
        if(this.title != null){
            queries.put("calendar_event[title]",this.title);
        }
        if(this.description != null){
            queries.put("calendar_event[description]",this.description);
        }
        if(this.startAt != null){
            queries.put("calendar_event[start_at]",this.startAt);
        }
        if(this.endAt != null){
            queries.put("calendar_event[end_at]",this.endAt);
        }
        if(this.locationName != null){
            queries.put("calendar_event[location_name]",this.locationName);
        }
        if(this.locationAddress != null){
            queries.put("calendar_event[location_address]",this.locationAddress);
        }
        if(this.timeZoneEdited != null){
            queries.put("calendar_event[time_zone_edited]",this.timeZoneEdited);
        }
        if(this.allDay != null){
            queries.put("calendar_event[all_day]",this.allDay);
        }
        if(this.childEventDateStartAt != null){
            queries.put("calendar_event[child_event_data][X][start_at]",this.childEventDateStartAt);
        }
        if(this.childEventDateEndAt != null){
            queries.put("calendar_event[child_event_data][X][end_at]",this.childEventDateEndAt);
        }
        if(this.childEventDataContextCode != null){
            queries.put("calendar_event[child_event_data][X][context_code]",this.childEventDataContextCode);
        }
        if(this.duplicateCount != null){
            queries.put("calendar_event[duplicate][count]",this.duplicateCount);
        }
        if(this.duplicateInterval != null){
            queries.put("calendar_event[duplicate][interval]",this.duplicateInterval);
        }
        if(this.calendarEventDuplicateFrequency != null){
            queries.put("calendar_event[duplicate][frequency]",this.calendarEventDuplicateFrequency);
        }
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
        this.contextCode = null;
        this.title = null;
        this.description = null;
        this.startAt = null;
        this.endAt = null;
        this.locationName = null;
        this.locationAddress = null;
        this.timeZoneEdited = null;
        this.allDay = null;
        this.childEventDateStartAt = null;
        this.childEventDateEndAt = null;
        this.childEventDataContextCode = null;
        this.duplicateCount = null;
        this.duplicateInterval = null;
        this.calendarEventDuplicateFrequency = null;
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
