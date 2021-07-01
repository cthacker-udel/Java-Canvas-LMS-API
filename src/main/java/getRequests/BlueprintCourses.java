package getRequests;

import Client.CanvasClient;
import Controller.BlueprintCourseController.BlueprintRestriction;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class BlueprintCourses extends CanvasClient {

    private String templateId;
    private String courseId;
    private String subscriptionId;
    private String migrationId;
    private ArrayList<Integer> courseIdsToAdd = new ArrayList<>();
    private ArrayList<Integer> courseIdsToRemove = new ArrayList<>();
    private String comment;
    private Boolean sendNotification;
    private Boolean copySettings;
    private Boolean publishAfterInitialSync;
    private String contentType;
    private Integer contentId;
    private Boolean restricted;
    private BlueprintRestriction restrictions;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.courseIdsToAdd.size() > 0){
            queries.put("course_ids_to_add",this.courseIdsToAdd.toArray(Integer[]::new));
        }
        if(this.courseIdsToRemove.size() > 0){
            queries.put("course_ids_to_remove",this.courseIdsToRemove.toArray(Integer[]::new));
        }
        if(this.comment != null){
            queries.put("comment",this.comment);
        }
        if(this.sendNotification != null){
            queries.put("send_notification",this.sendNotification);
        }
        if(this.copySettings != null){
            queries.put("copy_settings",this.copySettings);
        }
        if(this.publishAfterInitialSync != null){
            queries.put("publish_after_initial_sync",this.publishAfterInitialSync);
        }
        if(this.contentType != null){
            queries.put("content_type",this.contentType);
        }
        if(this.contentId != null){
            queries.put("content_id",this.contentId);
        }
        if(this.restricted != null){
            queries.put("restricted",this.restricted);
        }
        if(this.restrictions != null){
            queries.put("restrictions",this.restrictions);
        }

        return queries;
    }

    public void clearQueries(){

        this.courseIdsToAdd = new ArrayList<>();
        this.courseIdsToRemove = new ArrayList<>();
        this.comment = null;
        this.sendNotification = null;
        this.copySettings = null;
        this.publishAfterInitialSync = null;
        this.contentType = null;
        this.contentId = null;
        this.restricted = null;
        this.restrictions = null;

    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getMigrationId() {
        return migrationId;
    }

    public void setMigrationId(String migrationId) {
        this.migrationId = migrationId;
    }

    public ArrayList<Integer> getCourseIdsToAdd() {
        return courseIdsToAdd;
    }

    public void setCourseIdsToAdd(ArrayList<Integer> courseIdsToAdd) {
        this.courseIdsToAdd = courseIdsToAdd;
    }

    public ArrayList<Integer> getCourseIdsToRemove() {
        return courseIdsToRemove;
    }

    public void setCourseIdsToRemove(ArrayList<Integer> courseIdsToRemove) {
        this.courseIdsToRemove = courseIdsToRemove;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Boolean getSendNotification() {
        return sendNotification;
    }

    public void setSendNotification(Boolean sendNotification) {
        this.sendNotification = sendNotification;
    }

    public Boolean getCopySettings() {
        return copySettings;
    }

    public void setCopySettings(Boolean copySettings) {
        this.copySettings = copySettings;
    }

    public Boolean getPublishAfterInitialSync() {
        return publishAfterInitialSync;
    }

    public void setPublishAfterInitialSync(Boolean publishAfterInitialSync) {
        this.publishAfterInitialSync = publishAfterInitialSync;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Boolean getRestricted() {
        return restricted;
    }

    public void setRestricted(Boolean restricted) {
        this.restricted = restricted;
    }

    public BlueprintRestriction getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(BlueprintRestriction restrictions) {
        this.restrictions = restrictions;
    }
}
