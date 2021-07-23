package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Settings {

    @SerializedName("allow_student_discussion_topics")
    @Expose
    private Boolean allowStudentDiscussionTopics;
    @SerializedName("allow_student_forum_attachments")
    @Expose
    private Boolean allowStudentForumAttachments;
    @SerializedName("allow_student_discussion_editing")
    @Expose
    private Boolean allowStudentDiscussionEditing;
    @SerializedName("grading_standard_enabled")
    @Expose
    private Boolean gradingStandardEnabled;
    @SerializedName("grading_standard_id")
    @Expose
    private Integer gradingStandardId;
    @SerializedName("allow_student_organized_groups")
    @Expose
    private Boolean allowStudentOrganizedGroups;
    @SerializedName("hide_final_grades")
    @Expose
    private Boolean hideFinalGrades;
    @SerializedName("hide_distribution_graphs")
    @Expose
    private Boolean hideDistributionGraphs;
    @SerializedName("hide_sections_on_course_users_page")
    @Expose
    private Boolean hideSectionsOnCourseUsersPage;
    @SerializedName("lock_all_announcements")
    @Expose
    private Boolean lockAllAnnouncements;
    @SerializedName("usage_rights_required")
    @Expose
    private Boolean usageRightsRequired;
    @SerializedName("homeroom_course")
    @Expose
    private Boolean homeroomCourse;

    public Boolean getAllowStudentDiscussionTopics() {
        return allowStudentDiscussionTopics;
    }

    public void setAllowStudentDiscussionTopics(Boolean allowStudentDiscussionTopics) {
        this.allowStudentDiscussionTopics = allowStudentDiscussionTopics;
    }

    public Boolean getAllowStudentForumAttachments() {
        return allowStudentForumAttachments;
    }

    public void setAllowStudentForumAttachments(Boolean allowStudentForumAttachments) {
        this.allowStudentForumAttachments = allowStudentForumAttachments;
    }

    public Boolean getAllowStudentDiscussionEditing() {
        return allowStudentDiscussionEditing;
    }

    public void setAllowStudentDiscussionEditing(Boolean allowStudentDiscussionEditing) {
        this.allowStudentDiscussionEditing = allowStudentDiscussionEditing;
    }

    public Boolean getGradingStandardEnabled() {
        return gradingStandardEnabled;
    }

    public void setGradingStandardEnabled(Boolean gradingStandardEnabled) {
        this.gradingStandardEnabled = gradingStandardEnabled;
    }

    public Integer getGradingStandardId() {
        return gradingStandardId;
    }

    public void setGradingStandardId(Integer gradingStandardId) {
        this.gradingStandardId = gradingStandardId;
    }

    public Boolean getAllowStudentOrganizedGroups() {
        return allowStudentOrganizedGroups;
    }

    public void setAllowStudentOrganizedGroups(Boolean allowStudentOrganizedGroups) {
        this.allowStudentOrganizedGroups = allowStudentOrganizedGroups;
    }

    public Boolean getHideFinalGrades() {
        return hideFinalGrades;
    }

    public void setHideFinalGrades(Boolean hideFinalGrades) {
        this.hideFinalGrades = hideFinalGrades;
    }

    public Boolean getHideDistributionGraphs() {
        return hideDistributionGraphs;
    }

    public void setHideDistributionGraphs(Boolean hideDistributionGraphs) {
        this.hideDistributionGraphs = hideDistributionGraphs;
    }

    public Boolean getHideSectionsOnCourseUsersPage() {
        return hideSectionsOnCourseUsersPage;
    }

    public void setHideSectionsOnCourseUsersPage(Boolean hideSectionsOnCourseUsersPage) {
        this.hideSectionsOnCourseUsersPage = hideSectionsOnCourseUsersPage;
    }

    public Boolean getLockAllAnnouncements() {
        return lockAllAnnouncements;
    }

    public void setLockAllAnnouncements(Boolean lockAllAnnouncements) {
        this.lockAllAnnouncements = lockAllAnnouncements;
    }

    public Boolean getUsageRightsRequired() {
        return usageRightsRequired;
    }

    public void setUsageRightsRequired(Boolean usageRightsRequired) {
        this.usageRightsRequired = usageRightsRequired;
    }

    public Boolean getHomeroomCourse() {
        return homeroomCourse;
    }

    public void setHomeroomCourse(Boolean homeroomCourse) {
        this.homeroomCourse = homeroomCourse;
    }

}
