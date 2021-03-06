package Client;

import Controller.CalendarEventController.CalendarEvent.CalendarEvent;
import Controller.EnrollmentController.Grade;
import Controller.GroupController.Group;
import getRequests.*;

public class CanvasClient extends CanvasRestAPI {

    private String token;
    private String clientId;
    private String clientSecret;
    private Integer accountId;
    private AccountDomain accountDomain;
    private AccountNotification accountNotification;
    private AccountReport accountReport;
    private AccountCalendarEvent calendarEvent;
    private AccountList accountList;
    private Admin admin;
    private Analytics analytics;
    private ExternalFeed externalFeed;
    private Announcements announcements;
    private AppointmentGroups appointmentGroups;
    private AssignmentExtensions assignmentExtensions;
    private AssignmentGroups assignmentGroups;
    private Assignment assignment;
    private AssignmentOverride assignmentOverride;
    private AuthenticationProviders authenticationProviders;
    private AuthenticationLog authenticationLog;
    private BlueprintCourses blueprintCourses;
    private Bookmark bookmark;
    private Collaborations collaborations;
    private CommMessages commMessages;
    private CommunicationChannels communicationChannels;
    private Conference conference;
    private ContentExport contentExport;
    private ContentMigration contentMigration;
    private ContentSecurityPolicySetting contentSecurityPolicySetting;
    private ContentShare contentShare;
    private Conversation conversations;
    private CourseAudit courseAudit;
    private QuizExtension quizExtension;
    private Course course;
    private CustomGradebookColumns customGradebookColumns;
    private DiscussionTopic discussionTopic;
    private EnrollmentTerms enrollmentTerm;
    private Enrollment enrollment;
    private ErrorReport errorReport;
    private ExternalTool externalTool;
    private Favorite favorite;
    private FeatureFlag featureFlag;
    private File file;
    private GradeChangeLog gradeChangeLog;
    private Gradebook gradebook;
    private GradingPeriod gradingPeriod;
    private GradingStandard gradingStandard;
    private GroupCategories groupCategories;

    public CanvasClient(){
        super();
    }

    public CanvasClient(String newClientId, String newClientSecret){

        // temp
        this.token = newClientId;

        this.clientId = newClientId;
        this.clientSecret = newClientSecret;
        this.accountDomain = new AccountDomain();
        this.accountNotification = new AccountNotification();
        this.accountReport = new AccountReport();
        this.calendarEvent = new AccountCalendarEvent();
        this.accountList = new AccountList();
        this.admin = new Admin();
        this.analytics = new Analytics();
        this.externalFeed = new ExternalFeed();
        this.announcements = new Announcements();
        this.appointmentGroups = new AppointmentGroups();
        this.assignmentExtensions = new AssignmentExtensions();
        this.assignmentGroups = new AssignmentGroups();
        this.assignment = new Assignment();
        this.assignmentOverride = new AssignmentOverride();
        this.authenticationProviders = new AuthenticationProviders();
        this.authenticationLog = new AuthenticationLog();
        this.blueprintCourses = new BlueprintCourses();
        this.bookmark = new Bookmark();
        this.collaborations = new Collaborations();
        this.commMessages = new CommMessages();
        this.communicationChannels = new CommunicationChannels();
        this.conference = new Conference();
        this.contentExport = new ContentExport();
        this.contentMigration = new ContentMigration();
        this.contentSecurityPolicySetting = new ContentSecurityPolicySetting();
        this.contentShare = new ContentShare();
        this.conversations = new Conversation();
        this.courseAudit = new CourseAudit();
        this.quizExtension = new QuizExtension();
        this.course = new Course();
        this.customGradebookColumns = new CustomGradebookColumns();
        this.discussionTopic = new DiscussionTopic();
        this.enrollment = new Enrollment();
        this.errorReport = new ErrorReport();
        this.externalTool = new ExternalTool();
        this.favorite = new Favorite();
        this.featureFlag = new FeatureFlag();
        this.file = new File();
        this.gradeChangeLog = new GradeChangeLog();
        this.gradebook = new Gradebook();
        this.gradingPeriod = new GradingPeriod();
        this.gradingStandard = new GradingStandard();
        this.groupCategories = new GroupCategories();

    }

