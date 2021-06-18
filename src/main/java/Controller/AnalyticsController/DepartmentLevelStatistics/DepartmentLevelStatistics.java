package Controller.AnalyticsController.DepartmentLevelStatistics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DepartmentLevelStatistics{

    @SerializedName("courses")
    @Expose
    private Integer courses;
    @SerializedName("subaccounts")
    @Expose
    private Integer subaccounts;
    @SerializedName("teachers")
    @Expose
    private Integer teachers;
    @SerializedName("students")
    @Expose
    private Integer students;
    @SerializedName("discussion_topics")
    @Expose
    private Integer discussionTopics;
    @SerializedName("media_objects")
    @Expose
    private Integer mediaObjects;
    @SerializedName("attachments")
    @Expose
    private Integer attachments;
    @SerializedName("assignments")
    @Expose
    private Integer assignments;
    
    public Integer getCourses() {
    return courses;
    }
    
    public void setCourses(Integer courses) {
    this.courses = courses;
    }
    
    public Integer getSubaccounts() {
    return subaccounts;
    }
    
    public void setSubaccounts(Integer subaccounts) {
    this.subaccounts = subaccounts;
    }
    
    public Integer getTeachers() {
    return teachers;
    }
    
    public void setTeachers(Integer teachers) {
    this.teachers = teachers;
    }
    
    public Integer getStudents() {
    return students;
    }
    
    public void setStudents(Integer students) {
    this.students = students;
    }
    
    public Integer getDiscussionTopics() {
    return discussionTopics;
    }
    
    public void setDiscussionTopics(Integer discussionTopics) {
    this.discussionTopics = discussionTopics;
    }
    
    public Integer getMediaObjects() {
    return mediaObjects;
    }
    
    public void setMediaObjects(Integer mediaObjects) {
    this.mediaObjects = mediaObjects;
    }
    
    public Integer getAttachments() {
    return attachments;
    }
    
    public void setAttachments(Integer attachments) {
    this.attachments = attachments;
    }
    
    public Integer getAssignments() {
    return assignments;
    }
    
    public void setAssignments(Integer assignments) {
    this.assignments = assignments;
    }


}