package getRequests;

import Client.CanvasClient;
import Controller.AssignmentsController.AssignmentOverride;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment extends CanvasClient {

    private String courseId;
    private String assignmentId;
    private String include;
    private String searchTerm;
    private Boolean overrideAssignmentDates;
    private Boolean needsGradingCountBySection;
    private String bucket;
    private String assignmentIds;
    private String orderBy;
    private Boolean postToSis;
    private String userId;
    private String resultType;
    private Boolean allDates;

    private String name;
    private Integer position;
    private ArrayList<String> submissionTypes = new ArrayList<>();
    private ArrayList<String> allowedExtensions = new ArrayList<>();
    private Boolean turnItInEnabled;
    private Boolean vericiteEnabled;
    private String turnItInSettings;
    private String integrationData;
    private String integrationId;
    private Boolean peerReviews;
    private Boolean automaticPeerReviews;
    private Boolean notifyOfUpdate;
    private Integer groupCategoryId;
    private Integer gradeGroupStudentsIndividually;
    private String externalToolTagAttributes;
    private Integer pointPossible;
    private String gradingType;
    private ZonedDateTime dueAt;
    private ZonedDateTime lockAt;
    private ZonedDateTime unlockAt;
    private String description;
    private Integer assignmentGroupId;
    private List<AssignmentOverride> assignmentOverrideList = new ArrayList<>();
    private Boolean onlyVisibleToOverrides;
    private Boolean published;
    private Integer gradingStandardId;
    private Boolean omitFromFinalGrade;
    private Boolean quizLTI;
    private Boolean moderatedGrading;
    private Integer graderCount;
    private Integer finalGraderId;
    private Boolean graderCommentsVisibleToGraders;
    private Boolean gradersAnonymousToGraders;
    private Boolean gradersNamesVisibleToFinalGrader;
    private Boolean anonymousGrading;
    private Integer allowedAttempts;
    private Integer annotatableAttachmentId;
    private String assignmentOverrideId;
    private String groupId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<String,Object>();

        if(this.annotatableAttachmentId != null){
            queries.put("assignment[annotatable_attachment_id]",this.annotatableAttachmentId);
        }
        if(this.allowedAttempts != null){
            queries.put("assignment[allowed_attempts]",this.allowedAttempts);
        }
        if(this.anonymousGrading != null){
            queries.put("assignment[anonymous_grading]",this.anonymousGrading);
        }
        if(this.gradersNamesVisibleToFinalGrader != null){
            queries.put("assignment[graders_name_visible_to_final_grader]",this.gradersNamesVisibleToFinalGrader);
        }
        if(this.gradersAnonymousToGraders != null){
            queries.put("assignment[graders_anonymous_to_graders]",this.gradersAnonymousToGraders);
        }
        if(this.graderCommentsVisibleToGraders != null){
            queries.put("assignment[grader_comments_visible_to_graders]",this.graderCommentsVisibleToGraders);
        }
        if(this.finalGraderId != null){
            queries.put("assignment[final_grader_id]",this.finalGraderId);
        }
        if(this.graderCount != null){
            queries.put("assignment[grader_count]",this.graderCount);
        }
        if(this.moderatedGrading != null){
            queries.put("assignment[moderated_grading]",this.moderatedGrading);
        }
        if(this.quizLTI != null){
            queries.put("assignment[quiz_lti]",this.quizLTI);
        }
        if(this.omitFromFinalGrade != null){
            queries.put("assignment[omit_from_final_grade]",this.omitFromFinalGrade);
        }
        if(this.gradingStandardId != null){
            queries.put("grading_standard_id",this.gradingStandardId);
        }
        if(this.published != null){
            queries.put("assignment[published]",this.published);
        }
        if(this.onlyVisibleToOverrides != null){
            queries.put("assignment[only_visible_to_overrides]",this.onlyVisibleToOverrides);
        }
        if(this.assignmentOverrideList.size() > 0){
            queries.put("assignment[assignment_overrides][]",this.assignmentOverrideList.toArray(AssignmentOverride[]::new));
        }
        if(this.assignmentGroupId != null){
            queries.put("assignment[assignment_group_id]",this.assignmentGroupId);
        }
        if(this.description != null){
            queries.put("assignment[description]",this.description);
        }
        if(this.unlockAt != null){
            queries.put("assignment[unlock_at]",this.unlockAt);
        }
        if(this.lockAt != null){
            queries.put("assignment[lock_at]",this.lockAt);
        }
        if(this.dueAt != null){
            queries.put("assignment[due_at]",this.dueAt);
        }
        if(this.gradingType != null){
            queries.put("assignment[grading_type]",this.gradingType);
        }
        if(this.pointPossible != null){
            queries.put("assignment[points_possible]",this.pointPossible);
        }
        if(this.externalToolTagAttributes != null){
            queries.put("assignment[external_tool_tag_attributes]",this.externalToolTagAttributes);
        }
        if(this.gradeGroupStudentsIndividually != null){
            queries.put("assignment[grade_group_students_individually]",this.gradeGroupStudentsIndividually);
        }
        if(this.groupCategoryId != null){
            queries.put("assignment[group_category_id]",this.groupCategoryId);
        }
        if(this.notifyOfUpdate != null){
            queries.put("assignment[notify_of_update]",this.notifyOfUpdate);
        }
        if(this.automaticPeerReviews != null){
            queries.put("assignment[automatic_peer_reviews]",this.automaticPeerReviews);
        }
        if(this.peerReviews != null){
            queries.put("assignment[peer_reviews]",this.peerReviews);
        }
        if(this.integrationId != null){
            queries.put("assignment[integration_id]",this.integrationId);
        }
        if(this.integrationData != null){
            queries.put("assignment[integration_data]",this.integrationData);
        }
        if(this.turnItInSettings != null){
            queries.put("assignment[turnitin_settings]",this.turnItInSettings);
        }
        if(this.turnItInEnabled != null){
            queries.put("assignment[turnitin_enabled]",this.turnItInEnabled);
        }
        if(this.vericiteEnabled != null){
            queries.put("assignment[vericite_enabled]",this.vericiteEnabled);
        }
        if(this.allowedExtensions.size() > 0){
            queries.put("assignment[allowed_extensions][]",this.allowedExtensions.toArray(String[]::new));
        }
        if(this.submissionTypes.size() > 0){
            queries.put("assignment[submission_types][]",this.submissionTypes.toArray(String[]::new));
        }
        if(this.position != null){
            queries.put("assignment[position]",this.position);
        }
        if(this.name != null){
            queries.put("assignment[name]",this.name);
        }
        if(this.allDates != null){
            queries.put("all_dates",this.allDates);
        }
        if(this.resultType != null){
            queries.put("result_type",this.resultType);
        }
        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.searchTerm != null){
            queries.put("search_term",this.searchTerm);
        }
        if(this.overrideAssignmentDates != null){
            queries.put("override_assignment_dates",this.overrideAssignmentDates);
        }
        if(this.needsGradingCountBySection != null){
            queries.put("needs_grading_count_by_section",this.needsGradingCountBySection);
        }
        if(this.bucket != null){
            queries.put("bucket",this.bucket);
        }
        if(this.assignmentIds != null){
            queries.put("assignment_ids[]",this.assignmentIds);
        }
        if(this.orderBy != null){
            queries.put("order_by",this.orderBy);
        }
        if(this.postToSis != null){
            queries.put("post_to_sis",this.postToSis);
        }

        return queries;
    }

    public void clearQueries(){

        this.include = null;
        this.searchTerm = null;
        this.overrideAssignmentDates = null;
        this.needsGradingCountBySection = null;
        this.bucket = null;
        this.assignmentIds = null;
        this.orderBy = null;
        this.postToSis = null;
        this.resultType = null;
        this.allDates = null;
        String name= null;
        Integer position= null;
        ArrayList<String> submissionTypes = new ArrayList<>();
        ArrayList<String> allowedExtensions = new ArrayList<>();
        Boolean turnItInEnabled= null;
        Boolean vericiteEnabled= null;
        String turnItInSettings= null;
        String integrationData= null;
        String integrationId= null;
        Boolean peerReviews= null;
        Boolean automaticPeerReviews= null;
        Boolean notifyOfUpdate= null;
        Integer groupCategoryId= null;
        Integer gradeGroupStudentsIndividually= null;
        String externalToolTagAttributes= null;
        Integer pointPossible= null;
        String gradingType= null;
        ZonedDateTime dueAt= null;
        ZonedDateTime lockAt= null;
        ZonedDateTime unlockAt= null;
        String description= null;
        Integer assignmentGroupId= null;
        List<AssignmentOverride> assignmentOverrideList = new ArrayList<>();
        Boolean onlyVisibleToOverrides= null;
        Boolean published= null;
        Integer gradingStandardId= null;
        Boolean omitFromFinalGrade= null;
        Boolean quizLTI= null;
        Boolean moderatedGrading= null;
        Integer graderCount= null;
        Integer finalGraderId= null;
        Boolean graderCommentsVisibleToGraders= null;
        Boolean gradersAnonymousToGraders= null;
        Boolean gradersNamesVisibleToFinalGrader= null;
        Boolean anonymousGrading= null;
        Integer allowedAttempts= null;
        Integer annotatableAttachmentId= null;

    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getAssignmentOverrideId() {
        return assignmentOverrideId;
    }

    public void setAssignmentOverrideId(String assignmentOverrideId) {
        this.assignmentOverrideId = assignmentOverrideId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public ArrayList<String> getSubmissionTypes() {
        return submissionTypes;
    }

    public void setSubmissionTypes(ArrayList<String> submissionTypes) {
        this.submissionTypes = submissionTypes;
    }

    public ArrayList<String> getAllowedExtensions() {
        return allowedExtensions;
    }

    public void setAllowedExtensions(ArrayList<String> allowedExtensions) {
        this.allowedExtensions = allowedExtensions;
    }

    public Boolean getTurnItInEnabled() {
        return turnItInEnabled;
    }

    public void setTurnItInEnabled(Boolean turnItInEnabled) {
        this.turnItInEnabled = turnItInEnabled;
    }

    public Boolean getVericiteEnabled() {
        return vericiteEnabled;
    }

    public void setVericiteEnabled(Boolean vericiteEnabled) {
        this.vericiteEnabled = vericiteEnabled;
    }

    public String getTurnItInSettings() {
        return turnItInSettings;
    }

    public void setTurnItInSettings(String turnItInSettings) {
        this.turnItInSettings = turnItInSettings;
    }

    public String getIntegrationData() {
        return integrationData;
    }

    public void setIntegrationData(String integrationData) {
        this.integrationData = integrationData;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
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

    public Boolean getNotifyOfUpdate() {
        return notifyOfUpdate;
    }

    public void setNotifyOfUpdate(Boolean notifyOfUpdate) {
        this.notifyOfUpdate = notifyOfUpdate;
    }

    public Integer getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(Integer groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    public Integer getGradeGroupStudentsIndividually() {
        return gradeGroupStudentsIndividually;
    }

    public void setGradeGroupStudentsIndividually(Integer gradeGroupStudentsIndividually) {
        this.gradeGroupStudentsIndividually = gradeGroupStudentsIndividually;
    }

    public String getExternalToolTagAttributes() {
        return externalToolTagAttributes;
    }

    public void setExternalToolTagAttributes(String externalToolTagAttributes) {
        this.externalToolTagAttributes = externalToolTagAttributes;
    }

    public Integer getPointPossible() {
        return pointPossible;
    }

    public void setPointPossible(Integer pointPossible) {
        this.pointPossible = pointPossible;
    }

    public String getGradingType() {
        return gradingType;
    }

    public void setGradingType(String gradingType) {
        this.gradingType = gradingType;
    }

    public ZonedDateTime getDueAt() {
        return dueAt;
    }

    public void setDueAt(ZonedDateTime dueAt) {
        this.dueAt = dueAt;
    }

    public ZonedDateTime getLockAt() {
        return lockAt;
    }

    public void setLockAt(ZonedDateTime lockAt) {
        this.lockAt = lockAt;
    }

    public ZonedDateTime getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(ZonedDateTime unlockAt) {
        this.unlockAt = unlockAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getAssignmentGroupId() {
        return assignmentGroupId;
    }

    public void setAssignmentGroupId(Integer assignmentGroupId) {
        this.assignmentGroupId = assignmentGroupId;
    }

    public List<AssignmentOverride> getAssignmentOverrideList() {
        return assignmentOverrideList;
    }

    public void setAssignmentOverrideList(List<AssignmentOverride> assignmentOverrideList) {
        this.assignmentOverrideList = assignmentOverrideList;
    }

    public Boolean getOnlyVisibleToOverrides() {
        return onlyVisibleToOverrides;
    }

    public void setOnlyVisibleToOverrides(Boolean onlyVisibleToOverrides) {
        this.onlyVisibleToOverrides = onlyVisibleToOverrides;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Integer getGradingStandardId() {
        return gradingStandardId;
    }

    public void setGradingStandardId(Integer gradingStandardId) {
        this.gradingStandardId = gradingStandardId;
    }

    public Boolean getOmitFromFinalGrade() {
        return omitFromFinalGrade;
    }

    public void setOmitFromFinalGrade(Boolean omitFromFinalGrade) {
        this.omitFromFinalGrade = omitFromFinalGrade;
    }

    public Boolean getQuizLTI() {
        return quizLTI;
    }

    public void setQuizLTI(Boolean quizLTI) {
        this.quizLTI = quizLTI;
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

    public Boolean getGradersNamesVisibleToFinalGrader() {
        return gradersNamesVisibleToFinalGrader;
    }

    public void setGradersNamesVisibleToFinalGrader(Boolean gradersNamesVisibleToFinalGrader) {
        this.gradersNamesVisibleToFinalGrader = gradersNamesVisibleToFinalGrader;
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

    public Integer getAnnotatableAttachmentId() {
        return annotatableAttachmentId;
    }

    public void setAnnotatableAttachmentId(Integer annotatableAttachmentId) {
        this.annotatableAttachmentId = annotatableAttachmentId;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public Boolean getAllDates() {
        return allDates;
    }

    public void setAllDates(Boolean allDates) {
        this.allDates = allDates;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Boolean getOverrideAssignmentDates() {
        return overrideAssignmentDates;
    }

    public void setOverrideAssignmentDates(Boolean overrideAssignmentDates) {
        this.overrideAssignmentDates = overrideAssignmentDates;
    }

    public Boolean getNeedsGradingCountBySection() {
        return needsGradingCountBySection;
    }

    public void setNeedsGradingCountBySection(Boolean needsGradingCountBySection) {
        this.needsGradingCountBySection = needsGradingCountBySection;
    }

    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public String getAssignmentIds() {
        return assignmentIds;
    }

    public void setAssignmentIds(String assignmentIds) {
        this.assignmentIds = assignmentIds;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Boolean getPostToSis() {
        return postToSis;
    }

    public void setPostToSis(Boolean postToSis) {
        this.postToSis = postToSis;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }
}
