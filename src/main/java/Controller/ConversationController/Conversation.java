package Controller.ConversationController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conversation {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("last_message")
    @Expose
    private String lastMessage;
    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("message_count")
    @Expose
    private Integer messageCount;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;
    @SerializedName("private")
    @Expose
    private Boolean _private;
    @SerializedName("starred")
    @Expose
    private Boolean starred;
    @SerializedName("properties")
    @Expose
    private Object properties;
    @SerializedName("audience")
    @Expose
    private Object audience;
    @SerializedName("audience_contexts")
    @Expose
    private Object audienceContexts;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("participants")
    @Expose
    private Object participants;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("context_name")
    @Expose
    private String contextName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public Integer getMessageCount() {
        return messageCount;
    }

    public void setMessageCount(Integer messageCount) {
        this.messageCount = messageCount;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public Object getProperties() {
        return properties;
    }

    public void setProperties(Object properties) {
        this.properties = properties;
    }

    public Object getAudience() {
        return audience;
    }

    public void setAudience(Object audience) {
        this.audience = audience;
    }

    public Object getAudienceContexts() {
        return audienceContexts;
    }

    public void setAudienceContexts(Object audienceContexts) {
        this.audienceContexts = audienceContexts;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Object getParticipants() {
        return participants;
    }

    public void setParticipants(Object participants) {
        this.participants = participants;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }


}
