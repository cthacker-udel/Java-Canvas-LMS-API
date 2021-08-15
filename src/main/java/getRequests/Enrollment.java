package getRequests;

import java.util.LinkedHashMap;
import java.util.Map;

public class Enrollment {

    private String courseId;
    private String userId;
    private String enrollmentAccountId;
    private String enrollmentId;

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

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

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
