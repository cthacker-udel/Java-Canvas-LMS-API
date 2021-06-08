package Controller.CalendarEventController.CalendarEvent;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CalendarEvent {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("end_at")
    @Expose
    private String endAt;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("location_name")
    @Expose
    private String locationName;
    @SerializedName("location_address")
    @Expose
    private String locationAddress;
    @SerializedName("context_code")
    @Expose
    private String contextCode;
    @SerializedName("effective_context_code")
    @Expose
    private Object effectiveContextCode;
    @SerializedName("context_name")
    @Expose
    private String contextName;
    @SerializedName("all_context_codes")
    @Expose
    private String allContextCodes;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("parent_event_id")
    @Expose
    private Object parentEventId;
    @SerializedName("child_events_count")
    @Expose
    private Integer childEventsCount;
    @SerializedName("child_events")
    @Expose
    private Object childEvents;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("all_day_date")
    @Expose
    private String allDayDate;
    @SerializedName("all_day")
    @Expose
    private Boolean allDay;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("appointment_group_id")
    @Expose
    private Object appointmentGroupId;
    @SerializedName("appointment_group_url")
    @Expose
    private Object appointmentGroupUrl;
    @SerializedName("own_reservation")
    @Expose
    private Boolean ownReservation;
    @SerializedName("reserve_url")
    @Expose
    private Object reserveUrl;
    @SerializedName("reserved")
    @Expose
    private Boolean reserved;
    @SerializedName("participant_type")
    @Expose
    private String participantType;
    @SerializedName("participants_per_appointment")
    @Expose
    private Object participantsPerAppointment;
    @SerializedName("available_slots")
    @Expose
    private Object availableSlots;
    @SerializedName("user")
    @Expose
    private Object user;
    @SerializedName("group")
    @Expose
    private Object group;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getContextCode() {
        return contextCode;
    }

    public void setContextCode(String contextCode) {
        this.contextCode = contextCode;
    }

    public Object getEffectiveContextCode() {
        return effectiveContextCode;
    }

    public void setEffectiveContextCode(Object effectiveContextCode) {
        this.effectiveContextCode = effectiveContextCode;
    }

    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }

    public String getAllContextCodes() {
        return allContextCodes;
    }

    public void setAllContextCodes(String allContextCodes) {
        this.allContextCodes = allContextCodes;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Object getParentEventId() {
        return parentEventId;
    }

    public void setParentEventId(Object parentEventId) {
        this.parentEventId = parentEventId;
    }

    public Integer getChildEventsCount() {
        return childEventsCount;
    }

    public void setChildEventsCount(Integer childEventsCount) {
        this.childEventsCount = childEventsCount;
    }

    public Object getChildEvents() {
        return childEvents;
    }

    public void setChildEvents(Object childEvents) {
        this.childEvents = childEvents;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getAllDayDate() {
        return allDayDate;
    }

    public void setAllDayDate(String allDayDate) {
        this.allDayDate = allDayDate;
    }

    public Boolean getAllDay() {
        return allDay;
    }

    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Object getAppointmentGroupId() {
        return appointmentGroupId;
    }

    public void setAppointmentGroupId(Object appointmentGroupId) {
        this.appointmentGroupId = appointmentGroupId;
    }

    public Object getAppointmentGroupUrl() {
        return appointmentGroupUrl;
    }

    public void setAppointmentGroupUrl(Object appointmentGroupUrl) {
        this.appointmentGroupUrl = appointmentGroupUrl;
    }

    public Boolean getOwnReservation() {
        return ownReservation;
    }

    public void setOwnReservation(Boolean ownReservation) {
        this.ownReservation = ownReservation;
    }

    public Object getReserveUrl() {
        return reserveUrl;
    }

    public void setReserveUrl(Object reserveUrl) {
        this.reserveUrl = reserveUrl;
    }

    public Boolean getReserved() {
        return reserved;
    }

    public void setReserved(Boolean reserved) {
        this.reserved = reserved;
    }

    public String getParticipantType() {
        return participantType;
    }

    public void setParticipantType(String participantType) {
        this.participantType = participantType;
    }

    public Object getParticipantsPerAppointment() {
        return participantsPerAppointment;
    }

    public void setParticipantsPerAppointment(Object participantsPerAppointment) {
        this.participantsPerAppointment = participantsPerAppointment;
    }

    public Object getAvailableSlots() {
        return availableSlots;
    }

    public void setAvailableSlots(Object availableSlots) {
        this.availableSlots = availableSlots;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }

    public Object getGroup() {
        return group;
    }

    public void setGroup(Object group) {
        this.group = group;
    }


}
