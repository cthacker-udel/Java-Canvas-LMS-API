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

    private String calendarEventId;

    private String participantId;
    private String comments;
    private Boolean cancelExisting;

    private String cancelReason;
    private String courseId;

    private ArrayList<String> timetableDays = new ArrayList<>();
    private String timetableStartTime;
    private String timetableEndTime;
    private String timetableLocation;

    private ZonedDateTime eventsStartAt;
    private ZonedDateTime eventsEndAt;
    private String eventsLocation;
    private String eventsCode;
    private String eventsTitle;



    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.eventsStartAt != null){
            queries.put("events[][start_at]",this.eventsStartAt);
        }
        if(this.eventsEndAt != null){
            queries.put("events[][end_at]",this.eventsEndAt);
        }
        if(this.eventsLocation != null){
            queries.put("events[][location_name]",this.eventsLocation);
        }
        if(this.eventsCode != null){
            queries.put("events[][code]",this.eventsCode);
        }
        if(this.eventsTitle != null){
            queries.put("events[][title]",this.eventsTitle);
        }
        if(this.timetableDays.size() > 0){
            queries.put(String.format("timetables[%s][][weekdays]",this.courseId),this.timetableDays.toArray(String[]::new));
        }
        if(this.timetableEndTime != null){
            queries.put(String.format("timetables[%s][][end_time]",this.courseId),this.timetableEndTime);
        }
        if(this.timetableStartTime != null){
            queries.put(String.format("timetables[%s][][start_time]",this.courseId),this.timetableStartTime);
        }
        if(this.timetableLocation != null){
            queries.put(String.format("timetables[%s][][location]",this.courseId),this.timetableLocation);
        }
        if(this.cancelReason != null){
            queries.put("cancel_reason",this.cancelReason);
        }
        if(this.participantId != null){
            queries.put("participant_id",this.participantId);
        }
        if(this.comments != null){
            queries.put("comments",this.comments);
        }
        if(this.cancelExisting != null){
            queries.put("cancel_existing",this.cancelExisting);
        }
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

        this.participantId = null;
        this.comments = null;
        this.cancelExisting = null;
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
        this.cancelReason = null;
        this.timetableLocation = null;
        this.timetableStartTime = null;
        this.timetableEndTime = null;
        this.timetableDays = new ArrayList<>();
        this.eventsLocation = null;
        this.eventsCode = null;
        this.eventsEndAt = null;
        this.eventsStartAt = null;
        this.eventsTitle = null;
    }

    public ArrayList<String> getTimetableDays() {
        return timetableDays;
    }

    public void setTimetableDays(ArrayList<String> timetableDays) {
        this.timetableDays = timetableDays;
    }

    public String getTimetableStartTime() {
        return timetableStartTime;
    }

    public void setTimetableStartTime(String timetableStartTime) {
        this.timetableStartTime = timetableStartTime;
    }

    public String getTimetableEndTime() {
        return timetableEndTime;
    }

    public void setTimetableEndTime(String timetableEndTime) {
        this.timetableEndTime = timetableEndTime;
    }

    public String getTimetableLocation() {
        return timetableLocation;
    }

    public void setTimetableLocation(String timetableLocation) {
        this.timetableLocation = timetableLocation;
    }

    public ZonedDateTime getEventsStartAt() {
        return eventsStartAt;
    }

    public void setEventsStartAt(ZonedDateTime eventsStartAt) {
        this.eventsStartAt = eventsStartAt;
    }

    public ZonedDateTime getEventsEndAt() {
        return eventsEndAt;
    }

    public void setEventsEndAt(ZonedDateTime eventsEndAt) {
        this.eventsEndAt = eventsEndAt;
    }

    public String getEventsLocation() {
        return eventsLocation;
    }

    public void setEventsLocation(String eventsLocation) {
        this.eventsLocation = eventsLocation;
    }

    public String getEventsCode() {
        return eventsCode;
    }

    public void setEventsCode(String eventsCode) {
        this.eventsCode = eventsCode;
    }

    public String getEventsTitle() {
        return eventsTitle;
    }

    public void setEventsTitle(String eventsTitle) {
        this.eventsTitle = eventsTitle;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getCancelExisting() {
        return cancelExisting;
    }

    public void setCancelExisting(Boolean cancelExisting) {
        this.cancelExisting = cancelExisting;
    }

    public String getContextCode() {
        return contextCode;
    }

    public void setContextCode(String contextCode) {
        this.contextCode = contextCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ZonedDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(ZonedDateTime startAt) {
        this.startAt = startAt;
    }

    public ZonedDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(ZonedDateTime endAt) {
        this.endAt = endAt;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getTimeZoneEdited() {
        return timeZoneEdited;
    }

    public void setTimeZoneEdited(String timeZoneEdited) {
        this.timeZoneEdited = timeZoneEdited;
    }

    public Boolean getAllDay() {
        return allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    public ZonedDateTime getChildEventDateStartAt() {
        return childEventDateStartAt;
    }

    public void setChildEventDateStartAt(ZonedDateTime childEventDateStartAt) {
        this.childEventDateStartAt = childEventDateStartAt;
    }

    public ZonedDateTime getChildEventDateEndAt() {
        return childEventDateEndAt;
    }

    public void setChildEventDateEndAt(ZonedDateTime childEventDateEndAt) {
        this.childEventDateEndAt = childEventDateEndAt;
    }

    public String getChildEventDataContextCode() {
        return childEventDataContextCode;
    }

    public void setChildEventDataContextCode(String childEventDataContextCode) {
        this.childEventDataContextCode = childEventDataContextCode;
    }

    public String getDuplicateCount() {
        return duplicateCount;
    }

    public void setDuplicateCount(String duplicateCount) {
        this.duplicateCount = duplicateCount;
    }

    public String getDuplicateInterval() {
        return duplicateInterval;
    }

    public void setDuplicateInterval(String duplicateInterval) {
        this.duplicateInterval = duplicateInterval;
    }

    public String getCalendarEventDuplicateFrequency() {
        return calendarEventDuplicateFrequency;
    }

    public void setCalendarEventDuplicateFrequency(String calendarEventDuplicateFrequency) {
        this.calendarEventDuplicateFrequency = calendarEventDuplicateFrequency;
    }

    public String getCalendarEventId() {
        return calendarEventId;
    }

    public void setCalendarEventId(String calendarEventId) {
        this.calendarEventId = calendarEventId;
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
