package Controller.DiscussionTopicController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DiscussionTopic {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("posted_at")
    @Expose
    private String postedAt;
    @SerializedName("last_reply_at")
    @Expose
    private String lastReplyAt;
    @SerializedName("require_initial_post")
    @Expose
    private Boolean requireInitialPost;
    @SerializedName("user_can_see_posts")
    @Expose
    private Boolean userCanSeePosts;
    @SerializedName("discussion_subentry_count")
    @Expose
    private Integer discussionSubentryCount;
    @SerializedName("read_state")
    @Expose
    private String readState;
    @SerializedName("unread_count")
    @Expose
    private Integer unreadCount;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;
    @SerializedName("subscription_hold")
    @Expose
    private String subscriptionHold;
    @SerializedName("assignment_id")
    @Expose
    private Object assignmentId;
    @SerializedName("delayed_post_at")
    @Expose
    private Object delayedPostAt;
    @SerializedName("published")
    @Expose
    private Boolean published;
    @SerializedName("lock_at")
    @Expose
    private Object lockAt;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("pinned")
    @Expose
    private Boolean pinned;
    @SerializedName("locked_for_user")
    @Expose
    private Boolean lockedForUser;
    @SerializedName("lock_info")
    @Expose
    private Object lockInfo;
    @SerializedName("lock_explanation")
    @Expose
    private String lockExplanation;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("topic_children")
    @Expose
    private List<Integer> topicChildren = null;
    @SerializedName("group_topic_children")
    @Expose
    private List<GroupTopicChild> groupTopicChildren = null;
    @SerializedName("root_topic_id")
    @Expose
    private Object rootTopicId;
    @SerializedName("podcast_url")
    @Expose
    private String podcastUrl;
    @SerializedName("discussion_type")
    @Expose
    private String discussionType;
    @SerializedName("group_category_id")
    @Expose
    private Object groupCategoryId;
    @SerializedName("attachments")
    @Expose
    private Object attachments;
    @SerializedName("permissions")
    @Expose
    private Permissions permissions;
    @SerializedName("allow_rating")
    @Expose
    private Boolean allowRating;
    @SerializedName("only_graders_can_rate")
    @Expose
    private Boolean onlyGradersCanRate;
    @SerializedName("sort_by_rating")
    @Expose
    private Boolean sortByRating;

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

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }

    public String getLastReplyAt() {
        return lastReplyAt;
    }

    public void setLastReplyAt(String lastReplyAt) {
        this.lastReplyAt = lastReplyAt;
    }

    public Boolean getRequireInitialPost() {
        return requireInitialPost;
    }

    public void setRequireInitialPost(Boolean requireInitialPost) {
        this.requireInitialPost = requireInitialPost;
    }

    public Boolean getUserCanSeePosts() {
        return userCanSeePosts;
    }

    public void setUserCanSeePosts(Boolean userCanSeePosts) {
        this.userCanSeePosts = userCanSeePosts;
    }

    public Integer getDiscussionSubentryCount() {
        return discussionSubentryCount;
    }

    public void setDiscussionSubentryCount(Integer discussionSubentryCount) {
        this.discussionSubentryCount = discussionSubentryCount;
    }

    public String getReadState() {
        return readState;
    }

    public void setReadState(String readState) {
        this.readState = readState;
    }

    public Integer getUnreadCount() {
        return unreadCount;
    }

    public void setUnreadCount(Integer unreadCount) {
        this.unreadCount = unreadCount;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getSubscriptionHold() {
        return subscriptionHold;
    }

    public void setSubscriptionHold(String subscriptionHold) {
        this.subscriptionHold = subscriptionHold;
    }

    public Object getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Object assignmentId) {
        this.assignmentId = assignmentId;
    }

    public Object getDelayedPostAt() {
        return delayedPostAt;
    }

    public void setDelayedPostAt(Object delayedPostAt) {
        this.delayedPostAt = delayedPostAt;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Object getLockAt() {
        return lockAt;
    }

    public void setLockAt(Object lockAt) {
        this.lockAt = lockAt;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public Boolean getLockedForUser() {
        return lockedForUser;
    }

    public void setLockedForUser(Boolean lockedForUser) {
        this.lockedForUser = lockedForUser;
    }

    public Object getLockInfo() {
        return lockInfo;
    }

    public void setLockInfo(Object lockInfo) {
        this.lockInfo = lockInfo;
    }

    public String getLockExplanation() {
        return lockExplanation;
    }

    public void setLockExplanation(String lockExplanation) {
        this.lockExplanation = lockExplanation;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Integer> getTopicChildren() {
        return topicChildren;
    }

    public void setTopicChildren(List<Integer> topicChildren) {
        this.topicChildren = topicChildren;
    }

    public List<GroupTopicChild> getGroupTopicChildren() {
        return groupTopicChildren;
    }

    public void setGroupTopicChildren(List<GroupTopicChild> groupTopicChildren) {
        this.groupTopicChildren = groupTopicChildren;
    }

    public Object getRootTopicId() {
        return rootTopicId;
    }

    public void setRootTopicId(Object rootTopicId) {
        this.rootTopicId = rootTopicId;
    }

    public String getPodcastUrl() {
        return podcastUrl;
    }

    public void setPodcastUrl(String podcastUrl) {
        this.podcastUrl = podcastUrl;
    }

    public String getDiscussionType() {
        return discussionType;
    }

    public void setDiscussionType(String discussionType) {
        this.discussionType = discussionType;
    }

    public Object getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(Object groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    public Object getAttachments() {
        return attachments;
    }


}
