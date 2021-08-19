package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class Enrollment extends CanvasClient {

    private String courseId;
    private String userId;
    private String enrollmentAccountId;
    private String enrollmentId;
    private String sectionId;

    private String type;
    private String role;
    private String state;
    private String include;
    private String gradingPeriodId;
    private String enrollmentTermId;
    private String sisAccountId;
    private String sisCourseId;
    private String sisSectionId;
    private String sisUserId;
    private Boolean createdForSisId;

    private ZonedDateTime enrollmentStartAt;
    private ZonedDateTime enrollmentEndAt;
    private String enrollmentUserId;
    private String enrollmentType;
    private Integer enrollmentRoleId;
    private String enrollmentState;
    private Integer enrollmentCourseSectionId;
    private Boolean enrollmentLimitPrivilegesToCourseSection;
    private Boolean notify;
    private String enrollmentSelfEnrollmentCode;
    private Boolean enrollmentSelfEnrolled;
    private Integer enrollmentAssociatedUserId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();
        if(this.enrollmentStartAt != null){
            queries.put("enrollment[start_at]",this.enrollmentStartAt);
        }
        if(this.enrollmentEndAt != null){
            queries.put("enrollment[end_at]",this.enrollmentEndAt);
        }
        if(this.enrollmentUserId != null){
            queries.put("enrollment[user_id]",this.enrollmentUserId);
        }
        if(this.enrollmentType != null){
            queries.put("enrollment[type]",this.enrollmentType);
        }
        if(this.enrollmentRoleId != null){
            queries.put("enrollment[role_id]",this.enrollmentRoleId);
        }
        if(this.enrollmentState != null){
            queries.put("enrollment[enrollment_state]",this.enrollmentState);
        }
        if(this.enrollmentCourseSectionId != null){
            queries.put("enrollment[course_section_id]",this.enrollmentCourseSectionId);
        }
        if(this.enrollmentLimitPrivilegesToCourseSection != null){
            queries.put("enrollment[limit_privileges_to_course_section]",this.enrollmentLimitPrivilegesToCourseSection);
        }
        if(this.notify != null){
            queries.put("enrollment[notify]",this.notify);
        }
        if(this.enrollmentSelfEnrollmentCode != null){
            queries.put("enrollment[self_enrollment_code]",this.enrollmentSelfEnrollmentCode);
        }
        if(this.enrollmentSelfEnrolled != null){
            queries.put("enrollment[self_enrolled]",this.enrollmentSelfEnrolled);
        }
        if(this.enrollmentAssociatedUserId != null){
            queries.put("enrollment[associated_user_id]",this.enrollmentAssociatedUserId);
        }

        if(this.type != null){
            queries.put("type[]",this.type);
        }
        if(this.role != null){
            queries.put("role[]",this.role);
        }
        if(this.state != null){
            queries.put("state[]",this.state);
        }
        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.userId != null){
            queries.put("user_id",this.userId);
        }
        if(this.gradingPeriodId != null){
            queries.put("grading_period_id",this.gradingPeriodId);
        }
        if(this.enrollmentTermId != null){
            queries.put("enrollment_term_id",this.enrollmentTermId);
        }
        if(this.sisAccountId != null){
            queries.put("sis_account_id[]",this.sisAccountId);
        }
        if(this.sisCourseId != null){
            queries.put("sis_course_id[]",this.sisCourseId);
        }
        if(this.sisSectionId != null){
            queries.put("sis_section_id[]",this.sisSectionId);
        }
        if(this.sisUserId != null){
            queries.put("sis_user_id[]",this.sisUserId);
        }
        if(this.createdForSisId != null){
            queries.put("created_for_sis_id[]",this.createdForSisId);
        }
        return queries;

    }

    public void clearQueries(){

          type= null;
          role= null;
          state= null;
          include= null;
          gradingPeriodId= null;
          enrollmentTermId= null;
          sisAccountId= null;
          sisCourseId= null;
          sisSectionId= null;
          sisUserId= null;
          createdForSisId= null;
          enrollmentStartAt = null;
          enrollmentEndAt = null;
          enrollmentUserId = null;
          enrollmentType = null;
          enrollmentRoleId = null;
          enrollmentState = null;
          enrollmentCourseSectionId = null;
          enrollmentLimitPrivilegesToCourseSection = null;
          notify = null;
          enrollmentSelfEnrollmentCode = null;
          enrollmentSelfEnrolled = null;
          enrollmentAssociatedUserId = null;

    }

    public ZonedDateTime getEnrollmentStartAt() {
        return enrollmentStartAt;
    }

    public void setEnrollmentStartAt(ZonedDateTime enrollmentStartAt) {
        this.enrollmentStartAt = enrollmentStartAt;
    }

    public ZonedDateTime getEnrollmentEndAt() {
        return enrollmentEndAt;
    }

    public void setEnrollmentEndAt(ZonedDateTime enrollmentEndAt) {
        this.enrollmentEndAt = enrollmentEndAt;
    }

    public String getEnrollmentUserId() {
        return enrollmentUserId;
    }

    public void setEnrollmentUserId(String enrollmentUserId) {
        this.enrollmentUserId = enrollmentUserId;
    }

    public String getEnrollmentType() {
        return enrollmentType;
    }

    public void setEnrollmentType(String enrollmentType) {
        this.enrollmentType = enrollmentType;
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

    public Integer getEnrollmentCourseSectionId() {
        return enrollmentCourseSectionId;
    }

    public void setEnrollmentCourseSectionId(Integer enrollmentCourseSectionId) {
        this.enrollmentCourseSectionId = enrollmentCourseSectionId;
    }

    public Boolean getEnrollmentLimitPrivilegesToCourseSection() {
        return enrollmentLimitPrivilegesToCourseSection;
    }

    public void setEnrollmentLimitPrivilegesToCourseSection(Boolean enrollmentLimitPrivilegesToCourseSection) {
        this.enrollmentLimitPrivilegesToCourseSection = enrollmentLimitPrivilegesToCourseSection;
    }

    public Boolean getNotify() {
        return notify;
    }

    public void setNotify(Boolean notify) {
        this.notify = notify;
    }

    public String getEnrollmentSelfEnrollmentCode() {
        return enrollmentSelfEnrollmentCode;
    }

    public void setEnrollmentSelfEnrollmentCode(String enrollmentSelfEnrollmentCode) {
        this.enrollmentSelfEnrollmentCode = enrollmentSelfEnrollmentCode;
    }

    public Boolean getEnrollmentSelfEnrolled() {
        return enrollmentSelfEnrolled;
    }

    public void setEnrollmentSelfEnrolled(Boolean enrollmentSelfEnrolled) {
        this.enrollmentSelfEnrolled = enrollmentSelfEnrolled;
    }

    public Integer getEnrollmentAssociatedUserId() {
        return enrollmentAssociatedUserId;
    }

    public void setEnrollmentAssociatedUserId(Integer enrollmentAssociatedUserId) {
        this.enrollmentAssociatedUserId = enrollmentAssociatedUserId;
    }

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getEnrollmentAccountId() {
        return enrollmentAccountId;
    }

    public void setEnrollmentAccountId(String enrollmentAccountId) {
        this.enrollmentAccountId = enrollmentAccountId;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getGradingPeriodId() {
        return gradingPeriodId;
    }

    public void setGradingPeriodId(String gradingPeriodId) {
        this.gradingPeriodId = gradingPeriodId;
    }

    public String getEnrollmentTermId() {
        return enrollmentTermId;
    }

    public void setEnrollmentTermId(String enrollmentTermId) {
        this.enrollmentTermId = enrollmentTermId;
    }

    public String getSisAccountId() {
        return sisAccountId;
    }

    public void setSisAccountId(String sisAccountId) {
        this.sisAccountId = sisAccountId;
    }

    public String getSisCourseId() {
        return sisCourseId;
    }

    public void setSisCourseId(String sisCourseId) {
        this.sisCourseId = sisCourseId;
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

    public Boolean getCreatedForSisId() {
        return createdForSisId;
    }

    public void setCreatedForSisId(Boolean createdForSisId) {
        this.createdForSisId = createdForSisId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
