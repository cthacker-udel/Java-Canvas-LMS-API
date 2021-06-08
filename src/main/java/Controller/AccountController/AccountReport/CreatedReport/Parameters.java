package Controller.AccountController.AccountReport.CreatedReport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Parameters {

    @SerializedName("enrollment_term_id")
    @Expose
    private Integer enrollmentTermId;
    @SerializedName("include_deleted")
    @Expose
    private Boolean includeDeleted;
    @SerializedName("course_id")
    @Expose
    private Integer courseId;
    @SerializedName("order")
    @Expose
    private String order;
    @SerializedName("users")
    @Expose
    private Boolean users;
    @SerializedName("accounts")
    @Expose
    private Boolean accounts;
    @SerializedName("terms")
    @Expose
    private Boolean terms;
    @SerializedName("courses")
    @Expose
    private Boolean courses;
    @SerializedName("sections")
    @Expose
    private Boolean sections;
    @SerializedName("enrollments")
    @Expose
    private Boolean enrollments;
    @SerializedName("groups")
    @Expose
    private Boolean groups;
    @SerializedName("xlist")
    @Expose
    private Boolean xlist;
    @SerializedName("sis_terms_csv")
    @Expose
    private Integer sisTermsCsv;
    @SerializedName("sis_accounts_csv")
    @Expose
    private Integer sisAccountsCsv;
    @SerializedName("include_enrollment_state")
    @Expose
    private Boolean includeEnrollmentState;
    @SerializedName("enrollment_state")
    @Expose
    private List<String> enrollmentState = null;
    @SerializedName("start_at")
    @Expose
    private String startAt;
    @SerializedName("end_at")
    @Expose
    private String endAt;

    public Integer getEnrollmentTermId() {
        return enrollmentTermId;
    }

    public void setEnrollmentTermId(Integer enrollmentTermId) {
        this.enrollmentTermId = enrollmentTermId;
    }

    public Boolean getIncludeDeleted() {
        return includeDeleted;
    }

    public void setIncludeDeleted(Boolean includeDeleted) {
        this.includeDeleted = includeDeleted;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Boolean getUsers() {
        return users;
    }

    public void setUsers(Boolean users) {
        this.users = users;
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

    public List<String> getEnrollmentState() {
        return enrollmentState;
    }

    public void setEnrollmentState(List<String> enrollmentState) {
        this.enrollmentState = enrollmentState;
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
}
