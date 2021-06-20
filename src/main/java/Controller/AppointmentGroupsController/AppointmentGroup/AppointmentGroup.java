package Controller.AppointmentGroupsController.AppointmentGroup;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AppointmentGroup {

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
    @SerializedName("participant_count")
    @Expose
    private Integer participantCount;
    @SerializedName("reserved_times")
    @Expose
    private List<ReservedTime> reservedTimes = null;
    @SerializedName("context_codes")
    @Expose
    private List<String> contextCodes = null;
    @SerializedName("sub_context_codes")
    @Expose
    private List<String> subContextCodes = null;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("requiring_action")
    @Expose
    private Boolean requiringAction;
    @SerializedName("appointments_count")
    @Expose
    private Integer appointmentsCount;
    @SerializedName("appointments")
    @Expose
    private List<Object> appointments = null;
    @SerializedName("new_appointments")
    @Expose
    private List<Object> newAppointments = null;
    @SerializedName("max_appointments_per_participant")
    @Expose
    private Integer maxAppointmentsPerParticipant;
    @SerializedName("min_appointments_per_participant")
    @Expose
    private Integer minAppointmentsPerParticipant;
    @SerializedName("participants_per_appointment")
    @Expose
    private Integer participantsPerAppointment;
    @SerializedName("participant_visibility")
    @Expose
    private String participantVisibility;
    @SerializedName("participant_type")
    @Expose
    private String participantType;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

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

    public Integer getParticipantCount() {
        return participantCount;
    }

    public void setParticipantCount(Integer participantCount) {
        this.participantCount = participantCount;
    }

    public List<ReservedTime> getReservedTimes() {
        return reservedTimes;
    }

    public void setReservedTimes(List<ReservedTime> reservedTimes) {
        this.reservedTimes = reservedTimes;
    }

    public List<String> getContextCodes() {
        return contextCodes;
    }

    public void setContextCodes(List<String> contextCodes) {
        this.contextCodes = contextCodes;
    }

    public List<String> getSubContextCodes() {
        return subContextCodes;
    }

    public void setSubContextCodes(List<String> subContextCodes) {
        this.subContextCodes = subContextCodes;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public Boolean getRequiringAction() {
        return requiringAction;
    }

    public void setRequiringAction(Boolean requiringAction) {
        this.requiringAction = requiringAction;
    }

    public Integer getAppointmentsCount() {
        return appointmentsCount;
    }

    public void setAppointmentsCount(Integer appointmentsCount) {
        this.appointmentsCount = appointmentsCount;
    }

    public List<Object> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Object> appointments) {
        this.appointments = appointments;
    }

    public List<Object> getNewAppointments() {
        return newAppointments;
    }

    public void setNewAppointments(List<Object> newAppointments) {
        this.newAppointments = newAppointments;
    }

    public Integer getMaxAppointmentsPerParticipant() {
        return maxAppointmentsPerParticipant;
    }

    public void setMaxAppointmentsPerParticipant(Integer maxAppointmentsPerParticipant) {
        this.maxAppointmentsPerParticipant = maxAppointmentsPerParticipant;
    }

    public Integer getMinAppointmentsPerParticipant() {
        return minAppointmentsPerParticipant;
    }

    public void setMinAppointmentsPerParticipant(Integer minAppointmentsPerParticipant) {
        this.minAppointmentsPerParticipant = minAppointmentsPerParticipant;
    }

    public Integer getParticipantsPerAppointment() {
        return participantsPerAppointment;
    }

    public void setParticipantsPerAppointment(Integer participantsPerAppointment) {
        this.participantsPerAppointment = participantsPerAppointment;
    }

    public String getParticipantVisibility() {
        return participantVisibility;
    }

    public void setParticipantVisibility(String participantVisibility) {
        this.participantVisibility = participantVisibility;
    }

    public String getParticipantType() {
        return participantType;
    }

    public void setParticipantType(String participantType) {
        this.participantType = participantType;
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

}
