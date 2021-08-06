package getRequests;

import Client.CanvasClient;
import Controller.FilesController.File;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class DiscussionTopic extends CanvasClient {

    private String courseId;
    private String include;
    private String orderBy;
    private String scope;
    private Boolean onlyAnnouncements;
    private String filterBy;
    private String searchTerm;
    private Boolean excludeContextModuleLockedTopics;
    private String groupId;

    private String title;
    private String message;
    private String discussionType;
    private Boolean published;
    private ZonedDateTime delayedPostAt;
    private Boolean allowRating;
    private ZonedDateTime lockAt;
    private Boolean podcastEnabled;
    private Boolean podcastHasStudentPosts;
    private Boolean requireInitialPost;
    private Assignment assignment;
    private Boolean isAnnouncement;
    private Boolean pinned;
    private String positionAfter;
    private Integer groupCategoryId;
    private Boolean onlyGradersCanRate;
    private Boolean sortByRating;
    private File attachment;
    private String specificSections;
    private String discussionTopicId;
    private ArrayList<Integer> order = new ArrayList<>();
    private String entryId;

    private Boolean forcedReadState;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.forcedReadState != null){
            queries.put("forced_read_state",this.forcedReadState);
        }
        if(this.order.size() > 0){
            queries.put("order[]",this.order.stream().map(String::valueOf).collect(Collectors.joining(",")).toString());
        }
        if(this.title != null){
            queries.put("title",this.title);
        }
        if(this.message != null){
            queries.put("message",this.message);
        }
        if(this.discussionType != null){
            queries.put("discussion_type",this.discussionType);
        }
        if(this.published != null){
            queries.put("published",this.published);
        }
        if(this.delayedPostAt != null){
            queries.put("delayed_post_at",this.delayedPostAt);
        }
        if(this.allowRating != null){
            queries.put("allow_rating",this.allowRating);
        }
        if(this.lockAt != null){
            queries.put("lock_at",this.lockAt);
        }
        if(this.podcastEnabled != null){
            queries.put("podcast_enabled",this.podcastEnabled);
        }
        if(this.podcastHasStudentPosts != null){
            queries.put("podcast_has_student_posts",this.podcastHasStudentPosts);
        }
        if(this.requireInitialPost != null){
            queries.put("require_initial_post",this.requireInitialPost);
        }
        if(this.assignment != null){
            queries.put("assignment",this.assignment.generateQueries());
        }
        if(this.isAnnouncement != null){
            queries.put("is_announcement",this.isAnnouncement);
        }
        if(this.pinned != null){
            queries.put("pinned",this.pinned);
        }
        if(this.positionAfter != null){
            queries.put("position_after",this.positionAfter);
        }
        if(this.groupCategoryId != null){
            queries.put("group_category_id",this.groupCategoryId);
        }
        if(this.onlyGradersCanRate != null){
            queries.put("only_graders_can_rate",this.onlyGradersCanRate);
        }
        if(this.sortByRating != null){
            queries.put("sort_by_rating",this.sortByRating);
        }
        if(this.attachment != null){
            // TODO : UPDATE ATTACHMENT VARIABLE WHEN FILE CLASS IS CREATED IN GETREQUESTS FOLDER
            queries.put("attachment",this.attachment);
        }
        if(this.specificSections != null){
            queries.put("specific_sections",this.specificSections);
        }
        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.orderBy != null){
            queries.put("order_by",this.orderBy);
        }
        if(this.scope != null){
            queries.put("scope",this.scope);
        }
        if(this.onlyAnnouncements != null){
            queries.put("only_announcements",this.onlyAnnouncements);
        }
        if(this.filterBy != null){
            queries.put("filter_by",this.filterBy);
        }
        if(this.searchTerm != null){
            queries.put("search_term",this.searchTerm);
        }
        if(this.excludeContextModuleLockedTopics != null){
            queries.put("exclude_context_module_locked_topic",this.excludeContextModuleLockedTopics);
        }
        return queries;

    }

    public void clearQueries(){
        this.title = null;
        this.message = null;
        this.discussionType = null;
        this.published = null;
        this.delayedPostAt = null;
        this.allowRating = null;
        this.lockAt = null;
        this.podcastEnabled = null;
        this.podcastHasStudentPosts = null;
        this.requireInitialPost = null;
        this.assignment = null;
        this.isAnnouncement = null;
        this.pinned = null;
        this.positionAfter = null;
        this.groupCategoryId = null;
        this.onlyGradersCanRate = null;
        this.sortByRating = null;
        this.attachment = null;
        this.specificSections = null;
        this.include = null;
        this.orderBy = null;
        this.scope = null;
        this.onlyAnnouncements = null;
        this.filterBy = null;
        this.searchTerm = null;
        this.excludeContextModuleLockedTopics = null;
        this.order = new ArrayList<>();
        this.entryId = null;
        this.forcedReadState = null;
    }

    public Boolean getForcedReadState() {
        return forcedReadState;
    }

    public void setForcedReadState(Boolean forcedReadState) {
        this.forcedReadState = forcedReadState;
    }

    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    public ArrayList<Integer> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Integer> order) {
        this.order = order;
    }

    public String getDiscussionTopicId() {
        return discussionTopicId;
    }

    public void setDiscussionTopicId(String discussionTopicId) {
        this.discussionTopicId = discussionTopicId;
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

    public String getDiscussionType() {
        return discussionType;
    }

    public void setDiscussionType(String discussionType) {
        this.discussionType = discussionType;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public ZonedDateTime getDelayedPostAt() {
        return delayedPostAt;
    }

    public void setDelayedPostAt(ZonedDateTime delayedPostAt) {
        this.delayedPostAt = delayedPostAt;
    }

    public Boolean getAllowRating() {
        return allowRating;
    }

    public void setAllowRating(Boolean allowRating) {
        this.allowRating = allowRating;
    }

    public ZonedDateTime getLockAt() {
        return lockAt;
    }

    public void setLockAt(ZonedDateTime lockAt) {
        this.lockAt = lockAt;
    }

    public Boolean getPodcastEnabled() {
        return podcastEnabled;
    }

    public void setPodcastEnabled(Boolean podcastEnabled) {
        this.podcastEnabled = podcastEnabled;
    }

    public Boolean getPodcastHasStudentPosts() {
        return podcastHasStudentPosts;
    }

    public void setPodcastHasStudentPosts(Boolean podcastHasStudentPosts) {
        this.podcastHasStudentPosts = podcastHasStudentPosts;
    }

    public Boolean getRequireInitialPost() {
        return requireInitialPost;
    }

    public void setRequireInitialPost(Boolean requireInitialPost) {
        this.requireInitialPost = requireInitialPost;
    }

    @Override
    public Assignment getAssignment() {
        return assignment;
    }

    @Override
    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Boolean getAnnouncement() {
        return isAnnouncement;
    }

    public void setAnnouncement(Boolean announcement) {
        isAnnouncement = announcement;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public String getPositionAfter() {
        return positionAfter;
    }

    public void setPositionAfter(String positionAfter) {
        this.positionAfter = positionAfter;
    }

    public Integer getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(Integer groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    public Boolean getOnlyGradersCanRate() {
        return onlyGradersCanRate;
    }

    public void setOnlyGradersCanRate(Boolean onlyGradersCanRate) {
        this.onlyGradersCanRate = onlyGradersCanRate;
    }

    public Boolean getSortByRating() {
        return sortByRating;
    }

    public void setSortByRating(Boolean sortByRating) {
        this.sortByRating = sortByRating;
    }

    public File getAttachment() {
        return attachment;
    }

    public void setAttachment(File attachment) {
        this.attachment = attachment;
    }

    public String getSpecificSections() {
        return specificSections;
    }

    public void setSpecificSections(String specificSections) {
        this.specificSections = specificSections;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Boolean getOnlyAnnouncements() {
        return onlyAnnouncements;
    }

    public void setOnlyAnnouncements(Boolean onlyAnnouncements) {
        this.onlyAnnouncements = onlyAnnouncements;
    }

    public String getFilterBy() {
        return filterBy;
    }

    public void setFilterBy(String filterBy) {
        this.filterBy = filterBy;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Boolean getExcludeContextModuleLockedTopics() {
        return excludeContextModuleLockedTopics;
    }

    public void setExcludeContextModuleLockedTopics(Boolean excludeContextModuleLockedTopics) {
        this.excludeContextModuleLockedTopics = excludeContextModuleLockedTopics;
    }
}
