package Controller.ConversationController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DeletedConversation {

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
    private Object lastMessage;
    @SerializedName("last_message_at")
    @Expose
    private Object lastMessageAt;
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
    private List<Object> properties = null;

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

    public Object getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(Object lastMessage) {
        this.lastMessage = lastMessage;
    }

    public Object getLastMessageAt() {
        return lastMessageAt;
    }

    public void setLastMessageAt(Object lastMessageAt) {
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

    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public List<Object> getProperties() {
        return properties;
    }

    public void setProperties(List<Object> properties) {
        this.properties = properties;
    }

}