    public GroupCategories getGroupCategories() {
        return groupCategories;
    }

    public void setGroupCategories(GroupCategories groupCategories) {
        this.groupCategories = groupCategories;
    }

    public GradingStandard getGradingStandard() {
        return gradingStandard;
    }

    public void setGradingStandard(GradingStandard gradingStandard) {
        this.gradingStandard = gradingStandard;
    }

    public GradingPeriod getGradingPeriod() {
        return gradingPeriod;
    }

    public void setGradingPeriod(GradingPeriod gradingPeriod) {
        this.gradingPeriod = gradingPeriod;
    }

    public Gradebook getGradebook() {
        return gradebook;
    }

    public void setGradebook(Gradebook gradebook) {
        this.gradebook = gradebook;
    }

    public void setGradeChangeLog(GradeChangeLog changeLog){
        this.gradeChangeLog = changeLog;
    }

    public GradeChangeLog getGradeChangeLog(){
        return this.gradeChangeLog;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FeatureFlag getFeatureFlag() {
        return featureFlag;
    }

    public void setFeatureFlag(FeatureFlag featureFlag) {
        this.featureFlag = featureFlag;
    }

    public Favorite getFavorite() {
        return favorite;
    }

    public void setFavorite(Favorite favorite) {
        this.favorite = favorite;
    }

    public ExternalTool getExternalTool() {
        return externalTool;
    }

    public void setExternalTool(ExternalTool externalTool) {
        this.externalTool = externalTool;
    }

    public ErrorReport getErrorReport() {
        return errorReport;
    }

    public void setErrorReport(ErrorReport errorReport) {
        this.errorReport = errorReport;
    }

    public Enrollment getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(Enrollment enrollment) {
        this.enrollment = enrollment;
    }

    public EnrollmentTerms getEnrollmentTerm() {
        return enrollmentTerm;
    }

    public void setEnrollmentTerm(EnrollmentTerms enrollmentTerm) {
        this.enrollmentTerm = enrollmentTerm;
    }

    public DiscussionTopic getDiscussionTopic() {
        return discussionTopic;
    }

    public void setDiscussionTopic(DiscussionTopic discussionTopic) {
        this.discussionTopic = discussionTopic;
    }

    public CustomGradebookColumns getCustomGradebookColumns() {
        return customGradebookColumns;
    }

    public void setCustomGradebookColumns(CustomGradebookColumns customGradebookColumns) {
        this.customGradebookColumns = customGradebookColumns;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public QuizExtension getQuizExtension() {
        return quizExtension;
    }

    public void setQuizExtension(QuizExtension quizExtension) {
        this.quizExtension = quizExtension;
    }

    public CourseAudit getCourseAudit() {
        return courseAudit;
    }

    public void setCourseAudit(CourseAudit courseAudit) {
        this.courseAudit = courseAudit;
    }

    public Conversation getConversations() {
        return conversations;
    }

    public void setConversations(Conversation conversations) {
        this.conversations = conversations;
    }

    public ContentShare getContentShare() {
        return contentShare;
    }

    public void setContentShare(ContentShare contentShare) {
        this.contentShare = contentShare;
    }

    public ContentSecurityPolicySetting getContentSecurityPolicySetting() {
        return contentSecurityPolicySetting;
    }

    public void setContentSecurityPolicySetting(ContentSecurityPolicySetting contentSecurityPolicySetting) {
        this.contentSecurityPolicySetting = contentSecurityPolicySetting;
    }

    public ContentMigration getContentMigration() {
        return contentMigration;
    }

    public void setContentMigration(ContentMigration contentMigration) {
        this.contentMigration = contentMigration;
    }

    public ContentExport getContentExport() {
        return contentExport;
    }

    public void setContentExport(ContentExport contentExport) {
        this.contentExport = contentExport;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public CommunicationChannels getCommunicationChannels() {
        return communicationChannels;
    }

    public void setCommunicationChannels(CommunicationChannels communicationChannels) {
        this.communicationChannels = communicationChannels;
    }

    public CommMessages getCommMessages() {
        return commMessages;
    }

    public void setCommMessages(CommMessages commMessages) {
        this.commMessages = commMessages;
    }

    public Collaborations getCollaborations() {
        return collaborations;
    }

    public void setCollaborations(Collaborations collaborations) {
        this.collaborations = collaborations;
    }

    public Bookmark getBookmark() {
        return bookmark;
    }

    public void setBookmark(Bookmark bookmark) {
        this.bookmark = bookmark;
    }

    public BlueprintCourses getBlueprintCourses() {
        return blueprintCourses;
    }

    public void setBlueprintCourses(BlueprintCourses blueprintCourses) {
        this.blueprintCourses = blueprintCourses;
    }

    public AuthenticationLog getAuthenticationLog() {
        return authenticationLog;
    }

    public void setAuthenticationLog(AuthenticationLog authenticationLog) {
        this.authenticationLog = authenticationLog;
    }

    public AuthenticationProviders getAuthenticationProviders() {
        return authenticationProviders;
    }

    public void setAuthenticationProviders(AuthenticationProviders authenticationProviders) {
        this.authenticationProviders = authenticationProviders;
    }

    public AssignmentOverride getAssignmentOverride() {
        return assignmentOverride;
    }

    public void setAssignmentOverride(AssignmentOverride assignmentOverride) {
        this.assignmentOverride = assignmentOverride;
    }

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public AssignmentGroups getAssignmentGroups() {
        return assignmentGroups;
    }

    public void setAssignmentGroups(AssignmentGroups assignmentGroups) {
        this.assignmentGroups = assignmentGroups;
    }

    public AppointmentGroups getAppointmentGroups() {
        return appointmentGroups;
    }

    public void setAppointmentGroups(AppointmentGroups appointmentGroups) {
        this.appointmentGroups = appointmentGroups;
    }

    public AssignmentExtensions getAssignmentExtensions() {
        return assignmentExtensions;
    }

    public void setAssignmentExtensions(AssignmentExtensions assignmentExtensions) {
        this.assignmentExtensions = assignmentExtensions;
    }

    public Announcements getAnnouncements() {
        return announcements;
    }

    public void setAnnouncements(Announcements announcements) {
        this.announcements = announcements;
    }

    public ExternalFeed getExternalFeed() {
        return externalFeed;
    }

    public void setExternalFeed(ExternalFeed externalFeed) {
        this.externalFeed = externalFeed;
    }

    public Analytics getAnalytics(){
        return this.analytics;
    }

    public void setAnalytics(Analytics newAnalytics){
        this.analytics = newAnalytics;
    }

    public Admin getAdmin(){
        return this.admin;
    }

    public void setAdmin(Admin admin){
        this.admin = admin;
    }

    public AccountList getAccountList() {
        return accountList;
    }

    public void setAccountList(AccountList accountList) {
        this.accountList = accountList;
    }

    public AccountCalendarEvent getCalendarEvent() {
        return calendarEvent;
    }

    public void setCalendarEvent(AccountCalendarEvent calendarEvent) {
        this.calendarEvent = calendarEvent;
    }

    public AccountReport getAccountReport() {
        return accountReport;
    }

    public void setAccountReport(AccountReport accountReport) {
        this.accountReport = accountReport;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public AccountNotification getAccountNotification() {
        return accountNotification;
    }

    public void setAccountNotification(AccountNotification accountNotification) {
        this.accountNotification = accountNotification;
    }



    public AccountDomain getAccountDomain() {
        return accountDomain;
    }

    public void setAccountDomain(AccountDomain accountDomain) {
        this.accountDomain = accountDomain;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
