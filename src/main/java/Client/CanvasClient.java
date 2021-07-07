package Client;

import Controller.CalendarEventController.CalendarEvent.CalendarEvent;
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
