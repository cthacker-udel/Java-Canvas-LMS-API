package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class EnrollmentTerms extends CanvasClient {

    private String enrollmentTermName;
    private ZonedDateTime enrollmentStartAt;
    private ZonedDateTime enrollmentEndAt;
    private String sisTermId;
    private ZonedDateTime overrideEnrollmentStartAt;
    private ZonedDateTime overrideEnrollmentEndAt;
    private String enrollmentAccountId;
    private String courseId;
    private String enrollmentTermId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.enrollmentTermName != null){
            queries.put("enrollment_term[name]",this.enrollmentTermName);
        }
        if(this.enrollmentStartAt != null){
            queries.put("enrollment_term[start_at]",this.enrollmentStartAt);
        }
        if(this.enrollmentEndAt != null){
            queries.put("enrollment_term[end_at]",this.enrollmentEndAt);
        }
        if(this.overrideEnrollmentStartAt != null){
            queries.put("enrollment_term[overrides][enrollment_type][start_at]",this.overrideEnrollmentStartAt);
        }
        if(this.overrideEnrollmentEndAt != null){
            queries.put("enrollment_term[overrides][enrollment_type][end_at]",this.overrideEnrollmentEndAt);
        }
        if(this.sisTermId != null){
            queries.put("enrollment_term[sis_term_id]",this.sisTermId);
        }
        return queries;

    }

    public void clearQueries(){

        this.enrollmentTermName = null;
        this.enrollmentStartAt = null;
        this.enrollmentEndAt = null;
        this.sisTermId = null;
        this.overrideEnrollmentEndAt = null;
        this.overrideEnrollmentStartAt = null;

    }

    public String getEnrollmentAccountId() {
        return enrollmentAccountId;
    }

    public void setEnrollmentAccountId(String enrollmentAccountId) {
        this.enrollmentAccountId = enrollmentAccountId;
    }

    public String getEnrollmentTermName() {
        return enrollmentTermName;
    }

    public void setEnrollmentTermName(String enrollmentTermName) {
        this.enrollmentTermName = enrollmentTermName;
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

    public String getSisTermId() {
        return sisTermId;
    }

    public void setSisTermId(String sisTermId) {
        this.sisTermId = sisTermId;
    }

    public ZonedDateTime getOverrideEnrollmentStartAt() {
        return overrideEnrollmentStartAt;
    }

    public void setOverrideEnrollmentStartAt(ZonedDateTime overrideEnrollmentStartAt) {
        this.overrideEnrollmentStartAt = overrideEnrollmentStartAt;
    }

    public ZonedDateTime getOverrideEnrollmentEndAt() {
        return overrideEnrollmentEndAt;
    }

    public void setOverrideEnrollmentEndAt(ZonedDateTime overrideEnrollmentEndAt) {
        this.overrideEnrollmentEndAt = overrideEnrollmentEndAt;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getEnrollmentTermId() {
        return enrollmentTermId;
    }

    public void setEnrollmentTermId(String enrollmentTermId) {
        this.enrollmentTermId = enrollmentTermId;
    }
}
