package Controller.AnnouncementsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Announcement {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("posted_at")
    @Expose
    private String postedAt;
    @SerializedName("delayed_post_at")
    @Expose
    private Object delayedPostAt;
    @SerializedName("context_code")
    @Expose
    private String contextCode;

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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }

    public Object getDelayedPostAt() {
        return delayedPostAt;
    }

    public void setDelayedPostAt(Object delayedPostAt) {
        this.delayedPostAt = delayedPostAt;
    }

    public String getContextCode() {
        return contextCode;
    }

    public void setContextCode(String contextCode) {
        this.contextCode = contextCode;
    }

}
