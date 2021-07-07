package Controller.ConferencesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Conference {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("conference_type")
    @Expose
    private String conferenceType;
    @SerializedName("conference_key")
    @Expose
    private String conferenceKey;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("ended_at")
    @Expose
    private String endedAt;
    @SerializedName("started_at")
    @Expose
    private String startedAt;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("users")
    @Expose
    private List<Integer> users = null;
    @SerializedName("has_advanced_settings")
    @Expose
    private Boolean hasAdvancedSettings;
    @SerializedName("long_running")
    @Expose
    private Boolean longRunning;
    @SerializedName("user_settings")
    @Expose
    private UserSettings userSettings;
    @SerializedName("recordings")
    @Expose
    private Object recordings;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("join_url")
    @Expose
    private Object joinUrl;
    @SerializedName("context_type")
    @Expose
    private Object contextType;
    @SerializedName("context_id")
    @Expose
    private Object contextId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConferenceType() {
        return conferenceType;
    }

    public void setConferenceType(String conferenceType) {
        this.conferenceType = conferenceType;
    }

    public String getConferenceKey() {
        return conferenceKey;
    }

    public void setConferenceKey(String conferenceKey) {
        this.conferenceKey = conferenceKey;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getUsers() {
        return users;
    }

    public void setUsers(List<Integer> users) {
        this.users = users;
    }

    public Boolean getHasAdvancedSettings() {
        return hasAdvancedSettings;
    }

    public void setHasAdvancedSettings(Boolean hasAdvancedSettings) {
        this.hasAdvancedSettings = hasAdvancedSettings;
    }

    public Boolean getLongRunning() {
        return longRunning;
    }

    public void setLongRunning(Boolean longRunning) {
        this.longRunning = longRunning;
    }

    public UserSettings getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(UserSettings userSettings) {
        this.userSettings = userSettings;
    }

    public Object getRecordings() {
        return recordings;
    }

    public void setRecordings(Object recordings) {
        this.recordings = recordings;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Object getJoinUrl() {
        return joinUrl;
    }

    public void setJoinUrl(Object joinUrl) {
        this.joinUrl = joinUrl;
    }

    public Object getContextType() {
        return contextType;
    }

    public void setContextType(Object contextType) {
        this.contextType = contextType;
    }

    public Object getContextId() {
        return contextId;
    }

    public void setContextId(Object contextId) {
        this.contextId = contextId;
    }

}
