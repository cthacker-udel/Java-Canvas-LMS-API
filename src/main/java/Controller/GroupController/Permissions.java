package Controller.GroupController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Permissions {

    @SerializedName("create_discussion_topic")
    @Expose
    private Boolean createDiscussionTopic;
    @SerializedName("create_announcement")
    @Expose
    private Boolean createAnnouncement;

    public Boolean getCreateDiscussionTopic() {
        return createDiscussionTopic;
    }

    public void setCreateDiscussionTopic(Boolean createDiscussionTopic) {
        this.createDiscussionTopic = createDiscussionTopic;
    }

    public Boolean getCreateAnnouncement() {
        return createAnnouncement;
    }

    public void setCreateAnnouncement(Boolean createAnnouncement) {
        this.createAnnouncement = createAnnouncement;
    }


}
