package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Course {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sis_course_id")
    @Expose
    private Object sisCourseId;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("integration_id")
    @Expose
    private Object integrationId;
    @SerializedName("sis_import_id")
    @Expose
    private Integer sisImportId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("course_code")
    @Expose
    private String courseCode;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("root_account_id")
    @Expose
    private Integer rootAccountId;
    @SerializedName("enrollment_term_id")
    @Expose
    private Integer enrollmentTermId;
    @SerializedName("grading_periods")
    @Expose
    private Object gradingPeriods;
    @SerializedName("grading_standard_id")
    @Expose
    private Integer gradingStandardId;
    @SerializedName("grade_passback_setting")
    @Expose
    private String gradePassbackSetting;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("end_at")
    @Expose
    private String endAt;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("enrollments")
    @Expose
    private Object enrollments;
    @SerializedName("total_students")
    @Expose
    private Integer totalStudents;
    @SerializedName("calendar")
    @Expose
    private Object calendar;
    @SerializedName("default_view")
    @Expose
    private String defaultView;
    @SerializedName("syllabus_body")
    @Expose
    private String syllabusBody;
    @SerializedName("needs_grading_count")
    @Expose
    private Integer needsGradingCount;
    @SerializedName("term")
    @Expose
    private Object term;
    @SerializedName("course_progress")
    @Expose
    private Object courseProgress;
    @SerializedName("apply_assignment_group_weights")
    @Expose
    private Boolean applyAssignmentGroupWeights;
    @SerializedName("permissions")
    @Expose
    private Permissions permissions;
    @SerializedName("is_public")
    @Expose
    private Boolean isPublic;
    @SerializedName("is_public_to_auth_users")
    @Expose
    private Boolean isPublicToAuthUsers;
    @SerializedName("public_syllabus")
    @Expose
    private Boolean publicSyllabus;
    @SerializedName("public_syllabus_to_auth")
    @Expose
    private Boolean publicSyllabusToAuth;
    @SerializedName("public_description")
    @Expose
    private String publicDescription;
    @SerializedName("storage_quota_mb")
    @Expose
    private Integer storageQuotaMb;
    @SerializedName("storage_quota_used_mb")
    @Expose
    private Integer storageQuotaUsedMb;
    @SerializedName("hide_final_grades")
    @Expose
    private Boolean hideFinalGrades;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("allow_student_assignment_edits")
    @Expose
    private Boolean allowStudentAssignmentEdits;
    @SerializedName("allow_wiki_comments")
    @Expose
    private Boolean allowWikiComments;
    @SerializedName("allow_student_forum_attachments")
    @Expose
    private Boolean allowStudentForumAttachments;
    @SerializedName("open_enrollment")
    @Expose
    private Boolean openEnrollment;
    @SerializedName("self_enrollment")
    @Expose
    private Boolean selfEnrollment;
    @SerializedName("restrict_enrollments_to_course_dates")
    @Expose
    private Boolean restrictEnrollmentsToCourseDates;
    @SerializedName("course_format")
    @Expose
    private String courseFormat;
    @SerializedName("access_restricted_by_date")
    @Expose
    private Boolean accessRestrictedByDate;
    @SerializedName("time_zone")
    @Expose
    private String timeZone;
    @SerializedName("blueprint")
    @Expose
    private Boolean blueprint;
    @SerializedName("blueprint_restrictions")
    @Expose
    private BlueprintRestrictions blueprintRestrictions;
    @SerializedName("blueprint_restrictions_by_object_type")
    @Expose
    private BlueprintRestrictionsByObjectType blueprintRestrictionsByObjectType;
    @SerializedName("template")
    @Expose
    private Boolean template;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getSisCourseId() {
        return sisCourseId;
    }

    public void setSisCourseId(Object sisCourseId) {
        this.sisCourseId = sisCourseId;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Object getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(Object integrationId) {
        this.integrationId = integrationId;
    }

    public Integer getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getRootAccountId() {
        return rootAccountId;
    }

    public void setRootAccountId(Integer rootAccountId) {
        this.rootAccountId = rootAccountId;
    }

    public Integer getEnrollmentTermId() {
        return enrollmentTermId;
    }

    public void setEnrollmentTermId(Integer enrollmentTermId) {
        this.enrollmentTermId = enrollmentTermId;
    }

    public Object getGradingPeriods() {
        return gradingPeriods;
    }

    public void setGradingPeriods(Object gradingPeriods) {
        this.gradingPeriods = gradingPeriods;
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

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStartAt() {
        return startAt;
    }

    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }

    public String getEndAt() {
        return endAt;
    }

    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Object getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(Object enrollments) {
        this.enrollments = enrollments;
    }

    public Integer getTotalStudents() {
        return totalStudents;
    }

    public void setTotalStudents(Integer totalStudents) {
        this.totalStudents = totalStudents;
    }

    public Object getCalendar() {
        return calendar;
    }

    public void setCalendar(Object calendar) {
        this.calendar = calendar;
    }

    public String getDefaultView() {
        return defaultView;
    }

    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
    }

    public String getSyllabusBody() {
        return syllabusBody;
    }

    public void setSyllabusBody(String syllabusBody) {
        this.syllabusBody = syllabusBody;
    }

    public Integer getNeedsGradingCount() {
        return needsGradingCount;
    }

    public void setNeedsGradingCount(Integer needsGradingCount) {
        this.needsGradingCount = needsGradingCount;
    }

    public Object getTerm() {
        return term;
    }

    public void setTerm(Object term) {
        this.term = term;
    }

    public Object getCourseProgress() {
        return courseProgress;
    }

    public void setCourseProgress(Object courseProgress) {
        this.courseProgress = courseProgress;
    }

    public Boolean getApplyAssignmentGroupWeights() {
        return applyAssignmentGroupWeights;
    }

    public void setApplyAssignmentGroupWeights(Boolean applyAssignmentGroupWeights) {
        this.applyAssignmentGroupWeights = applyAssignmentGroupWeights;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getIsPublicToAuthUsers() {
        return isPublicToAuthUsers;
    }

    public void setIsPublicToAuthUsers(Boolean isPublicToAuthUsers) {
        this.isPublicToAuthUsers = isPublicToAuthUsers;
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

    public Integer getStorageQuotaMb() {
        return storageQuotaMb;
    }

    public void setStorageQuotaMb(Integer storageQuotaMb) {
        this.storageQuotaMb = storageQuotaMb;
    }

    public Integer getStorageQuotaUsedMb() {
        return storageQuotaUsedMb;
    }

    public void setStorageQuotaUsedMb(Integer storageQuotaUsedMb) {
        this.storageQuotaUsedMb = storageQuotaUsedMb;
    }

    public Boolean getHideFinalGrades() {
        return hideFinalGrades;
    }

    public void setHideFinalGrades(Boolean hideFinalGrades) {
        this.hideFinalGrades = hideFinalGrades;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Boolean getAllowStudentAssignmentEdits() {
        return allowStudentAssignmentEdits;
    }

    public void setAllowStudentAssignmentEdits(Boolean allowStudentAssignmentEdits) {
        this.allowStudentAssignmentEdits = allowStudentAssignmentEdits;
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

    public String getCourseFormat() {
        return courseFormat;
    }

    public void setCourseFormat(String courseFormat) {
        this.courseFormat = courseFormat;
    }

    public Boolean getAccessRestrictedByDate() {
        return accessRestrictedByDate;
    }

    public void setAccessRestrictedByDate(Boolean accessRestrictedByDate) {
        this.accessRestrictedByDate = accessRestrictedByDate;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Boolean getBlueprint() {
        return blueprint;
    }

    public void setBlueprint(Boolean blueprint) {
        this.blueprint = blueprint;
    }

    public BlueprintRestrictions getBlueprintRestrictions() {
        return blueprintRestrictions;
    }

    public void setBlueprintRestrictions(BlueprintRestrictions blueprintRestrictions) {
        this.blueprintRestrictions = blueprintRestrictions;
    }

    public BlueprintRestrictionsByObjectType getBlueprintRestrictionsByObjectType() {
        return blueprintRestrictionsByObjectType;
    }

    public void setBlueprintRestrictionsByObjectType(BlueprintRestrictionsByObjectType blueprintRestrictionsByObjectType) {
        this.blueprintRestrictionsByObjectType = blueprintRestrictionsByObjectType;
    }

    public Boolean getTemplate() {
        return template;
    }

    public void setTemplate(Boolean template) {
        this.template = template;
    }

}
