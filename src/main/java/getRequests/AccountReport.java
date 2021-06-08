package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccountReport extends CanvasClient {

    private String reportId;
    private String reportType;
    private Integer courseId;
    private Boolean users;
    private Integer enrollmentTermId;
    private Boolean includeDeleted;
    private String order;
    private Boolean accounts;
    private Boolean terms;
    private Boolean courses;
    private Boolean sections;
    private Boolean enrollments;
    private Boolean groups;
    private Boolean xlist;
    private Integer sisTermsCsv;
    private Integer sisAccountsCsv;
    private Boolean includeEnrollmentState;
    private String enrollmentState;
    private ZonedDateTime startAt;
    private ZonedDateTime endAt;

    public AccountReport(){

    }

    public Map<String,Object> generateQueries(){
        Map<String,Object> queries = new LinkedHashMap<>();
        if(this.courseId != null){
            queries.put("course_id",this.courseId);
        }
        if(this.users != null){
            queries.put("users",this.users);
        }
        if(this.enrollmentTermId != null){
            queries.put("enrollment_term_id",this.enrollmentTermId);
        }
        if(this.includeDeleted != null){
            queries.put("include_deleted",this.includeDeleted);
        }
        if(this.order != null){
            queries.put("order",this.order);
        }
        if(this.accounts != null){
            queries.put("accounts",this.accounts);
        }
        if(this.terms != null){
            queries.put("terms",this.terms);
        }
        if(this.courses != null){
            queries.put("courses",this.courses);
        }
        if(this.sections != null){
            queries.put("sections",this.sections);
        }
        if(this.enrollments != null){
            queries.put("enrollments",this.enrollments);
        }
        if(this.groups != null){
            queries.put("groups",this.groups);
        }
        if(this.xlist != null){
            queries.put("xlist",this.xlist);
        }
        if(this.sisTermsCsv != null){
            queries.put("sis_terms_csv",this.sisTermsCsv);
        }
        if(this.sisAccountsCsv != null){
            queries.put("sis_accounts_csv",this.sisAccountsCsv);
        }
        if(this.includeEnrollmentState != null){
            queries.put("include_enrollment_state",this.includeEnrollmentState);
        }
        if(this.enrollmentState != null){
            queries.put("enrollment_state",this.enrollmentState);
        }
        if(this.startAt != null){
            queries.put("start_at",this.startAt);
        }
        if(this.endAt != null){
            queries.put("end_at",this.endAt);
        }
        return queries;
    }

    public void clearQueries(){

        this.enrollmentTermId = null;
        this.includeDeleted = null;
        this.courseId = null;
        this.order = null;
        this.users = null;
        this.accounts = null;
        this.terms = null;
        this.courses = null;
        this.sections = null;
        this.enrollments = null;
        this.groups = null;
        this.xlist = null;
        this.sisTermsCsv = null;
        this.sisAccountsCsv = null;
        this.includeEnrollmentState = null;
        this.enrollmentState = null;
        this.startAt = null;
        this.endAt = null;

    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Boolean getUsers() {
        return users;
    }

    public void setUsers(Boolean users) {
        this.users = users;
    }

    public Integer getEnrollmentTermId() {
        return enrollmentTermId;
    }

    public void setEnrollmentTermId(Integer enrollmentTermId) {
        enrollmentTermId = enrollmentTermId;
    }

    public Boolean getIncludeDeleted() {
        return includeDeleted;
    }

    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Boolean getAccounts() {
        return accounts;
    }

    public void setAccounts(Boolean accounts) {
        this.accounts = accounts;
    }

    public Boolean getTerms() {
        return terms;
    }

    public void setTerms(Boolean terms) {
        this.terms = terms;
    }

    public Boolean getCourses() {
        return courses;
    }

    public void setCourses(Boolean courses) {
        this.courses = courses;
    }

    public Boolean getSections() {
        return sections;
    }

    public void setSections(Boolean sections) {
        this.sections = sections;
    }

    public Boolean getEnrollments() {
        return enrollments;
    }

    public void setEnrollments(Boolean enrollments) {
        this.enrollments = enrollments;
    }

    public Boolean getGroups() {
        return groups;
    }

    public void setGroups(Boolean groups) {
        this.groups = groups;
    }

    public Boolean getXlist() {
        return xlist;
    }

    public void setXlist(Boolean xlist) {
        this.xlist = xlist;
    }

    public Integer getSisTermsCsv() {
        return sisTermsCsv;
    }

    public void setSisTermsCsv(Integer sisTermsCsv) {
        this.sisTermsCsv = sisTermsCsv;
    }

    public Integer getSisAccountsCsv() {
        return sisAccountsCsv;
    }

    public void setSisAccountsCsv(Integer sisAccountsCsv) {
        this.sisAccountsCsv = sisAccountsCsv;
    }

    public Boolean getIncludeEnrollmentState() {
        return includeEnrollmentState;
    }

    public void setIncludeEnrollmentState(Boolean includeEnrollmentState) {
        this.includeEnrollmentState = includeEnrollmentState;
    }

    public String getEnrollmentState() {
        return enrollmentState;
    }

    public void setEnrollmentState(String enrollmentState) {
        this.enrollmentState = enrollmentState;
    }

    public ZonedDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(ZonedDateTime startAt) {
        this.startAt = startAt;
    }

    public ZonedDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(ZonedDateTime endAt) {
        this.endAt = endAt;
    }
}
