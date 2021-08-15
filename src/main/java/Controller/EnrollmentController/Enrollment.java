package Controller.EnrollmentController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Enrollment {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("course_id")
    @Expose
    private Integer courseId;
    @SerializedName("sis_course_id")
    @Expose
    private String sisCourseId;
    @SerializedName("course_integration_id")
    @Expose
    private String courseIntegrationId;
    @SerializedName("course_section_id")
    @Expose
    private Integer courseSectionId;
    @SerializedName("section_integration_id")
    @Expose
    private String sectionIntegrationId;
    @SerializedName("sis_account_id")
    @Expose
    private String sisAccountId;
    @SerializedName("sis_section_id")
    @Expose
    private String sisSectionId;
    @SerializedName("sis_user_id")
    @Expose
    private String sisUserId;
    @SerializedName("enrollment_state")
    @Expose
    private String enrollmentState;
    @SerializedName("limit_privileges_to_course_section")
    @Expose
    private Boolean limitPrivilegesToCourseSection;
    @SerializedName("sis_import_id")
    @Expose
    private Integer sisImportId;
    @SerializedName("root_account_id")
    @Expose
    private Integer rootAccountId;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("associated_user_id")
    @Expose
    private Object associatedUserId;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("end_at")
    @Expose
    private String endAt;
    @SerializedName("last_activity_at")
    @Expose
    private String lastActivityAt;
    @SerializedName("last_attended_at")
    @Expose
    private String lastAttendedAt;
    @SerializedName("total_activity_time")
    @Expose
    private Integer totalActivityTime;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("grades")
    @Expose
    private Grades grades;
    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("override_grade")
    @Expose
    private String overrideGrade;
    @SerializedName("override_score")
    @Expose
    private Double overrideScore;
    @SerializedName("unposted_current_grade")
    @Expose
    private String unpostedCurrentGrade;
    @SerializedName("unposted_final_grade")
    @Expose
    private String unpostedFinalGrade;
    @SerializedName("unposted_current_score")
    @Expose
    private String unpostedCurrentScore;
    @SerializedName("unposted_final_score")
    @Expose
    private String unpostedFinalScore;
    @SerializedName("has_grading_periods")
    @Expose
    private Boolean hasGradingPeriods;
    @SerializedName("totals_for_all_grading_periods_option")
    @Expose
    private Boolean totalsForAllGradingPeriodsOption;
    @SerializedName("current_grading_period_title")
    @Expose
    private String currentGradingPeriodTitle;
    @SerializedName("current_grading_period_id")
    @Expose
    private Integer currentGradingPeriodId;
    @SerializedName("current_period_override_grade")
    @Expose
    private String currentPeriodOverrideGrade;
    @SerializedName("current_period_override_score")
    @Expose
    private Double currentPeriodOverrideScore;
    @SerializedName("current_period_unposted_current_score")
    @Expose
    private Double currentPeriodUnpostedCurrentScore;
    @SerializedName("current_period_unposted_final_score")
    @Expose
    private Double currentPeriodUnpostedFinalScore;
    @SerializedName("current_period_unposted_current_grade")
    @Expose
    private String currentPeriodUnpostedCurrentGrade;
    @SerializedName("current_period_unposted_final_grade")
    @Expose
    private String currentPeriodUnpostedFinalGrade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getSisCourseId() {
        return sisCourseId;
    }

    public void setSisCourseId(String sisCourseId) {
        this.sisCourseId = sisCourseId;
    }

    public String getCourseIntegrationId() {
        return courseIntegrationId;
    }

    public void setCourseIntegrationId(String courseIntegrationId) {
        this.courseIntegrationId = courseIntegrationId;
    }

    public Integer getCourseSectionId() {
        return courseSectionId;
    }

    public void setCourseSectionId(Integer courseSectionId) {
        this.courseSectionId = courseSectionId;
    }

    public String getSectionIntegrationId() {
        return sectionIntegrationId;
    }

    public void setSectionIntegrationId(String sectionIntegrationId) {
        this.sectionIntegrationId = sectionIntegrationId;
    }

    public String getSisAccountId() {
        return sisAccountId;
    }

    public void setSisAccountId(String sisAccountId) {
        this.sisAccountId = sisAccountId;
    }

    public String getSisSectionId() {
        return sisSectionId;
    }

    public void setSisSectionId(String sisSectionId) {
        this.sisSectionId = sisSectionId;
    }

    public String getSisUserId() {
        return sisUserId;
    }

    public void setSisUserId(String sisUserId) {
        this.sisUserId = sisUserId;
    }

    public String getEnrollmentState() {
        return enrollmentState;
    }

    public void setEnrollmentState(String enrollmentState) {
        this.enrollmentState = enrollmentState;
    }

    public Boolean getLimitPrivilegesToCourseSection() {
        return limitPrivilegesToCourseSection;
    }

    public void setLimitPrivilegesToCourseSection(Boolean limitPrivilegesToCourseSection) {
        this.limitPrivilegesToCourseSection = limitPrivilegesToCourseSection;
    }

    public Integer getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }

    public Integer getRootAccountId() {
        return rootAccountId;
    }

    public void setRootAccountId(Integer rootAccountId) {
        this.rootAccountId = rootAccountId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Object getAssociatedUserId() {
        return associatedUserId;
    }

    public void setAssociatedUserId(Object associatedUserId) {
        this.associatedUserId = associatedUserId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    public String getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public String getLastAttendedAt() {
        return lastAttendedAt;
    }

    public void setLastAttendedAt(String lastAttendedAt) {
        this.lastAttendedAt = lastAttendedAt;
    }

    public Integer getTotalActivityTime() {
        return totalActivityTime;
    }

    public void setTotalActivityTime(Integer totalActivityTime) {
        this.totalActivityTime = totalActivityTime;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Grades getGrades() {
        return grades;
    }

    public void setGrades(Grades grades) {
        this.grades = grades;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOverrideGrade() {
        return overrideGrade;
    }

    public void setOverrideGrade(String overrideGrade) {
        this.overrideGrade = overrideGrade;
    }

    public Double getOverrideScore() {
        return overrideScore;
    }

    public void setOverrideScore(Double overrideScore) {
        this.overrideScore = overrideScore;
    }

    public String getUnpostedCurrentGrade() {
        return unpostedCurrentGrade;
    }

    public void setUnpostedCurrentGrade(String unpostedCurrentGrade) {
        this.unpostedCurrentGrade = unpostedCurrentGrade;
    }

    public String getUnpostedFinalGrade() {
        return unpostedFinalGrade;
    }

    public void setUnpostedFinalGrade(String unpostedFinalGrade) {
        this.unpostedFinalGrade = unpostedFinalGrade;
    }

    public String getUnpostedCurrentScore() {
        return unpostedCurrentScore;
    }

    public void setUnpostedCurrentScore(String unpostedCurrentScore) {
        this.unpostedCurrentScore = unpostedCurrentScore;
    }

    public String getUnpostedFinalScore() {
        return unpostedFinalScore;
    }

    public void setUnpostedFinalScore(String unpostedFinalScore) {
        this.unpostedFinalScore = unpostedFinalScore;
    }

    public Boolean getHasGradingPeriods() {
        return hasGradingPeriods;
    }

    public void setHasGradingPeriods(Boolean hasGradingPeriods) {
        this.hasGradingPeriods = hasGradingPeriods;
    }

    public Boolean getTotalsForAllGradingPeriodsOption() {
        return totalsForAllGradingPeriodsOption;
    }

    public void setTotalsForAllGradingPeriodsOption(Boolean totalsForAllGradingPeriodsOption) {
        this.totalsForAllGradingPeriodsOption = totalsForAllGradingPeriodsOption;
    }

    public String getCurrentGradingPeriodTitle() {
        return currentGradingPeriodTitle;
    }

    public void setCurrentGradingPeriodTitle(String currentGradingPeriodTitle) {
        this.currentGradingPeriodTitle = currentGradingPeriodTitle;
    }

    public Integer getCurrentGradingPeriodId() {
        return currentGradingPeriodId;
    }

    public void setCurrentGradingPeriodId(Integer currentGradingPeriodId) {
        this.currentGradingPeriodId = currentGradingPeriodId;
    }

    public String getCurrentPeriodOverrideGrade() {
        return currentPeriodOverrideGrade;
    }

    public void setCurrentPeriodOverrideGrade(String currentPeriodOverrideGrade) {
        this.currentPeriodOverrideGrade = currentPeriodOverrideGrade;
    }

    public Double getCurrentPeriodOverrideScore() {
        return currentPeriodOverrideScore;
    }

    public void setCurrentPeriodOverrideScore(Double currentPeriodOverrideScore) {
        this.currentPeriodOverrideScore = currentPeriodOverrideScore;
    }

    public Double getCurrentPeriodUnpostedCurrentScore() {
        return currentPeriodUnpostedCurrentScore;
    }

    public void setCurrentPeriodUnpostedCurrentScore(Double currentPeriodUnpostedCurrentScore) {
        this.currentPeriodUnpostedCurrentScore = currentPeriodUnpostedCurrentScore;
    }

    public Double getCurrentPeriodUnpostedFinalScore() {
        return currentPeriodUnpostedFinalScore;
    }

    public void setCurrentPeriodUnpostedFinalScore(Double currentPeriodUnpostedFinalScore) {
        this.currentPeriodUnpostedFinalScore = currentPeriodUnpostedFinalScore;
    }

    public String getCurrentPeriodUnpostedCurrentGrade() {
        return currentPeriodUnpostedCurrentGrade;
    }

    public void setCurrentPeriodUnpostedCurrentGrade(String currentPeriodUnpostedCurrentGrade) {
        this.currentPeriodUnpostedCurrentGrade = currentPeriodUnpostedCurrentGrade;
    }

    public String getCurrentPeriodUnpostedFinalGrade() {
        return currentPeriodUnpostedFinalGrade;
    }

    public void setCurrentPeriodUnpostedFinalGrade(String currentPeriodUnpostedFinalGrade) {
        this.currentPeriodUnpostedFinalGrade = currentPeriodUnpostedFinalGrade;
    }

}
