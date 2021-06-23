package Controller.AssignmentsController.Assignment;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Assignment {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("due_at")
    @Expose
    private String dueAt;
    @SerializedName("lock_at")
    @Expose
    private String lockAt;
    @SerializedName("unlock_at")
    @Expose
    private String unlockAt;
    @SerializedName("has_overrides")
    @Expose
    private Boolean hasOverrides;
    @SerializedName("all_dates")
    @Expose
    private Object allDates;
    @SerializedName("course_id")
    @Expose
    private Integer courseId;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("submissions_download_url")
    @Expose
    private String submissionsDownloadUrl;
    @SerializedName("assignment_group_id")
    @Expose
    private Integer assignmentGroupId;
    @SerializedName("due_date_required")
    @Expose
    private Boolean dueDateRequired;
    @SerializedName("allowed_extensions")
    @Expose
    private List<String> allowedExtensions = null;
    @SerializedName("max_name_length")
    @Expose
    private Integer maxNameLength;
    @SerializedName("turnitin_enabled")
    @Expose
    private Boolean turnitinEnabled;
    @SerializedName("vericite_enabled")
    @Expose
    private Boolean vericiteEnabled;
    @SerializedName("turnitin_settings")
    @Expose
    private Object turnitinSettings;
    @SerializedName("grade_group_students_individually")
    @Expose
    private Boolean gradeGroupStudentsIndividually;
    @SerializedName("external_tool_tag_attributes")
    @Expose
    private Object externalToolTagAttributes;
    @SerializedName("peer_reviews")
    @Expose
    private Boolean peerReviews;
    @SerializedName("automatic_peer_reviews")
    @Expose
    private Boolean automaticPeerReviews;
    @SerializedName("peer_review_count")
    @Expose
    private Integer peerReviewCount;
    @SerializedName("peer_reviews_assign_at")
    @Expose
    private String peerReviewsAssignAt;
    @SerializedName("intra_group_peer_reviews")
    @Expose
    private Boolean intraGroupPeerReviews;
    @SerializedName("group_category_id")
    @Expose
    private Integer groupCategoryId;
    @SerializedName("needs_grading_count")
    @Expose
    private Integer needsGradingCount;
    @SerializedName("needs_grading_count_by_section")
    @Expose
    private List<NeedsGradingCountBySection> needsGradingCountBySection = null;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("post_to_sis")
    @Expose
    private Boolean postToSis;
    @SerializedName("integration_id")
    @Expose
    private String integrationId;
    @SerializedName("integration_data")
    @Expose
    private IntegrationData integrationData;
    @SerializedName("points_possible")
    @Expose
    private Double pointsPossible;
    @SerializedName("submission_types")
    @Expose
    private List<String> submissionTypes = null;
    @SerializedName("has_submitted_submissions")
    @Expose
    private Boolean hasSubmittedSubmissions;
    @SerializedName("grading_type")
    @Expose
    private String gradingType;
    @SerializedName("grading_standard_id")
    @Expose
    private Object gradingStandardId;
    @SerializedName("published")
    @Expose
    private Boolean published;
    @SerializedName("unpublishable")
    @Expose
    private Boolean unpublishable;
    @SerializedName("only_visible_to_overrides")
    @Expose
    private Boolean onlyVisibleToOverrides;
    @SerializedName("locked_for_user")
    @Expose
    private Boolean lockedForUser;
    @SerializedName("lock_info")
    @Expose
    private Object lockInfo;
    @SerializedName("lock_explanation")
    @Expose
    private String lockExplanation;
    @SerializedName("quiz_id")
    @Expose
    private Integer quizId;
    @SerializedName("anonymous_submissions")
    @Expose
    private Boolean anonymousSubmissions;
    @SerializedName("discussion_topic")
    @Expose
    private Object discussionTopic;
    @SerializedName("freeze_on_copy")
    @Expose
    private Boolean freezeOnCopy;
    @SerializedName("frozen")
    @Expose
    private Boolean frozen;
    @SerializedName("frozen_attributes")
    @Expose
    private List<String> frozenAttributes = null;
    @SerializedName("submission")
    @Expose
    private Object submission;
    @SerializedName("use_rubric_for_grading")
    @Expose
    private Boolean useRubricForGrading;
    @SerializedName("rubric_settings")
    @Expose
    private RubricSettings rubricSettings;
    @SerializedName("rubric")
    @Expose
    private Object rubric;
    @SerializedName("assignment_visibility")
    @Expose
    private List<Integer> assignmentVisibility = null;
    @SerializedName("overrides")
    @Expose
    private Object overrides;
    @SerializedName("omit_from_final_grade")
    @Expose
    private Boolean omitFromFinalGrade;
    @SerializedName("moderated_grading")
    @Expose
    private Boolean moderatedGrading;
    @SerializedName("grader_count")
    @Expose
    private Integer graderCount;
    @SerializedName("final_grader_id")
    @Expose
    private Integer finalGraderId;
    @SerializedName("grader_comments_visible_to_graders")
    @Expose
    private Boolean graderCommentsVisibleToGraders;
    @SerializedName("graders_anonymous_to_graders")
    @Expose
    private Boolean gradersAnonymousToGraders;
    @SerializedName("grader_names_visible_to_final_grader")
    @Expose
    private Boolean graderNamesVisibleToFinalGrader;
    @SerializedName("anonymous_grading")
    @Expose
    private Boolean anonymousGrading;
    @SerializedName("allowed_attempts")
    @Expose
    private Integer allowedAttempts;
    @SerializedName("post_manually")
    @Expose
    private Boolean postManually;
    @SerializedName("score_statistics")
    @Expose
    private Object scoreStatistics;
    @SerializedName("can_submit")
    @Expose
    private Boolean canSubmit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDueAt() {
        return dueAt;
    }

    public void setDueAt(String dueAt) {
        this.dueAt = dueAt;
    }

    public String getLockAt() {
        return lockAt;
    }

    public void setLockAt(String lockAt) {
        this.lockAt = lockAt;
    }

    public String getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(String unlockAt) {
        this.unlockAt = unlockAt;
    }

    public Boolean getHasOverrides() {
        return hasOverrides;
    }

    public void setHasOverrides(Boolean hasOverrides) {
        this.hasOverrides = hasOverrides;
    }

    public Object getAllDates() {
        return allDates;
    }

    public void setAllDates(Object allDates) {
        this.allDates = allDates;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public String getSubmissionsDownloadUrl() {
        return submissionsDownloadUrl;
    }

    public void setSubmissionsDownloadUrl(String submissionsDownloadUrl) {
        this.submissionsDownloadUrl = submissionsDownloadUrl;
    }

    public Integer getAssignmentGroupId() {
        return assignmentGroupId;
    }

    public void setAssignmentGroupId(Integer assignmentGroupId) {
        this.assignmentGroupId = assignmentGroupId;
    }

    public Boolean getDueDateRequired() {
        return dueDateRequired;
    }

    public void setDueDateRequired(Boolean dueDateRequired) {
        this.dueDateRequired = dueDateRequired;
    }

    public List<String> getAllowedExtensions() {
        return allowedExtensions;
    }

    public void setAllowedExtensions(List<String> allowedExtensions) {
        this.allowedExtensions = allowedExtensions;
    }

    public Integer getMaxNameLength() {
        return maxNameLength;
    }

    public void setMaxNameLength(Integer maxNameLength) {
        this.maxNameLength = maxNameLength;
    }

    public Boolean getTurnitinEnabled() {
        return turnitinEnabled;
    }

    public void setTurnitinEnabled(Boolean turnitinEnabled) {
        this.turnitinEnabled = turnitinEnabled;
    }

    public Boolean getVericiteEnabled() {
        return vericiteEnabled;
    }

    public void setVericiteEnabled(Boolean vericiteEnabled) {
        this.vericiteEnabled = vericiteEnabled;
    }

    public Object getTurnitinSettings() {
        return turnitinSettings;
    }

    public void setTurnitinSettings(Object turnitinSettings) {
        this.turnitinSettings = turnitinSettings;
    }

    public Boolean getGradeGroupStudentsIndividually() {
        return gradeGroupStudentsIndividually;
    }

    public void setGradeGroupStudentsIndividually(Boolean gradeGroupStudentsIndividually) {
        this.gradeGroupStudentsIndividually = gradeGroupStudentsIndividually;
    }

    public Object getExternalToolTagAttributes() {
        return externalToolTagAttributes;
    }

    public void setExternalToolTagAttributes(Object externalToolTagAttributes) {
        this.externalToolTagAttributes = externalToolTagAttributes;
    }

    public Boolean getPeerReviews() {
        return peerReviews;
    }

    public void setPeerReviews(Boolean peerReviews) {
        this.peerReviews = peerReviews;
    }

    public Boolean getAutomaticPeerReviews() {
        return automaticPeerReviews;
    }

    public void setAutomaticPeerReviews(Boolean automaticPeerReviews) {
        this.automaticPeerReviews = automaticPeerReviews;
    }

    public Integer getPeerReviewCount() {
        return peerReviewCount;
    }

    public void setPeerReviewCount(Integer peerReviewCount) {
        this.peerReviewCount = peerReviewCount;
    }

    public String getPeerReviewsAssignAt() {
        return peerReviewsAssignAt;
    }

    public void setPeerReviewsAssignAt(String peerReviewsAssignAt) {
        this.peerReviewsAssignAt = peerReviewsAssignAt;
    }

    public Boolean getIntraGroupPeerReviews() {
        return intraGroupPeerReviews;
    }

    public void setIntraGroupPeerReviews(Boolean intraGroupPeerReviews) {
        this.intraGroupPeerReviews = intraGroupPeerReviews;
    }

    public Integer getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(Integer groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    public Integer getNeedsGradingCount() {
        return needsGradingCount;
    }

    public void setNeedsGradingCount(Integer needsGradingCount) {
        this.needsGradingCount = needsGradingCount;
    }

    public List<NeedsGradingCountBySection> getNeedsGradingCountBySection() {
        return needsGradingCountBySection;
    }

    public void setNeedsGradingCountBySection(List<NeedsGradingCountBySection> needsGradingCountBySection) {
        this.needsGradingCountBySection = needsGradingCountBySection;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getPostToSis() {
        return postToSis;
    }

    public void setPostToSis(Boolean postToSis) {
        this.postToSis = postToSis;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public IntegrationData getIntegrationData() {
        return integrationData;
    }

    public void setIntegrationData(IntegrationData integrationData) {
        this.integrationData = integrationData;
    }

    public Double getPointsPossible() {
        return pointsPossible;
    }

    public void setPointsPossible(Double pointsPossible) {
        this.pointsPossible = pointsPossible;
    }

    public List<String> getSubmissionTypes() {
        return submissionTypes;
    }

    public void setSubmissionTypes(List<String> submissionTypes) {
        this.submissionTypes = submissionTypes;
    }

    public Boolean getHasSubmittedSubmissions() {
        return hasSubmittedSubmissions;
    }

    public void setHasSubmittedSubmissions(Boolean hasSubmittedSubmissions) {
        this.hasSubmittedSubmissions = hasSubmittedSubmissions;
    }

    public String getGradingType() {
        return gradingType;
    }

    public void setGradingType(String gradingType) {
        this.gradingType = gradingType;
    }

    public Object getGradingStandardId() {
        return gradingStandardId;
    }

    public void setGradingStandardId(Object gradingStandardId) {
        this.gradingStandardId = gradingStandardId;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Boolean getUnpublishable() {
        return unpublishable;
    }

    public void setUnpublishable(Boolean unpublishable) {
        this.unpublishable = unpublishable;
    }

    public Boolean getOnlyVisibleToOverrides() {
        return onlyVisibleToOverrides;
    }

    public void setOnlyVisibleToOverrides(Boolean onlyVisibleToOverrides) {
        this.onlyVisibleToOverrides = onlyVisibleToOverrides;
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

    public Integer getQuizId() {
        return quizId;
    }

    public void setQuizId(Integer quizId) {
        this.quizId = quizId;
    }

    public Boolean getAnonymousSubmissions() {
        return anonymousSubmissions;
    }

    public void setAnonymousSubmissions(Boolean anonymousSubmissions) {
        this.anonymousSubmissions = anonymousSubmissions;
    }

    public Object getDiscussionTopic() {
        return discussionTopic;
    }

    public void setDiscussionTopic(Object discussionTopic) {
        this.discussionTopic = discussionTopic;
    }

    public Boolean getFreezeOnCopy() {
        return freezeOnCopy;
    }

    public void setFreezeOnCopy(Boolean freezeOnCopy) {
        this.freezeOnCopy = freezeOnCopy;
    }

    public Boolean getFrozen() {
        return frozen;
    }

    public void setFrozen(Boolean frozen) {
        this.frozen = frozen;
    }

    public List<String> getFrozenAttributes() {
        return frozenAttributes;
    }

    public void setFrozenAttributes(List<String> frozenAttributes) {
        this.frozenAttributes = frozenAttributes;
    }

    public Object getSubmission() {
        return submission;
    }

    public void setSubmission(Object submission) {
        this.submission = submission;
    }

    public Boolean getUseRubricForGrading() {
        return useRubricForGrading;
    }

    public void setUseRubricForGrading(Boolean useRubricForGrading) {
        this.useRubricForGrading = useRubricForGrading;
    }

    public RubricSettings getRubricSettings() {
        return rubricSettings;
    }

    public void setRubricSettings(RubricSettings rubricSettings) {
        this.rubricSettings = rubricSettings;
    }

    public Object getRubric() {
        return rubric;
    }

    public void setRubric(Object rubric) {
        this.rubric = rubric;
    }

    public List<Integer> getAssignmentVisibility() {
        return assignmentVisibility;
    }

    public void setAssignmentVisibility(List<Integer> assignmentVisibility) {
        this.assignmentVisibility = assignmentVisibility;
    }

    public Object getOverrides() {
        return overrides;
    }

    public void setOverrides(Object overrides) {
        this.overrides = overrides;
    }

    public Boolean getOmitFromFinalGrade() {
        return omitFromFinalGrade;
    }

    public void setOmitFromFinalGrade(Boolean omitFromFinalGrade) {
        this.omitFromFinalGrade = omitFromFinalGrade;
    }

    public Boolean getModeratedGrading() {
        return moderatedGrading;
    }

    public void setModeratedGrading(Boolean moderatedGrading) {
        this.moderatedGrading = moderatedGrading;
    }

    public Integer getGraderCount() {
        return graderCount;
    }

    public void setGraderCount(Integer graderCount) {
        this.graderCount = graderCount;
    }

    public Integer getFinalGraderId() {
        return finalGraderId;
    }

    public void setFinalGraderId(Integer finalGraderId) {
        this.finalGraderId = finalGraderId;
    }

    public Boolean getGraderCommentsVisibleToGraders() {
        return graderCommentsVisibleToGraders;
    }

    public void setGraderCommentsVisibleToGraders(Boolean graderCommentsVisibleToGraders) {
        this.graderCommentsVisibleToGraders = graderCommentsVisibleToGraders;
    }

    public Boolean getGradersAnonymousToGraders() {
        return gradersAnonymousToGraders;
    }

    public void setGradersAnonymousToGraders(Boolean gradersAnonymousToGraders) {
        this.gradersAnonymousToGraders = gradersAnonymousToGraders;
    }

    public Boolean getGraderNamesVisibleToFinalGrader() {
        return graderNamesVisibleToFinalGrader;
    }

    public void setGraderNamesVisibleToFinalGrader(Boolean graderNamesVisibleToFinalGrader) {
        this.graderNamesVisibleToFinalGrader = graderNamesVisibleToFinalGrader;
    }

    public Boolean getAnonymousGrading() {
        return anonymousGrading;
    }

    public void setAnonymousGrading(Boolean anonymousGrading) {
        this.anonymousGrading = anonymousGrading;
    }

    public Integer getAllowedAttempts() {
        return allowedAttempts;
    }

    public void setAllowedAttempts(Integer allowedAttempts) {
        this.allowedAttempts = allowedAttempts;
    }

    public Boolean getPostManually() {
        return postManually;
    }

    public void setPostManually(Boolean postManually) {
        this.postManually = postManually;
    }

    public Object getScoreStatistics() {
        return scoreStatistics;
    }

    public void setScoreStatistics(Object scoreStatistics) {
        this.scoreStatistics = scoreStatistics;
    }

    public Boolean getCanSubmit() {
        return canSubmit;
    }

    public void setCanSubmit(Boolean canSubmit) {
        this.canSubmit = canSubmit;
    }

}

