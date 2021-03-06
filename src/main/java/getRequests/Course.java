package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Course extends CanvasClient {

    private String enrollmentType;
    private String enrollmentRole;
    private Integer enrollmentRoleId;
    private String enrollmentState;
    private Boolean excludeBlueprintCourses;
    private String include;
    private String state;
    private String userId;
    private Boolean homeroom;
    private String courseId;
    private String courseAccountId;

    private String courseName;
    private String courseCode;
    private ZonedDateTime courseStartAt;
    private ZonedDateTime courseEndAt;
    private String courseLicense;
    private Boolean isPublic;
    private Boolean isPublicToAuthUsers;
    private Boolean publicSyllabus;
    private Boolean publicSyllabusToAuth;
    private String publicDescription;
    private Boolean allowStudentWikiEdits;
    private Boolean allowWikiComments;
    private Boolean allowStudentForumAttachments;
    private Boolean openEnrollment;
    private Boolean selfEnrollment;
    private Boolean restrictEnrollmentsToCourseDates;
    private String courseTermId;
    private String sisCourseId;
    private String integrationId;
    private Boolean hideFinalGrades;
    private Boolean applyAssignmentGroupWeights;
    private String courseTimeZone;
    private Boolean offer;
    private Boolean enrollMe;
    private String courseDefaultView;
    private String syllabusBody;
    private Integer gradingStandardId;
    private String gradePassbackSetting;
    private String courseFormat;
    private Boolean enableSisReactivation;

    private String searchTerm;
    private String sort;
    private String enrollmentTypeArr;
    private ArrayList<Integer> userIds = new ArrayList<>();

    private Integer courseAccountIdUpdate;

    private String html;

    private String event;

    private Boolean allowStudentDiscussionTopics;
    private Boolean allowStudentDiscussionEditing;
    private Boolean allowStudentOrganizedGroups;
    private Boolean filterSpeedGraderByStudentGroup;
    private Boolean hideDistributionGraphs;
    private Boolean hideSectionsOnCourseUsersPage;
    private Boolean lockAllAnnouncements;
    private Boolean usageRightsRequired;
    private Boolean restrictStudentPastView;
    private Boolean restrictStudentFutureView;
    private Boolean showAnnouncementsOnHomePage;
    private Integer homePageAnnouncementLimit;
    private Boolean syllabusCourseSummary;

    private ArrayList<String> courseIds = new ArrayList<>();

    private Integer teacher_limit;

    private ArrayList<String> assignmentIds = new ArrayList<>();

    private ArrayList<String> permissions = new ArrayList<>();

    private String courseCopyId;

    private String only;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.only != null){
            queries.put("only[]",this.only);
        }
        if(this.permissions.size() > 0){
            queries.put("permissions[]",this.permissions.toArray(String[]::new));
        }
        if(this.assignmentIds.size() > 0){
            queries.put("assignment_ids[]",this.assignmentIds.toArray(String[]::new));
        }
        if(this.courseIds.size() > 0){
            queries.put("course_ids[]",this.courseIds.toArray(String[]::new));
        }
        if(this.courseAccountIdUpdate != null){
            queries.put("course[account_id]",this.courseAccountIdUpdate);
        }
        if(this.teacher_limit != null){
            queries.put("teacher_limit",this.teacher_limit);
        }
        if(this.allowStudentDiscussionTopics != null){
            queries.put("allow_student_discussion_topics",this.allowStudentDiscussionTopics);
        }
        if(this.allowStudentDiscussionEditing != null){
            queries.put("allow_student_discussion_editing",this.allowStudentDiscussionEditing);
        }
        if(this.allowStudentOrganizedGroups != null){
            queries.put("allow_student_organized_groups",this.allowStudentOrganizedGroups);
        }
        if(this.filterSpeedGraderByStudentGroup != null){
            queries.put("filter_speed_grader_by_student_group",this.filterSpeedGraderByStudentGroup);
        }
        if(this.hideDistributionGraphs != null){
            queries.put("hide_distribution_graphs",this.hideDistributionGraphs);
        }
        if(this.hideSectionsOnCourseUsersPage != null){
            queries.put("hide_sections_on_course_users_page",this.hideSectionsOnCourseUsersPage);
        }
        if(this.lockAllAnnouncements != null){
            queries.put("lock_all_announcements",this.lockAllAnnouncements);
        }
        if(this.usageRightsRequired != null){
            queries.put("usage_rights_required",this.usageRightsRequired);
        }
        if(this.restrictStudentPastView != null){
            queries.put("restrict_student_past_view",this.restrictStudentPastView);
        }
        if(this.restrictStudentFutureView != null){
            queries.put("restrict_student_future_view",this.restrictStudentFutureView);
        }
        if(this.showAnnouncementsOnHomePage != null){
            queries.put("show_announcements_on_home_page",this.showAnnouncementsOnHomePage);
        }
        if(this.homePageAnnouncementLimit != null){
            queries.put("home_page_announcement_list",this.homePageAnnouncementLimit);
        }
        if(this.syllabusCourseSummary != null){
            queries.put("syllabus_course_summary",this.syllabusCourseSummary);
        }
        if(this.event != null){
            queries.put("event",this.event);
        }
        if(this.html != null){
            queries.put("html",this.html);
        }
        if(this.enrollmentTypeArr != null){
            queries.put("enrollment_type[]",this.enrollmentTypeArr);
        }
        if(this.userIds.size() > 0){
            queries.put("user_ids[]",this.userIds.toArray(Integer[]::new));
        }
        if(this.userId != null){
            queries.put("user_id",this.userId);
        }
        if(this.enrollmentType != null){
            queries.put("enrollment_type",this.enrollmentType);
        }
        if(this.enrollmentRole != null){
            queries.put("enrollment_role",this.enrollmentRole);
        }
        if(this.enrollmentRoleId != null){
            queries.put("enrollment_role_id",this.enrollmentRoleId);
        }
        if(this.enrollmentState != null){
            queries.put("enrollment_state",this.enrollmentState);
        }
        if(this.excludeBlueprintCourses != null){
            queries.put("exclude_blueprint_courses",this.excludeBlueprintCourses);
        }
        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.state != null){
            queries.put("state[]",this.state);
        }
        if(this.homeroom != null){
            queries.put("homeroom",this.homeroom);
        }
        if(this.courseName != null){
            queries.put("course[name]",this.courseName);
        }
        if(this.courseCode != null){
            queries.put("course[course_code]",this.courseCode);
        }
        if(this.courseStartAt != null){
            queries.put("course[start_at]",this.courseStartAt);
        }
        if(this.courseEndAt != null){
            queries.put("course[end_at]",this.courseEndAt);
        }
        if(this.courseLicense != null){
            queries.put("course[license]",this.courseLicense);
        }
        if(this.isPublic != null){
            queries.put("course[is_public]",this.isPublic);
        }
        if(this.isPublicToAuthUsers != null){
            queries.put("course[is_public_to_auth_users]",this.isPublicToAuthUsers);
        }
        if(this.publicSyllabus != null){
            queries.put("course[public_syllabus]",this.publicSyllabus);
        }
        if(this.publicSyllabusToAuth != null){
            queries.put("course[public_syllabus_to_auth]",this.publicSyllabusToAuth);
        }
        if(this.publicDescription != null){
            queries.put("course[public_description]",this.publicDescription);
        }
        if(this.allowStudentWikiEdits != null){
            queries.put("course[allow_student_wiki_edits]",this.allowStudentWikiEdits);
        }
        if(this.allowWikiComments != null){
            queries.put("course[allow_wiki_comments]",this.allowWikiComments);
        }
        if(this.allowStudentForumAttachments != null){
            queries.put("course[allow_student_forum_attachments]",this.allowStudentForumAttachments);
        }
        if(this.openEnrollment != null){
            queries.put("course[open_enrollment]",this.openEnrollment);
        }
        if(this.selfEnrollment != null){
            queries.put("course[self_enrollment]",this.selfEnrollment);
        }
        if(this.restrictEnrollmentsToCourseDates != null){
            queries.put("course[restrict_enrollments_to_course_dates]",this.restrictEnrollmentsToCourseDates);
        }
        if(this.courseTermId != null){
            queries.put("course[term_id]",this.courseTermId);
        }
        if(this.sisCourseId != null){
            queries.put("course[sis_course_id]",this.sisCourseId);
        }
        if(this.integrationId != null){
            queries.put("course[integration_id]",this.integrationId);
        }
        if(this.hideFinalGrades != null){
            queries.put("course[hide_final_grades]",this.hideFinalGrades);
        }
        if(this.applyAssignmentGroupWeights != null){
            queries.put("course[apply_assignment_group_weights]",this.applyAssignmentGroupWeights);
        }
        if(this.courseTimeZone != null){
            queries.put("course[time_zone]",this.courseTimeZone);
        }
        if(this.offer != null){
            queries.put("offer",this.offer);
        }
        if(this.enrollMe != null){
            queries.put("enroll_me",this.enrollMe);
        }
        if(this.courseDefaultView != null){
            queries.put("course[default_view]",this.courseDefaultView);
        }
        if(this.syllabusBody != null){
            queries.put("course[syllabus_body]",this.syllabusBody);
        }
        if(this.gradingStandardId != null){
            queries.put("course[grading_standard_id]",this.gradingStandardId);
        }
        if(this.gradePassbackSetting != null){
            queries.put("course[grade_passback_setting]",this.gradePassbackSetting);
        }
        if(this.courseFormat != null){
            queries.put("course[course_format]",this.courseFormat);
        }
        if(this.enableSisReactivation != null){
            queries.put("enable_sis_reactivation",this.enableSisReactivation);
        }

        return queries;

    }

    public void clearQueries(){

        this.enrollmentType = null;
        this.enrollmentRole = null;
        this.enrollmentRoleId = null;
        this.enrollmentState = null;
        this.excludeBlueprintCourses = null;
        this.include = null;
        this.state = null;
        this.homeroom = null;
        this.userId = null;
        this.homeroom = null;
        this.courseId = null;
        this.courseAccountId = null;

        this.courseName= null;
        this.courseCode= null;
        this.courseStartAt= null;
        this.courseEndAt= null;
        this.courseLicense= null;
        this.isPublic= null;
        this.isPublicToAuthUsers= null;
        this.publicSyllabus= null;
        this.publicSyllabusToAuth= null;
        this.publicDescription= null;
        this.allowStudentWikiEdits= null;
        this.allowWikiComments= null;
        this.allowStudentForumAttachments= null;
        this.openEnrollment= null;
        this.selfEnrollment= null;
        this.restrictEnrollmentsToCourseDates= null;
        this.courseTermId= null;
        this.sisCourseId= null;
        this.integrationId= null;
        this.hideFinalGrades= null;
        this.applyAssignmentGroupWeights= null;
        this.courseTimeZone= null;
        this.offer= null;
        this.enrollMe= null;
        this.courseDefaultView= null;
        this.syllabusBody= null;
        this.gradingStandardId= null;
        this.gradePassbackSetting= null;
        this.courseFormat= null;
        this.enableSisReactivation= null;

        this.userId = null;
        this.userIds = new ArrayList<>();
        this.searchTerm = null;
        this.sort = null;
        this.enrollmentTypeArr = null;

        this.only = null;

        this.html = null;
        this.teacher_limit = null;
        this.courseIds = new ArrayList<>();

        this.assignmentIds = new ArrayList<>();

        this.permissions = new ArrayList<>();

        this.courseCopyId = null;

    }

    public String getCourseCopyId() {
        return courseCopyId;
    }

    public void setCourseCopyId(String courseCopyId) {
        this.courseCopyId = courseCopyId;
    }

    public Integer getCourseAccountIdUpdate() {
        return courseAccountIdUpdate;
    }

    public void setCourseAccountIdUpdate(Integer courseAccountIdUpdate) {
        this.courseAccountIdUpdate = courseAccountIdUpdate;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Boolean getAllowStudentDiscussionTopics() {
        return allowStudentDiscussionTopics;
    }

    public void setAllowStudentDiscussionTopics(Boolean allowStudentDiscussionTopics) {
        this.allowStudentDiscussionTopics = allowStudentDiscussionTopics;
    }

    public Boolean getAllowStudentDiscussionEditing() {
        return allowStudentDiscussionEditing;
    }

    public void setAllowStudentDiscussionEditing(Boolean allowStudentDiscussionEditing) {
        this.allowStudentDiscussionEditing = allowStudentDiscussionEditing;
    }

    public Boolean getAllowStudentOrganizedGroups() {
        return allowStudentOrganizedGroups;
    }

    public void setAllowStudentOrganizedGroups(Boolean allowStudentOrganizedGroups) {
        this.allowStudentOrganizedGroups = allowStudentOrganizedGroups;
    }

    public Boolean getFilterSpeedGraderByStudentGroup() {
        return filterSpeedGraderByStudentGroup;
    }

    public void setFilterSpeedGraderByStudentGroup(Boolean filterSpeedGraderByStudentGroup) {
        this.filterSpeedGraderByStudentGroup = filterSpeedGraderByStudentGroup;
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

    public Boolean getRestrictStudentPastView() {
        return restrictStudentPastView;
    }

    public void setRestrictStudentPastView(Boolean restrictStudentPastView) {
        this.restrictStudentPastView = restrictStudentPastView;
    }

    public Boolean getRestrictStudentFutureView() {
        return restrictStudentFutureView;
    }

    public void setRestrictStudentFutureView(Boolean restrictStudentFutureView) {
        this.restrictStudentFutureView = restrictStudentFutureView;
    }

    public Boolean getShowAnnouncementsOnHomePage() {
        return showAnnouncementsOnHomePage;
    }

    public void setShowAnnouncementsOnHomePage(Boolean showAnnouncementsOnHomePage) {
        this.showAnnouncementsOnHomePage = showAnnouncementsOnHomePage;
    }

    public Integer getHomePageAnnouncementLimit() {
        return homePageAnnouncementLimit;
    }

    public void setHomePageAnnouncementLimit(Integer homePageAnnouncementLimit) {
        this.homePageAnnouncementLimit = homePageAnnouncementLimit;
    }

    public Boolean getSyllabusCourseSummary() {
        return syllabusCourseSummary;
    }

    public void setSyllabusCourseSummary(Boolean syllabusCourseSummary) {
        this.syllabusCourseSummary = syllabusCourseSummary;
    }

    public ArrayList<String> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(ArrayList<String> courseIds) {
        this.courseIds = courseIds;
    }

    public Integer getTeacher_limit() {
        return teacher_limit;
    }

    public void setTeacher_limit(Integer teacher_limit) {
        this.teacher_limit = teacher_limit;
    }

    public ArrayList<String> getAssignmentIds() {
        return assignmentIds;
    }

    public void setAssignmentIds(ArrayList<String> assignmentIds) {
        this.assignmentIds = assignmentIds;
    }

    public ArrayList<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getEnrollmentTypeArr() {
        return enrollmentTypeArr;
    }

    public void setEnrollmentTypeArr(String enrollmentTypeArr) {
        this.enrollmentTypeArr = enrollmentTypeArr;
    }

    public ArrayList<Integer> getUserIds() {
        return userIds;
    }

    public void setUserIds(ArrayList<Integer> userIds) {
        this.userIds = userIds;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getSyllabusBody() {
        return syllabusBody;
    }

    public void setSyllabusBody(String syllabusBody) {
        this.syllabusBody = syllabusBody;
    }

    public Integer getGradingStandardId() {
        return gradingStandardId;
    }

    public void setGradingStandardId(Integer gradingStandardId) {
        this.gradingStandardId = gradingStandardId;
    }

    public String getGradePassbackSetting() {
        return gradePassbackSetting;
    }

    public void setGradePassbackSetting(String gradePassbackSetting) {
        this.gradePassbackSetting = gradePassbackSetting;
    }

    public String getCourseFormat() {
        return courseFormat;
    }

    public void setCourseFormat(String courseFormat) {
        this.courseFormat = courseFormat;
    }

    public Boolean getEnableSisReactivation() {
        return enableSisReactivation;
    }

    public void setEnableSisReactivation(Boolean enableSisReactivation) {
        this.enableSisReactivation = enableSisReactivation;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public ZonedDateTime getCourseStartAt() {
        return courseStartAt;
    }

    public void setCourseStartAt(ZonedDateTime courseStartAt) {
        this.courseStartAt = courseStartAt;
    }

    public ZonedDateTime getCourseEndAt() {
        return courseEndAt;
    }

    public void setCourseEndAt(ZonedDateTime courseEndAt) {
        this.courseEndAt = courseEndAt;
    }

    public String getCourseLicense() {
        return courseLicense;
    }

    public void setCourseLicense(String courseLicense) {
        this.courseLicense = courseLicense;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public Boolean getPublicToAuthUsers() {
        return isPublicToAuthUsers;
    }

    public void setPublicToAuthUsers(Boolean publicToAuthUsers) {
        isPublicToAuthUsers = publicToAuthUsers;
    }

    public Boolean getPublicSyllabus() {
        return publicSyllabus;
    }

    public void setPublicSyllabus(Boolean publicSyllabus) {
        this.publicSyllabus = publicSyllabus;
    }

    public Boolean getPublicSyllabusToAuth() {
        return publicSyllabusToAuth;
    }

    public void setPublicSyllabusToAuth(Boolean publicSyllabusToAuth) {
        this.publicSyllabusToAuth = publicSyllabusToAuth;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public Boolean getAllowStudentWikiEdits() {
        return allowStudentWikiEdits;
    }

    public void setAllowStudentWikiEdits(Boolean allowStudentWikiEdits) {
        this.allowStudentWikiEdits = allowStudentWikiEdits;
    }

    public Boolean getAllowWikiComments() {
        return allowWikiComments;
    }

    public void setAllowWikiComments(Boolean allowWikiComments) {
        this.allowWikiComments = allowWikiComments;
    }

    public Boolean getAllowStudentForumAttachments() {
        return allowStudentForumAttachments;
    }

    public void setAllowStudentForumAttachments(Boolean allowStudentForumAttachments) {
        this.allowStudentForumAttachments = allowStudentForumAttachments;
    }

    public Boolean getOpenEnrollment() {
        return openEnrollment;
    }

    public void setOpenEnrollment(Boolean openEnrollment) {
        this.openEnrollment = openEnrollment;
    }

    public Boolean getSelfEnrollment() {
        return selfEnrollment;
    }

    public void setSelfEnrollment(Boolean selfEnrollment) {
        this.selfEnrollment = selfEnrollment;
    }

    public Boolean getRestrictEnrollmentsToCourseDates() {
        return restrictEnrollmentsToCourseDates;
    }

    public void setRestrictEnrollmentsToCourseDates(Boolean restrictEnrollmentsToCourseDates) {
        this.restrictEnrollmentsToCourseDates = restrictEnrollmentsToCourseDates;
    }

    public String getCourseTermId() {
        return courseTermId;
    }

    public void setCourseTermId(String courseTermId) {
        this.courseTermId = courseTermId;
    }

    public String getSisCourseId() {
        return sisCourseId;
    }

    public void setSisCourseId(String sisCourseId) {
        this.sisCourseId = sisCourseId;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public Boolean getHideFinalGrades() {
        return hideFinalGrades;
    }

    public void setHideFinalGrades(Boolean hideFinalGrades) {
        this.hideFinalGrades = hideFinalGrades;
    }

    public Boolean getApplyAssignmentGroupWeights() {
        return applyAssignmentGroupWeights;
    }

    public void setApplyAssignmentGroupWeights(Boolean applyAssignmentGroupWeights) {
        this.applyAssignmentGroupWeights = applyAssignmentGroupWeights;
    }

    public String getCourseTimeZone() {
        return courseTimeZone;
    }

    public void setCourseTimeZone(String courseTimeZone) {
        this.courseTimeZone = courseTimeZone;
    }

    public Boolean getOffer() {
        return offer;
    }

    public void setOffer(Boolean offer) {
        this.offer = offer;
    }

    public Boolean getEnrollMe() {
        return enrollMe;
    }

    public void setEnrollMe(Boolean enrollMe) {
        this.enrollMe = enrollMe;
    }

    public String getCourseDefaultView() {
        return courseDefaultView;
    }

    public void setCourseDefaultView(String courseDefaultView) {
        this.courseDefaultView = courseDefaultView;
    }

    public String getCourseAccountId() {
        return courseAccountId;
    }

    public void setCourseAccountId(String courseAccountId) {
        this.courseAccountId = courseAccountId;
    }

    public Boolean getHomeroom() {
        return homeroom;
    }

    public void setHomeroom(Boolean homeroom) {
        this.homeroom = homeroom;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getEnrollmentType() {
        return enrollmentType;
    }

    public void setEnrollmentType(String enrollmentType) {
        this.enrollmentType = enrollmentType;
    }

    public String getEnrollmentRole() {
        return enrollmentRole;
    }

    public void setEnrollmentRole(String enrollmentRole) {
        this.enrollmentRole = enrollmentRole;
    }

    public Integer getEnrollmentRoleId() {
        return enrollmentRoleId;
    }

    public void setEnrollmentRoleId(Integer enrollmentRoleId) {
        this.enrollmentRoleId = enrollmentRoleId;
    }

    public String getEnrollmentState() {
        return enrollmentState;
    }

    public void setEnrollmentState(String enrollmentState) {
        this.enrollmentState = enrollmentState;
    }

    public Boolean getExcludeBlueprintCourses() {
        return excludeBlueprintCourses;
    }

    public void setExcludeBlueprintCourses(Boolean excludeBlueprintCourses) {
        this.excludeBlueprintCourses = excludeBlueprintCourses;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
