package Controller.ConversationController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("author_id")
    @Expose
    private Integer authorId;
    @SerializedName("generated")
    @Expose
    private Boolean generated;
    @SerializedName("media_comment")
    @Expose
    private Object mediaComment;
    @SerializedName("forwarded_messages")
    @Expose
    private List<Object> forwardedMessages = null;
    @SerializedName("attachments")
    @Expose
    private List<Object> attachments = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Boolean getGenerated() {
        return generated;
    }

    public void setGenerated(Boolean generated) {
        this.generated = generated;
    }

    public Object getMediaComment() {
        return mediaComment;
    }

    public void setMediaComment(Object mediaComment) {
        this.mediaComment = mediaComment;
    }

    public List<Object> getForwardedMessages() {
        return forwardedMessages;
    }

    public void setForwardedMessages(List<Object> forwardedMessages) {
        this.forwardedMessages = forwardedMessages;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

}
