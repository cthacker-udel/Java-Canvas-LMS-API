package Controller.ConversationController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Recipient {

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
    @SerializedName("last_message_at")
    @Expose
    private String lastMessageAt;
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
    private Object starred;
    @SerializedName("properties")
    @Expose
    private List<Object> properties = null;
    @SerializedName("audience")
    @Expose
    private List<Integer> audience = null;
    @SerializedName("audience_contexts")
    @Expose
    private AudienceContexts audienceContexts;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("participants")
    @Expose
    private List<ConversationParticipant> participants = null;
    @SerializedName("messages")
    @Expose
    private List<Message> messages = null;

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

    public String getLastMessageAt() {
        return lastMessageAt;
    }

    public void setLastMessageAt(String lastMessageAt) {
        this.lastMessageAt = lastMessageAt;
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

    public Object getStarred() {
        return starred;
    }

    public void setStarred(Object starred) {
        this.starred = starred;
    }

    public List<Object> getProperties() {
        return properties;
    }

    public void setProperties(List<Object> properties) {
        this.properties = properties;
    }

    public List<Integer> getAudience() {
        return audience;
    }

    public void setAudience(List<Integer> audience) {
        this.audience = audience;
    }

    public AudienceContexts getAudienceContexts() {
        return audienceContexts;
    }

    public void setAudienceContexts(AudienceContexts audienceContexts) {
        this.audienceContexts = audienceContexts;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public List<ConversationParticipant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ConversationParticipant> participants) {
        this.participants = participants;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

}
