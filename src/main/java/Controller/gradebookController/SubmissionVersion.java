package Controller.gradebookController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SubmissionVersion {

    @SerializedName("assignment_id")
    @Expose
    private Integer assignmentId;
    @SerializedName("assignment_name")
    @Expose
    private String assignmentName;
    @SerializedName("body")
    @Expose
    private String body;
    @SerializedName("current_grade")
    @Expose
    private String currentGrade;
    @SerializedName("current_graded_at")
    @Expose
    private String currentGradedAt;
    @SerializedName("current_grader")
    @Expose
    private String currentGrader;
    @SerializedName("grade_matches_current_submission")
    @Expose
    private Boolean gradeMatchesCurrentSubmission;
    @SerializedName("graded_at")
    @Expose
    private String gradedAt;
    @SerializedName("grader")
    @Expose
    private String grader;
    @SerializedName("grader_id")
    @Expose
    private Integer graderId;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("new_grade")
    @Expose
    private String newGrade;
    @SerializedName("new_graded_at")
    @Expose
    private String newGradedAt;
    @SerializedName("new_grader")
    @Expose
    private String newGrader;
    @SerializedName("previous_grade")
    @Expose
    private String previousGrade;
    @SerializedName("previous_graded_at")
    @Expose
    private String previousGradedAt;
    @SerializedName("previous_grader")
    @Expose
    private String previousGrader;
    @SerializedName("score")
    @Expose
    private Integer score;
    @SerializedName("user_name")
    @Expose
    private String userName;
    @SerializedName("submission_type")
    @Expose
    private String submissionType;
    @SerializedName("url")
    @Expose
    private Object url;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;

    public Integer getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(Integer assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public String getCurrentGradedAt() {
        return currentGradedAt;
    }

    public void setCurrentGradedAt(String currentGradedAt) {
        this.currentGradedAt = currentGradedAt;
    }

    public String getCurrentGrader() {
        return currentGrader;
    }

    public void setCurrentGrader(String currentGrader) {
        this.currentGrader = currentGrader;
    }

    public Boolean getGradeMatchesCurrentSubmission() {
        return gradeMatchesCurrentSubmission;
    }

    public void setGradeMatchesCurrentSubmission(Boolean gradeMatchesCurrentSubmission) {
        this.gradeMatchesCurrentSubmission = gradeMatchesCurrentSubmission;
    }

    public String getGradedAt() {
        return gradedAt;
    }

    public void setGradedAt(String gradedAt) {
        this.gradedAt = gradedAt;
    }

    public String getGrader() {
        return grader;
    }

    public void setGrader(String grader) {
        this.grader = grader;
    }

    public Integer getGraderId() {
        return graderId;
    }

    public void setGraderId(Integer graderId) {
        this.graderId = graderId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNewGrade() {
        return newGrade;
    }

    public void setNewGrade(String newGrade) {
        this.newGrade = newGrade;
    }

    public String getNewGradedAt() {
        return newGradedAt;
    }

    public void setNewGradedAt(String newGradedAt) {
        this.newGradedAt = newGradedAt;
    }

    public String getNewGrader() {
        return newGrader;
    }

    public void setNewGrader(String newGrader) {
        this.newGrader = newGrader;
    }

    public String getPreviousGrade() {
        return previousGrade;
    }

    public void setPreviousGrade(String previousGrade) {
        this.previousGrade = previousGrade;
    }

    public String getPreviousGradedAt() {
        return previousGradedAt;
    }

    public void setPreviousGradedAt(String previousGradedAt) {
        this.previousGradedAt = previousGradedAt;
    }

    public String getPreviousGrader() {
        return previousGrader;
    }

    public void setPreviousGrader(String previousGrader) {
        this.previousGrader = previousGrader;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public Object getUrl() {
        return url;
    }

    public void setUrl(Object url) {
        this.url = url;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

}
