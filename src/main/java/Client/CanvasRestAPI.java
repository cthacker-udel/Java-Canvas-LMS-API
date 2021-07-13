package Client;

import Controller.AccountController.AccountDomain.AccountDomainSearchResponse;
import Controller.AccountController.AccountNotification.GlobalAccountNotification;
import Controller.AccountController.AccountNotification.GlobalCreatedNotification;
import Controller.AccountController.AccountReport.AvailableReports.AvailableReport;
import Controller.AccountController.AccountReport.CreatedReport.CreatedReport;
import Controller.AccountController.Accounts.Account;
import Controller.AccountController.Accounts.AccountPermissions.AccountPermissions;
import Controller.AccountController.Accounts.AccountSettings.AccountSettings;
import Controller.AccountController.Accounts.HelpLinks.HelpLinks;
import Controller.AccountController.Accounts.TermsOfService.TermsOfService;
import Controller.AdminController.Admin;
import Controller.AnalyticsController.CourseLevelAssignmentData.CourseLevelAssignmentData;
import Controller.AnalyticsController.CourseLevelParticipation.CourseLevelParticipationData;
import Controller.AnalyticsController.CourseLevelStudentSummaryData.CourseLevelStudentSummaryData;
import Controller.AnalyticsController.DepartmentLevelGrades.DepartmentLevelGrades;
import Controller.AnalyticsController.DepartmentLevelParticipation.DepartmentLevelParticipation;
import Controller.AnalyticsController.DepartmentLevelStatistics.DepartmentLevelStatistics;
import Controller.AnalyticsController.UserInCourseAssignmentData.UserInCourseAssignmentData;
import Controller.AnalyticsController.UserInCourseMessagingData.UserInCourseMessagingData;
import Controller.AnalyticsController.UserInCourseParticipationData.UserInCourseParticipationData;
import Controller.AnnouncementsController.Announcement;
import Controller.AppointmentGroupsController.AppointmentGroup.AppointmentGroup;
import Controller.AssignmentExtensionController.SetExtensions.SetExtensions;
import Controller.AssignmentGroupsController.AssignmentGroup.AssignmentGroup;
import Controller.AssignmentsController.Assignment.Assignment;
import Controller.AssignmentsController.AssignmentOverride;
import Controller.AuthenticationLogController.AuthenticationEvent;
import Controller.AuthenticationProvidersController.AuthenticationProviders;
import Controller.AuthenticationProvidersController.SSOSettings;
import Controller.BlueprintCourseController.BlueprintMigration;
import Controller.BlueprintCourseController.BlueprintSubscription.BlueprintSubscription;
import Controller.BlueprintCourseController.BlueprintTemplate;
import Controller.BlueprintCourseController.ChangeRecord.ChangeRecord;
import Controller.BookmarksController.Bookmark;
import Controller.CalendarEventController.CalendarEvent.CalendarEvent;
import Controller.CollaborationsController.Collaboration;
import Controller.CollaborationsController.Collaborator;
import Controller.CommMessagesController.CommMessage;
import Controller.CommunicationChannelsController.CommunicationChannel;
import Controller.ConferencesController.Conference;
import Controller.ContentExportsController.ContentExport;
import Controller.ContentMigrationsController.ContentMigration;
import Controller.ContentMigrationsController.MigrationIssue;
import Controller.ContentMigrationsController.Migrator;
import Controller.ContentMigrationsController.SelectiveData;
import Controller.CourseController.Course;
import Controller.ExternalFeedController.ExternalFeed;
import Controller.FilesController.Folder;
import Controller.ProgressController.Progress;
import Controller.UserController.User;
import Model.*;

import com.google.gson.internal.GsonBuildConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import okhttp3.HttpUrl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;

public class CanvasRestAPI{

    /*

        Oauth - Methods


     */

    String baseUrl = "https://udel.instructure.com";


    public void getOauth2Token(CanvasClient client){

        // need access to client id

        HttpUrl.Builder urlBuilder = Objects.requireNonNull(HttpUrl.parse(baseUrl + "/login/oauth2/auth")).newBuilder();

        urlBuilder.addQueryParameter("client_id",client.getClientId());
        urlBuilder.addQueryParameter("response_type","code");
        urlBuilder.addQueryParameter("redirect_uri","http://localhost:8888/callback/");

        WebDriverManager.chromedriver().setup();
        WebDriver browser = null;
        try {
            browser = new ChromeDriver();
        }
        catch(Exception ignored){
            try{
                WebDriverManager.firefoxdriver().setup();
                browser = new FirefoxDriver();
            }
            catch(Exception ignored1){
                try{
                    WebDriverManager.edgedriver().setup();
                    browser = new EdgeDriver();
                }
                catch(Exception ignored2){
                    try{
                        WebDriverManager.iedriver().setup();
                        browser = new InternetExplorerDriver();
                    }
                    catch(Exception ignored3){
                        try{
                            WebDriverManager.operadriver().setup();
                            browser = new OperaDriver();
                        }
                        catch(Exception ignored4){
                            try{
                                browser = new SafariDriver();
                            }
                            catch(Exception ignored5){

                            }
                        }
                    }
                }
            }
        }

        assert browser != null;
        browser.get(URLDecoder.decode(urlBuilder.build().url().toString(), StandardCharsets.UTF_8));


    }

    public String getTokenString(CanvasClient client){

        return String.format("Bearer %s",client.getToken());

    }


    /*

        Account Domain API


     */


    public List<AccountDomainSearchResponse> searchAccountDomains(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/accounts/search/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountDomainInterface accountDomainInterface = retrofit.create(Model.accountDomainInterface.class);

        Call<List<AccountDomainSearchResponse>> call = accountDomainInterface.searchAccountDomains(getTokenString(client),client.getAccountDomain().getDomainSearch());

        Response<List<AccountDomainSearchResponse>> response = call.execute();

        return response.body();


    }

    /*

    Account Notifications API

     */

    public List<GlobalAccountNotification> indexOfActiveGlobalNotifactionCurrUser(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/account_notifications/",client.getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountNotificationInterface accountNotificationInterface = retrofit.create(Model.accountNotificationInterface.class);

        Call<List<GlobalAccountNotification>> call = accountNotificationInterface.getGlobalNotification(client.getAccountId(),getTokenString(client));

        Response<List<GlobalAccountNotification>> response = call.execute();

        return response.body();

    }

    public List<GlobalAccountNotification> showGlobalNotification(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/account_notifications/%s/",client.getAccountId(),client.getAccountNotification().getNotificationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountNotificationInterface accountNotificationInterface = retrofit.create(Model.accountNotificationInterface.class);

        Call<List<GlobalAccountNotification>> call = accountNotificationInterface.showGlobalNotification(client.getAccountId(),client.getAccountNotification().getNotificationId(),getTokenString(client));

        Response<List<GlobalAccountNotification>> response = call.execute();

        return response.body();

    }

    public GlobalAccountNotification closeGlobalNotification(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts%s/account_notifications/%s/",client.getAccountId(),client.getAccountNotification().getNotificationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountNotificationInterface accountNotificationInterface = retrofit.create(Model.accountNotificationInterface.class);

        Call<GlobalAccountNotification> call = accountNotificationInterface.closeGlobalNotification(client.getAccountId(),client.getAccountNotification().getNotificationId(),getTokenString(client));

        Response<GlobalAccountNotification> response = call.execute();

        return response.body();

    }

    public GlobalCreatedNotification createAGlobalNotification(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/account_notifications/",client.getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountNotificationInterface accountNotificationInterface = retrofit.create(Model.accountNotificationInterface.class);

        Call<GlobalCreatedNotification> call = accountNotificationInterface.createGlobalNotification(client.getAccountId(),client.getToken(),client.getAccountNotification().generateQueries());

        Response<GlobalCreatedNotification> response = call.execute();

        return response.body();
    }

    public GlobalCreatedNotification updateGlobalNotification(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/account_notifications/%d/",client.getAccountId(),client.getAccountNotification().getNotificationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountNotificationInterface accountNotificationInterface = retrofit.create(Model.accountNotificationInterface.class);

        Call<GlobalCreatedNotification> call = accountNotificationInterface.updateGlobalNotification(client.getAccountId(),client.getAccountNotification().getNotificationId(),client.getToken(),client.getAccountNotification().generateQueries());

        Response<GlobalCreatedNotification> response = call.execute();

        return response.body();
    }

    /*

    Account Reports API

     */


    public List<AvailableReport> listAvailableAccountReports(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/reports/",client.getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountReportInterface accountReportInterface = retrofit.create(Model.accountReportInterface.class);

        Call<List<AvailableReport>> call = accountReportInterface.getAvailableReportList(client.getAccountId(),client.getToken());

        Response<List<AvailableReport>> response = call.execute();

        return response.body();

    }

    public CreatedReport startReport(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/reports/%s/",client.getAccountId(),client.getAccountReport().getReportType());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountReportInterface accountReportInterface = retrofit.create(Model.accountReportInterface.class);

        Call<CreatedReport> call = accountReportInterface.startReport(client.getAccountId(),client.getAccountReport().getReportType(),client.getToken(),client.getAccountReport().generateQueries());

        Response<CreatedReport> response = call.execute();

        return response.body();
    }

    public List<CreatedReport> IndexOfReports(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/reports/%s/",client.getAccountId(),client.getAccountReport().getReportType());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountReportInterface accountReportInterface = retrofit.create(Model.accountReportInterface.class);

        Call<List<CreatedReport>> call = accountReportInterface.indexOfReports(client.getAccountId(),client.getAccountReport().getReportType(),client.getToken(),client.getAccountReport().generateQueries());

        Response<List<CreatedReport>> response = call.execute();

        return response.body();
    }

    public CreatedReport getReportStatus(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/reports/%s/%s/",client.getAccountId(),client.getAccountReport().getReportType(),client.getAccountReport().getReportId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountReportInterface accountReportInterface = retrofit.create(Model.accountReportInterface.class);

        Call<CreatedReport> call = accountReportInterface.reportStatus(client.getAccountId(),client.getAccountReport().getReportType(),client.getAccountReport().getReportId(),client.getToken());

        Response<CreatedReport> response = call.execute();

        return response.body();

    }

    public CreatedReport deleteReport(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/reports/%s/%s/",client.getAccountId(),client.getAccountReport().getReportType(),client.getAccountReport().getReportId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountReportInterface accountReportInterface = retrofit.create(Model.accountReportInterface.class);

        Call<CreatedReport> call = accountReportInterface.deleteReport(client.getAccountId(),client.getAccountReport().getReportType(),client.getAccountReport().getReportId(),client.getToken());

        Response<CreatedReport> response = call.execute();

        return response.body();
    }

    /*

    Accounts API

     */

    public List<Account> listAccounts(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/accounts/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<List<Account>> call = accountsInterface.listAccounts(client.getToken(),client.getAccountList().generateQueries());

        Response<List<Account>> response = call.execute();

        return response.body();

    }

    public List<Account> listAccountsAdminManageable(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/manageable_accounts/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<List<Account>> call = accountsInterface.listAdminManageableAccounts(client.getToken());

        Response<List<Account>> response = call.execute();

        return response.body();
    }

    public List<Account> listAccountsForCourseAdmins(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/course_accounts/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<List<Account>> call = accountsInterface.listAccountsForCourseAdmins(client.getToken());

        Response<List<Account>> response = call.execute();

        return response.body();
    }

    public Account getAccount(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/",client.getAccountList().getAccountListId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<Account> call = accountsInterface.getAccount(client.getAccountList().getAccountListId(),client.getToken());

        Response<Account> response = call.execute();

        return response.body();

    }

    public AccountSettings getAccountSettings(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/settings/",client.getAccountList().getAccountListId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<AccountSettings> call = accountsInterface.getAccountSettings(client.getAccountList().getAccountListId(),client.getToken());

        Response<AccountSettings> response = call.execute();

        return response.body();

    }

    public AccountPermissions getAccountPermissions(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/permissions/",client.getAccountList().getAccountListId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<AccountPermissions> call = accountsInterface.getAccountPermissions(client.getAccountList().getAccountListId(),client.getToken(),client.getAccountList().generateQueries());

        Response<AccountPermissions> response = call.execute();

        return response.body();

    }

    public List<Account> getSubAccountsOfAnAccount(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/sub_accounts/",client.getAccountList().getAccountListId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<List<Account>> call = accountsInterface.getSubAccountsOfAccount(client.getAccountList().getAccountListId(),client.getToken(),client.getAccountList().getRecursive());

        Response<List<Account>> response = call.execute();

        return response.body();

    }

    public TermsOfService getAccountTermsOfService(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/terms_of_service/",client.getAccountList().getAccountListId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<TermsOfService> call = accountsInterface.getAccountsTermsOfService(client.getAccountList().getAccountListId(),client.getToken());

        Response<TermsOfService> response = call.execute();

        return response.body();

    }

    public HelpLinks getAccountHelpLinks(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/help_links/",client.getAccountList().getAccountListId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<HelpLinks> call = accountsInterface.getAccountHelpLinks(client.getAccountList().getAccountListId(),client.getToken());

        Response<HelpLinks> response = call.execute();

        return response.body();

    }

    public List<Course> listAcitveCoursesInAccount(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/courses/",client.getAccountList().getAccountListId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        accountsInterface accountsInterface = retrofit.create(Model.accountsInterface.class);

        Call<List<Course>> call = accountsInterface.getActiveCoursesInAccount(client.getAccountList().getAccountListId(),client.getToken(),client.getAccountList().generateQueries());

        Response<List<Course>> response = call.execute();

        return response.body();
    }

    public boolean updateAnAccount(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s",client.getAccountList().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        accountsInterface accountsInterface = retrofit.create(accountsInterface.class);

        Call<Account> call = accountsInterface.updateAccount(client.getAccountList().getAccountId(), client.getToken(),client.getAccountList().generateQueries());

        Response<Account> response = call.execute();

        return response.isSuccessful();

    }

    public User deleteUserFromRootAccount(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/users/%s/",client.getAccountList().getAccountId(),client.getClientId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        accountsInterface accountsInterface = retrofit.create(accountsInterface.class);

        Call<User> call = accountsInterface.deleteUserFromRootAccount(client.getAccountList().getAccountId(), Integer.parseInt(client.getClientId()), client.getToken());

        Response<User> response = call.execute();

        return response.body();
    }

    public Account createNewSubAccount(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/sub_accounts",client.getAccountList().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        accountsInterface accountsInterface = retrofit.create(accountsInterface.class);

        Call<Account> call = accountsInterface.createSubAccount(client.getAccountList().getAccountId(), client.getToken(), client.getAccountList().generateQueries());

        Response<Account> response = call.execute();

        return response.body();

    }

    public Account deleteSubAccount(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/sub_accounts/%s",client.getAccountList().getAccountId(),client.getAccountList().getSubAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        accountsInterface accountsInterface = retrofit.create(accountsInterface.class);

        Call<Account> call = accountsInterface.deleteSubAccount(client.getAccountList().getAccountId(), Integer.parseInt(client.getAccountList().getSubAccountId()), client.getToken());

        Response<Account> response = call.execute();

        return response.body();
    }

    public Admin createAccountAdmin(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/admins",client.getAccountId()+"");

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        adminInterface adminInterface = retrofit.create(adminInterface.class);

        Call<Admin> call = adminInterface.createAdmin(client.getAccountId(),client.getToken(),client.getAdmin().generateQueries());

        Response<Admin> response = call.execute();

        return response.body();

    }


    public Admin removeAccountAdmin(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/admins/%s",client.getAccountId(),client.getAdmin());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        adminInterface adminInterface = retrofit.create(adminInterface.class);

        Call<Admin> call = adminInterface.removeAdmin(client.getAccountId(),client.getAdmin().getUserId(),client.getToken(),client.getAdmin().generateQueries());

        Response<Admin> response = call.execute();

        return response.body();

    }

    public List<Admin> listAccountAdmins(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/admins/",client.getAdmin().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        adminInterface adminInterface = retrofit.create(adminInterface.class);

        Call<List<Admin>> call = adminInterface.listAccountAdmins(client.getAccountId(),client.getToken(),client.getAdmin().generateQueries());

        Response<List<Admin>> response = call.execute();

        return response.body();

    }

    public DepartmentLevelParticipation getDepartmentLevelAnalyticsByDate(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/terms/%s/activity",client.getAnalytics().getAccountId(),client.getAnalytics().getTermId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        analyticsInterface analyticsInterface  = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelParticipation> call = analyticsInterface.getDepartmentLevelParticipation(client.getAnalytics().getTermId()+"",client.getToken());

        Response<DepartmentLevelParticipation> response = call.execute();

        return response.body();

    }

    public DepartmentLevelParticipation getCurrentDepartmentLevelParticipation(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/current/activity/",client.getAnalytics().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelParticipation> call = analyticsInterface.getCurrentDepartmentLevelParticipation(client.getAnalytics().getAccountId()+"",client.getToken());

        Response<DepartmentLevelParticipation> response = call.execute();

        return response.body();

    }


    public DepartmentLevelParticipation getCompletedDepartmentLevelParticipation(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/completed/activity",client.getAnalytics().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelParticipation> call = analyticsInterface.getCompletedDepartmentLevelParticipation(client.getAnalytics().getAccountId()+"",client.getToken());

        Response<DepartmentLevelParticipation> response = call.execute();

        return response.body();

    }

    public DepartmentLevelGrades getDepartmentLevelGradeDataByDate(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/terms/%s/grades/",client.getAnalytics().getAccountId(),client.getAnalytics().getTermId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelGrades> call = analyticsInterface.getDepartmentLevelGradesByDate(client.getAnalytics().getAccountId()+"",client.getAnalytics().getTermId()+"",client.getToken());

        Response<DepartmentLevelGrades> response = call.execute();

        return response.body();

    }

    public DepartmentLevelGrades getCurrentDepartmentLevelGradeData(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/current/grades",client.getAnalytics().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelGrades> call = analyticsInterface.getCurrentDepartmentLevelGrades(client.getAnalytics().getAccountId()+"",client.getToken());

        Response<DepartmentLevelGrades> response = call.execute();

        return response.body();


    }

    public DepartmentLevelGrades getCompletedDepartmentLevelGradeData(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/completed/grades",client.getAnalytics().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelGrades> call = analyticsInterface.getCompletedDepartmentLevelGrades(client.getAnalytics().getAccountId()+"",client.getToken());

        Response<DepartmentLevelGrades> response = call.execute();

        return response.body();

    }

    public DepartmentLevelStatistics getByDateDepartmentLevelStatistics(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/terms/%s/statistics/",client.getAnalytics().getAccountId(),client.getAnalytics().getTermId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelStatistics> call = analyticsInterface.getDepartmentLevelStatisticsByDate(client.getAnalytics().getAccountId()+"",client.getAnalytics().getTermId()+"",client.getToken());

        Response<DepartmentLevelStatistics> response = call.execute();

        return response.body();

    }

    public DepartmentLevelStatistics getCurrentDeparmentLevelStatistics(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/current/statistics/",client.getAnalytics().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        
        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelStatistics> call = analyticsInterface.getCurrentDepartmentLevelStatistics(client.getAnalytics().getAccountId()+"",client.getToken());

        Response<DepartmentLevelStatistics> response = call.execute();

        return response.body();

    }

    public DepartmentLevelStatistics getCompletedDepartmentLevelStatistics(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/analytics/completed/statistics/",client.getAnalytics().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<DepartmentLevelStatistics> call = analyticsInterface.getCompletedDepartmentLevelStatistics(client.getAnalytics().getAccountId()+"",client.getToken());

        Response<DepartmentLevelStatistics> response = call.execute();

        return response.body();

    }

    public List<CourseLevelParticipationData> getCourseLevelParticipationData(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%d/analytics/activity/",client.getAnalytics().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        analyticsInterface analyticsInterface = retrofit.create(Model.analyticsInterface.class);

        Call<List<CourseLevelParticipationData>> call = analyticsInterface.getCourseLevelParticipationData(client.getAnalytics().getCourseId()+"",client.getAnalytics().generateQueries(),client.getToken());

        Response<List<CourseLevelParticipationData>> response = call.execute();

        return response.body();
    }

    public List<CourseLevelAssignmentData> getCourseLevelAssignmentData(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%d/analytics/assignments/",client.getAnalytics().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        analyticsInterface analyticsInterface = retrofit.create(Model.analyticsInterface.class);

        Call<List<CourseLevelAssignmentData>> call = analyticsInterface.getCourseLevelAssignmentData(client.getAnalytics().getCourseId()+"",client.getToken());

        Response<List<CourseLevelAssignmentData>> response = call.execute();

        return response.body();

    }

    public List<CourseLevelStudentSummaryData> getCourseLevelStudentSummaryData(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%d/analytics/student_summaries/",client.getAnalytics().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        analyticsInterface analyticsInterface = retrofit.create(Model.analyticsInterface.class);

        Call<List<CourseLevelStudentSummaryData>> call = analyticsInterface.getCourseLevelStudentSummaryData(client.getAnalytics().getCourseId()+"",client.getToken(),client.getAnalytics().generateQueries());

        Response<List<CourseLevelStudentSummaryData>> response = call.execute();

        return response.body();
    }

    public UserInCourseParticipationData getUserInCourseLevelParticipationData(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/analytics/users/%s/activity/",client.getAnalytics().getCourseId(),client.getAnalytics().getStudentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<UserInCourseParticipationData> call = analyticsInterface.getUserInCourseParticipationData(client.getAnalytics().getCourseId()+"",client.getAnalytics().getStudentId(),client.getToken());

        Response<UserInCourseParticipationData> response = call.execute();

        return response.body();



    }

    public List<UserInCourseAssignmentData> getUserInCourseAssignmentData(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/analytics/users/%s/assignments/",client.getAnalytics().getCourseId(),client.getAnalytics().getStudentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<List<UserInCourseAssignmentData>> call = analyticsInterface.getUserInCourseAssignmentData(client.getAnalytics().getCourseId()+"",client.getAnalytics().getStudentId(),client.getToken());

        Response<List<UserInCourseAssignmentData>> response = call.execute();

        return response.body();

    }

    public UserInCourseMessagingData getUserInCourseMessagingData(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/analytics/users/%s/communication/",client.getAnalytics().getCourseId(),client.getAnalytics().getStudentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        analyticsInterface analyticsInterface = retrofit.create(analyticsInterface.class);

        Call<UserInCourseMessagingData> call = analyticsInterface.getUserInCourseMessagingData(client.getAnalytics().getCourseId(),client.getAnalytics().getStudentId(),client.getToken());

        Response<UserInCourseMessagingData> response = call.execute();

        return response.body();

    }

    /*

    AnnouncementExternalFeed API

     */


    public List<ExternalFeed> getListOfExternalFeedsByCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/external_feeds/",client.getExternalFeed().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        externalFeedInterface externalFeedInterface = retrofit.create(Model.externalFeedInterface.class);

        Call<List<ExternalFeed>> call = externalFeedInterface.listExternalFeedsByCourseId(client.getExternalFeed().getCourseId(),client.getToken());

        Response<List<ExternalFeed>> response = call.execute();

        return response.body();

    }

    public List<ExternalFeed> getListOfExternalFeedsByGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/grousp/%s/external_feeds/",client.getExternalFeed().getGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        externalFeedInterface externalFeedInterface = retrofit.create(Model.externalFeedInterface.class);

        Call<List<ExternalFeed>> call = externalFeedInterface.listExternalFeedsByGroupID(client.getExternalFeed().getGroupId(),client.getToken());

        Response<List<ExternalFeed>> response = call.execute();

        return response.body();
    }

    public ExternalFeed createExternalFeedByCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/external_feeds/",client.getExternalFeed().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        externalFeedInterface externalFeedInterface = retrofit.create(externalFeedInterface.class);

        Call<ExternalFeed> call = externalFeedInterface.createExternalFeedByCourseId(client.getExternalFeed().getCourseId(),client.getToken(),client.getExternalFeed().generateQueries());

        Response<ExternalFeed> response = call.execute();

        return response.body();
    }


    public ExternalFeed createExternalFeedByGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/external_feeds/",client.getExternalFeed().getGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        externalFeedInterface externalFeedInterface = retrofit.create(externalFeedInterface.class);

        Call<ExternalFeed> call = externalFeedInterface.createExternalFeedByGroupId(client.getExternalFeed().getGroupId(),client.getToken(),client.getExternalFeed().generateQueries());

        Response<ExternalFeed> response = call.execute();

        return response.body();

    }

    public ExternalFeed deleteExternalFeedByCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/external_feeds/%s/",client.getExternalFeed().getCourseId(),client.getExternalFeed().getExternalFeedId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        externalFeedInterface externalFeedInterface = retrofit.create(Model.externalFeedInterface.class);

        Call<ExternalFeed> call = externalFeedInterface.deleteExternalFeedByCourseId(client.getExternalFeed().getCourseId(),client.getExternalFeed().getExternalFeedId(),client.getToken());

        Response<ExternalFeed> response = call.execute();

        return response.body();

    }

    public ExternalFeed deleteExternalFeedByGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/external_feeds/%s/",client.getExternalFeed().getGroupId(),client.getExternalFeed().getExternalFeedId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        externalFeedInterface externalFeedInterface = retrofit.create(Model.externalFeedInterface.class);

        Call<ExternalFeed> call = externalFeedInterface.deleteExternalFeedByGroupId(client.getExternalFeed().getGroupId(),client.getExternalFeed().getExternalFeedId(),client.getToken());

        Response<ExternalFeed> response = call.execute();

        return response.body();

    }

    /*

    Announcements API

     */


    public List<Announcement> listAnnouncements(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/announcements/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        announcementsInterface announcementsInterface = retrofit.create(Model.announcementsInterface.class);

        Call<List<Announcement>> call = announcementsInterface.getAnnouncementsList(client.getAnnouncements().generateQueries(),client.getToken());

        Response<List<Announcement>> response = call.execute();

        return response.body();
    }

    /*


    Appointment Groups API

     */

    public List<AppointmentGroup> listAppointmentGroups(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/appointment_groups/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        appointmentGroupsInterface appointmentGroupsInterface = retrofit.create(Model.appointmentGroupsInterface.class);

        Call<List<AppointmentGroup>> call = appointmentGroupsInterface.getAppointmentGroupList(client.getAppointmentGroups().generateQueries(),client.getToken());

        Response<List<AppointmentGroup>> response = call.execute();

        return response.body();

    }

    public boolean createAppointmentGroup(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/appointment_groups/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        appointmentGroupsInterface appointmentGroupsInterface = retrofit.create(Model.appointmentGroupsInterface.class);

        Call<Void> call = appointmentGroupsInterface.createAppointmentGroups(client.getAppointmentGroups().generateQueries(),client.getToken());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    public AppointmentGroup getSingleAppointmentGroup(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/appointment_groups/%s",client.getAppointmentGroups().getAppointmentID());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        appointmentGroupsInterface appointmentGroupsInterface = retrofit.create(Model.appointmentGroupsInterface.class);

        Call<AppointmentGroup> call = appointmentGroupsInterface.getAppointment(client.getAppointmentGroups().getAppointmentID(),client.getToken());

        Response<AppointmentGroup> response = call.execute();

        return response.body();

    }

    public AppointmentGroup updateAppointmentGroup(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/appointment_groups/%s/",client.getAppointmentGroups().getAppointmentID());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        appointmentGroupsInterface appointmentGroupsInterface = retrofit.create(Model.appointmentGroupsInterface.class);

        Call<AppointmentGroup> call = appointmentGroupsInterface.updateAppointment(client.getAppointmentGroups().getAppointmentID(),client.getToken());

        Response<AppointmentGroup> response = call.execute();

        return response.body();
    }

    public boolean deleteAppointmentGroup(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/appointment_groups/%s/",client.getAppointmentGroups().getAppointmentID());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        appointmentGroupsInterface appointmentGroupsInterface = retrofit.create(Model.appointmentGroupsInterface.class);

        Call<Void> call = appointmentGroupsInterface.deleteAppointmentGroup(client.getAppointmentGroups().getAppointmentID(),client.getToken(), client.getAppointmentGroups().generateQueries());

        Response<Void> response = call.execute();

        return response.isSuccessful();
    }

    public List<AppointmentGroup> listUserParticipants(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/appointment_groups/%s/users/",client.getAppointmentGroups().getAppointmentID());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        appointmentGroupsInterface appointmentGroupsInterface = retrofit.create(Model.appointmentGroupsInterface.class);

        Call<List<AppointmentGroup>> call = appointmentGroupsInterface.listUserParticipants(client.getAppointmentGroups().getAppointmentID(),client.getToken(),client.getAppointmentGroups().generateQueries());

        Response<List<AppointmentGroup>> response = call.execute();

        return response.body();

    }

    public List<AppointmentGroup> listStudentGroupParticipants(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/appointment_groups/%s/groups/",client.getAppointmentGroups().getAppointmentID());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        appointmentGroupsInterface appointmentGroupsInterface = retrofit.create(Model.appointmentGroupsInterface.class);

        Call<List<AppointmentGroup>> call = appointmentGroupsInterface.listStudentGroupParticipants(client.getAppointmentGroups().getAppointmentID(),client.getToken(),client.getAppointmentGroups().generateQueries());

        Response<List<AppointmentGroup>> response = call.execute();

        return response.body();

    }

    public List<CalendarEvent> getNextAppointment(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/appointment_groups/next_appointment/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        appointmentGroupsInterface appointmentGroupsInterface = retrofit.create(Model.appointmentGroupsInterface.class);

        Call<List<CalendarEvent>> call = appointmentGroupsInterface.getNextAppointment(client.getToken(),client.getAppointmentGroups().generateQueries());

        Response<List<CalendarEvent>> response = call.execute();

        return response.body();

    }

    /*

    Assignment Extensions API


     */

    public SetExtensions setExtensionsForStudentAssignmentSubmissions(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%d/assignments/%d/extensions/",client.getAssignmentExtensions().getCourseId(),client.getAssignmentExtensions().getAssignmentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentExtensionInterface assignmentExtensionInterface = retrofit.create(Model.assignmentExtensionInterface.class);

        Call<SetExtensions> call = assignmentExtensionInterface.setExtensionsForStudentAssignmentSubmissions(client.getToken(),client.getAssignmentExtensions().generateQueries());

        Response<SetExtensions> response = call.execute();

        return response.body();



    }

    /*

    Assignment Groups API

     */


    public List<AssignmentGroup> listAssignmentGroups(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignment_groups/",client.getAssignmentGroups().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentGroupsInterface assignmentGroupsInterface = retrofit.create(Model.assignmentGroupsInterface.class);

        Call<List<AssignmentGroup>> call = assignmentGroupsInterface.getAssignmentGroupList(client.getAssignmentGroups().getCourseId(),client.getToken(),client.getAssignmentGroups().generateQueries());

        Response<List<AssignmentGroup>> response = call.execute();

        return response.body();

    }

    public AssignmentGroup getAssignmentGroup(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignment_groups/%s",client.getAssignmentGroups().getCourseId(),client.getAssignmentGroups().getAssignmentGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentGroupsInterface assignmentGroupsInterface = retrofit.create(Model.assignmentGroupsInterface.class);

        Call<AssignmentGroup> call = assignmentGroupsInterface.getSingularAssignmentGroup(client.getAssignmentGroups().getClientId(),client.getAssignmentGroups().getAssignmentGroupId(), client.getToken(),client.getAssignmentGroups().generateQueries());

        Response<AssignmentGroup> response = call.execute();

        return response.body();

    }

    public AssignmentGroup createAssignmentGroup(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignment_groups/",client.getAssignmentGroups().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentGroupsInterface assignmentGroupsInterface = retrofit.create(Model.assignmentGroupsInterface.class);

        Call<AssignmentGroup> call = assignmentGroupsInterface.createAssignmentGroup(client.getAssignmentGroups().getCourseId(),client.getToken(),client.getAssignmentGroups().generateQueries());

        Response<AssignmentGroup> response = call.execute();

        return response.body();

    }

    public AssignmentGroup editAssignmentGroup(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignment_groups/%s/",client.getAssignmentGroups().getCourseId(),client.getAssignmentGroups().getAssignmentGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentGroupsInterface assignmentGroupsInterface = retrofit.create(Model.assignmentGroupsInterface.class);

        Call<AssignmentGroup> call = assignmentGroupsInterface.editAssignmentGroup(client.getAssignmentGroups().getCourseId(),client.getToken(),client.getAssignmentGroups().getAssignmentGroupId(),client.getAssignmentGroups().generateQueries());

        Response<AssignmentGroup> response = call.execute();

        return response.body();

    }

    public AssignmentGroup destroyAssignmentGroup(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignment_groups/%s",client.getAssignmentGroups().getCourseId(),client.getAssignmentGroups().getAssignmentGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentGroupsInterface assignmentGroupsInterface = retrofit.create(Model.assignmentGroupsInterface.class);

        Call<AssignmentGroup> call = assignmentGroupsInterface.deleteAssignmentGroup(client.getAssignmentGroups().getCourseId(),client.getAssignmentGroups().getAssignmentGroupId(),client.getToken(),client.getAssignmentGroups().generateQueries());

        Response<AssignmentGroup> response = call.execute();

        return response.body();

    }

    /*

    Assignments API

     */

    public Assignment deleteAnAssignment(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/",client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<Assignment> call = assignmentsInterface.deleteAssignment(client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId(),client.getToken());

        Response<Assignment> response = call.execute();

        return response.body();

    }

    public List<Assignment> listAssignments(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments",client.getAssignment().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<List<Assignment>> call = assignmentsInterface.listAssignments(client.getAssignment().getCourseId(),client.getToken(),client.getAssignment().generateQueries());

        Response<List<Assignment>> response = call.execute();

        return response.body();

    }

    public List<Assignment> listAssignmentsV2(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignment_groups/%s/assignments/",client.getAssignment().getCourseId(),client.getAssignmentGroups().getAssignmentGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<List<Assignment>> call = assignmentsInterface.listAssignmentsV2(client.getAssignment().getCourseId(),client.getAssignmentGroups().getAssignmentGroupId(),client.getToken(),client.getAssignment().generateQueries());

        Response<List<Assignment>> response = call.execute();

        return response.body();

    }

    public List<Assignment> listUserAssignments(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/courses/%s/assignments/",client.getAssignment().getUserId(),client.getAssignment().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<List<Assignment>> call = assignmentsInterface.listUserAssignments(client.getAssignment().getUserId(),client.getAssignment().getCourseId(),client.getToken());

        Response<List<Assignment>> response = call.execute();

        return response.body();

    }

    public Assignment duplicateAssignment(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/duplicate/",client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<Assignment> call = assignmentsInterface.duplicateAssignment(client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId(),client.getToken(),client.getAssignment().generateQueries());

        Response<Assignment> response = call.execute();

        return response.body();

    }

    public Assignment getSingleAssignment(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/",client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<Assignment> call = assignmentsInterface.getAssignment(client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId(),client.getToken(),client.getAssignment().generateQueries());

        Response<Assignment> response = call.execute();

        return response.body();
    }

    public Assignment createAssignment(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/",client.getAssignment().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<Assignment> call = assignmentsInterface.createAssignment(client.getAssignment().getCourseId(),client.getToken(),client.getAssignment().generateQueries());

        Response<Assignment> response = call.execute();

        return response.body();

    }

    public Assignment editAssignment(CanvasClient client) throws IOException {

        /*

        make sure query parameters are implemented in assignment class in getRequests
        https://canvas.instructure.com/doc/api/assignments.html

         */

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/",client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<Assignment> call = assignmentsInterface.editAssignment(client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId(),client.getToken(),client.getAssignment().generateQueries());

        Response<Assignment> response = call.execute();

        return response.body();

    }

    public Progress bulkUpdateAssignmentDates(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/bulk_update/",client.getAssignment().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<Progress> call = assignmentsInterface.bulkUpdateAssignmentDates(client.getAssignment().getCourseId(),client.getToken());

        Response<Progress> response = call.execute();

        return response.body();

    }

    public List<AssignmentOverride> listAssignmentOverrides(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/overrides/",client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<List<AssignmentOverride>> call = assignmentsInterface.listAssignmentOverrides(client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId(),client.getToken());

        Response<List<AssignmentOverride>> response = call.execute();

        return response.body();

    }

    public AssignmentOverride getSingleAssignmentOverride(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/overrides/%s",client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId(),client.getAssignment().getAssignmentOverrideId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<AssignmentOverride> call = assignmentsInterface.getSingleAssignmentOverride(client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId(),client.getAssignment().getAssignmentOverrideId(),client.getToken());

        Response<AssignmentOverride> response = call.execute();

        return response.body();

    }

    public String getAssignmentOverrideRedirect(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/assignments/%s/override",client.getAssignment().getGroupId(),client.getAssignment().getAssignmentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<String> call = assignmentsInterface.getAssignmentOverrideRedirect(client.getAssignment().getGroupId(),client.getAssignment().getAssignmentId(),client.getToken());

        Response<String> response = call.execute();

        return response.body();


    }

    public AssignmentOverride createAssignmentOverride(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/overrides/",client.getAssignment().getCourseId(),client.getAssignment().getAssignmentId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<AssignmentOverride> call = assignmentsInterface.createAssignmentOverride(client.getAssignmentOverride().getCourseId()+"",client.getAssignmentOverride().getAssignmentId()+"",client.getToken(),client.getAssignmentOverride().generateQueries());

        Response<AssignmentOverride> response = call.execute();

        return response.body();

    }

    public AssignmentOverride updateAssignmentOverride(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/overrides/%s/",client.getAssignmentOverride().getCourseId(),client.getAssignmentOverride().getAssignmentId(),client.getAssignmentOverride().getAssignmentOverrideId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<AssignmentOverride> call = assignmentsInterface.updateAssignmentOverride(client.getAssignmentOverride().getCourseId()+"",client.getAssignmentOverride().getAssignmentId()+"",client.getAssignmentOverride().getAssignmentOverrideId()+"",client.getToken(),client.getAssignmentOverride().generateQueries());

        Response<AssignmentOverride> response = call.execute();

        return response.body();

    }

    public AssignmentOverride deleteAssignmentOverride(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/%s/overrides/%s/",client.getAssignmentOverride().getCourseId(),client.getAssignmentOverride().getAssignmentId(),client.getAssignmentOverride().getAssignmentOverrideId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<AssignmentOverride> call = assignmentsInterface.deleteAssignmentOverride(client.getAssignmentOverride().getCourseId()+"",client.getAssignmentOverride().getAssignmentId()+"",client.getAssignmentOverride().getAssignmentOverrideId()+"",client.getToken());

        Response<AssignmentOverride> response = call.execute();

        return response.body();

    }

    public List<AssignmentOverride> batchRetrieveOverrides(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/overrides/",client.getAssignmentOverride().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<List<AssignmentOverride>> call = assignmentsInterface.batchRetrieveOverrides(client.getAssignmentOverride().getCourseId(),client.getToken(),client.getAssignmentOverride().generateQueries());

        Response<List<AssignmentOverride>> response = call.execute();

        return response.body();

    }

    public List<AssignmentOverride> batchCreateOverrides(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/overrides",client.getAssignmentOverride().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<List<AssignmentOverride>> call = assignmentsInterface.batchCreateOverrides(client.getAssignmentOverride().getCourseId(),client.getToken(),client.getAssignmentOverride().generateBatchCreateQueries());

        Response<List<AssignmentOverride>> response = call.execute();

        return response.body();

    }

    public List<AssignmentOverride> batchUpdateOverrides(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/assignments/overrides/",client.getAssignmentOverride().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        assignmentsInterface assignmentsInterface = retrofit.create(Model.assignmentsInterface.class);

        Call<List<AssignmentOverride>> call = assignmentsInterface.batchUpdateOverrides(client.getAssignmentOverride().getCourseId(),client.getToken(),client.getAssignmentOverride().generateBatchCreateQueries());

        Response<List<AssignmentOverride>> response = call.execute();

        return response.body();

    }

    /*

    Authentication Providers API

     */

    public List<AuthenticationProviders> listAuthenticationProviders(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/authentication_providers/",client.getAuthenticationProviders().getAccountIdAuthenticationProviders());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationProvidersInterface authenticationProvidersInterface = retrofit.create(Model.authenticationProvidersInterface.class);

        Call<List<AuthenticationProviders>> call = authenticationProvidersInterface.listAuthenticationProviders(client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getToken());

        Response<List<AuthenticationProviders>> response = call.execute();

        return response.body();

    }

    public AuthenticationProviders addAuthenticationProvider(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/authentication_providers/",client.getAuthenticationProviders().getAccountIdAuthenticationProviders());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationProvidersInterface authenticationProvidersInterface = retrofit.create(Model.authenticationProvidersInterface.class);

        Call<AuthenticationProviders> call = authenticationProvidersInterface.addAuthenticationProvider(client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getToken(),client.getAuthenticationProviders().generateQueries());

        Response<AuthenticationProviders> response = call.execute();

        return response.body();

    }

    public AuthenticationProviders updateAuthenticationProvider(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/authentication_provides/%s",client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getAuthenticationProviders().getAuthenticationProviderId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationProvidersInterface authenticationProvidersInterface = retrofit.create(Model.authenticationProvidersInterface.class);

        Call<AuthenticationProviders> call = authenticationProvidersInterface.updateAuthenticationProviders(client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getAuthenticationProviders().getAuthenticationProviderId(),client.getToken(),client.getAuthenticationProviders().generateQueries());

        Response<AuthenticationProviders> response = call.execute();

        return response.body();

    }

    public AuthenticationProviders getAuthenticationProvider(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/authentication_provides/%s",client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getAuthenticationProviders().getAuthenticationProviderId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationProvidersInterface authenticationProvidersInterface = retrofit.create(Model.authenticationProvidersInterface.class);

        Call<AuthenticationProviders> call = authenticationProvidersInterface.getAuthenticationProvider(client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getAuthenticationProviders().getAuthenticationProviderId(),client.getToken());

        Response<AuthenticationProviders> response = call.execute();

        return response.body();

    }

    public boolean deleteAuthenticationProvider(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/authentication_providers/%s/",client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getAuthenticationProviders().getAuthenticationProviderId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationProvidersInterface authenticationProvidersInterface = retrofit.create(Model.authenticationProvidersInterface.class);

        Call<Void> call = authenticationProvidersInterface.deleteAuthenticationProvider(client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getAuthenticationProviders().getAuthenticationProviderId(),client.getToken());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    public SSOSettings showUserAuthSettings(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/sso_settings/",client.getAuthenticationProviders().getAccountIdAuthenticationProviders());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationProvidersInterface authenticationProvidersInterface = retrofit.create(Model.authenticationProvidersInterface.class);

        Call<SSOSettings> call = authenticationProvidersInterface.showAccountAuthSettings(client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getToken());

        Response<SSOSettings> response = call.execute();

        return response.body();

    }

    public SSOSettings updateAccountAuthSettings(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/sso_settings/",client.getAuthenticationProviders().getAccountIdAuthenticationProviders());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationProvidersInterface authenticationProvidersInterface = retrofit.create(Model.authenticationProvidersInterface.class);

        Call<SSOSettings> call = authenticationProvidersInterface.updateAuthSettings(client.getAuthenticationProviders().getAccountIdAuthenticationProviders(),client.getToken(),client.getAuthenticationProviders().generateQueries());

        Response<SSOSettings> response = call.execute();

        return response.body();

    }

    /*

    Authentication Logs

     */

    public List<AuthenticationEvent> queryAuthenticationLogByLogin(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/audit/authentication/logins/%s/",client.getAuthenticationLog().getLoginId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationLogInterface authenticationLogInterface = retrofit.create(Model.authenticationLogInterface.class);

        Call<List<AuthenticationEvent>> call = authenticationLogInterface.queryByLogin(client.getAuthenticationLog().getLoginId(),client.getToken(),client.getAuthenticationLog().generateQueries());

        Response<List<AuthenticationEvent>> response = call.execute();

        return response.body();

    }

    public List<AuthenticationEvent> queryAuthenticationLogByAccount(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/audit/authentication/accounts/%s/",client.getAuthenticationLog().getLogAccountId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationLogInterface authenticationLogInterface = retrofit.create(Model.authenticationLogInterface.class);

        Call<List<AuthenticationEvent>> call = authenticationLogInterface.queryByAccount(client.getAuthenticationLog().getLogAccountId(),client.getToken(),client.getAuthenticationLog().generateQueries());

        Response<List<AuthenticationEvent>> response = call.execute();

        return response.body();

    }

    public List<AuthenticationEvent> queryAuthenticationLogByUser(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/audit/authentication/users/%s/",client.getAuthenticationLog().getUserId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        authenticationLogInterface authenticationLogInterface = retrofit.create(Model.authenticationLogInterface.class);

        Call<List<AuthenticationEvent>> call = authenticationLogInterface.queryByUser(client.getAuthenticationLog().getUserId(),client.getToken(),client.getAuthenticationLog().generateQueries());

        Response<List<AuthenticationEvent>> response = call.execute();

        return response.body();

    }

    /*

    Blueprint Courses API

     */

    public BlueprintTemplate getBlueprintInformation(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<BlueprintTemplate> call = blueprintCoursesInterface.getBlueprintInformation(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getToken());

        Response<BlueprintTemplate> response = call.execute();

        return response.body();

    }

    public List<Course> getAssociatedCourseInformation(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/associated_courses/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<List<Course>> call = blueprintCoursesInterface.getAssociatedCourseInformation(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getToken());

        Response<List<Course>> response = call.execute();

        return response.body();

    }

    public boolean updateAssociatedCourses(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/update_associations/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<Void> call = blueprintCoursesInterface.updateAssociatedCourses(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getToken(),client.getBlueprintCourses().generateQueries());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    public BlueprintMigration beginMigrationToPushAssociatedCourses(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/migrations/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<BlueprintMigration> call = blueprintCoursesInterface.beginMigration(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getToken(),client.getBlueprintCourses().generateQueries());

        Response<BlueprintMigration> response = call.execute();

        return response.body();

    }

    public boolean setOrRemoveBlueprintRestrictions(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/restrict_item/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<Void> call = blueprintCoursesInterface.setOrRemoveBlueprintRestrictions(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getToken(),client.getBlueprintCourses().generateQueries());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    public List<ChangeRecord> getUnsyncedChanges(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/unsynced_changes/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<List<ChangeRecord>> call = blueprintCoursesInterface.getUnsyncedChanges(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getToken());

        Response<List<ChangeRecord>> response = call.execute();

        return response.body();

    }

    public List<BlueprintMigration> listBlueprintMigrations(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/migrations",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<List<BlueprintMigration>> call = blueprintCoursesInterface.listBlueprintMigrations(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getToken());

        Response<List<BlueprintMigration>> response = call.execute();

        return response.body();

    }

    public BlueprintMigration showBlueprintMigration(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/migrations/%s/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getBlueprintCourses().getMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<BlueprintMigration> call = blueprintCoursesInterface.showBlueprintMigration(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getBlueprintCourses().getMigrationId(),client.getToken());

        Response<BlueprintMigration> response = call.execute();

        return response.body();

    }

    public ChangeRecord getMigrationDetails(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_templates/%s/migrations/%s/details/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getBlueprintCourses().getMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<ChangeRecord> call = blueprintCoursesInterface.getMigrationDetails(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getTemplateId(),client.getBlueprintCourses().getMigrationId(),client.getToken());

        Response<ChangeRecord> response = call.execute();

        return response.body();

    }

    public List<BlueprintSubscription> listBLueprintSubscriptions(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_subscriptions/",client.getBlueprintCourses().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<List<BlueprintSubscription>> call = blueprintCoursesInterface.listBlueprintSubscriptions(client.getBlueprintCourses().getCourseId(),client.getToken());

        Response<List<BlueprintSubscription>> response = call.execute();

        return response.body();


    }

    public List<BlueprintMigration> listBlueprintImports(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_subscriptions/%s/migrations/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getSubscriptionId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<List<BlueprintMigration>> call = blueprintCoursesInterface.listBlueprintImports(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getSubscriptionId(),client.getToken());

        Response<List<BlueprintMigration>> response = call.execute();

        return response.body();

    }

    public BlueprintMigration showBlueprintImport(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_subscriptions/%s/migrations/%s/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getSubscriptionId(),client.getBlueprintCourses().getMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<BlueprintMigration> call = blueprintCoursesInterface.showBlueprintImport(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getSubscriptionId(),client.getBlueprintCourses().getMigrationId(),client.getToken());

        Response<BlueprintMigration> response = call.execute();

        return response.body();

    }

    public List<ChangeRecord> getImportDetails(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/blueprint_subscriptions/%s/migrations/%s/details/",client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getSubscriptionId(),client.getBlueprintCourses().getMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        blueprintCoursesInterface blueprintCoursesInterface = retrofit.create(Model.blueprintCoursesInterface.class);

        Call<List<ChangeRecord>> call = blueprintCoursesInterface.getImportDetails(client.getBlueprintCourses().getCourseId(),client.getBlueprintCourses().getSubscriptionId(),client.getBlueprintCourses().getMigrationId(),client.getToken());

        Response<List<ChangeRecord>> response = call.execute();

        return response.body();

    }

    /*

    Bookmarks API

     */

    public List<Bookmark> listBookmarks(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/users/self/bookmarks/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        bookmarksInterface bookmarksInterface = retrofit.create(Model.bookmarksInterface.class);

        Call<List<Bookmark>> call = bookmarksInterface.listBookmarks(client.getToken());

        Response<List<Bookmark>> response = call.execute();

        return response.body();

    }

    public Bookmark createBookmark(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/users/self/bookmarks/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        bookmarksInterface bookmarksInterface = retrofit.create(Model.bookmarksInterface.class);

        Call<Bookmark> call = bookmarksInterface.createBookmark(client.getToken());

        Response<Bookmark> response = call.execute();

        return response.body();

    }

    public Bookmark getBookmark(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/self/bookmarks/%s/",client.getBookmark().getBookmarkId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        bookmarksInterface bookmarksInterface = retrofit.create(Model.bookmarksInterface.class);

        Call<Bookmark> call = bookmarksInterface.getBookmark(client.getBookmark().getBookmarkId(),client.getToken());

        Response<Bookmark> response = call.execute();

        return response.body();

    }

    public Folder updateBookmark(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/self/bookmarks/%s/",client.getBookmark().getBookmarkId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        bookmarksInterface bookmarksInterface = retrofit.create(Model.bookmarksInterface.class);

        Call<Folder> call = bookmarksInterface.updateBookmark(client.getBookmark().getBookmarkId(),client.getToken(),client.getBookmark().generateQueries());

        Response<Folder> response = call.execute();

        return response.body();

    }

    public boolean deleteBookmark(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/self/bookmarks/%s/",client.getBookmark().getBookmarkId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        bookmarksInterface bookmarksInterface = retrofit.create(Model.bookmarksInterface.class);

        Call<Void> call = bookmarksInterface.deleteBookmark(client.getBookmark().getBookmarkId(),client.getToken());

        Response<Void> response = call.execute();

        return response.isSuccessful();
    }

    /*

    Brand Configs API

     */

    public boolean getBrandConfig(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/brand_variables/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        brandConfigsInterface brandConfigsInterface = retrofit.create(Model.brandConfigsInterface.class);

        Call<Void> call = brandConfigsInterface.getBrandConfig(client.getToken());

        Response<Void> response = call.execute();

        return response.isSuccessful();
    }


    /*

    Calendar Events

     */

    public List<CalendarEvent> listCalendarEvents(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/calendar_events/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<List<CalendarEvent>> call = calendarEventInterface.getListOfCalendarEvents(client.getToken(),client.getCalendarEvent().generateQueries());

        Response<List<CalendarEvent>> response = call.execute();

        return response.body();

    }

    public List<CalendarEvent> listUserCalendarEvents(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/calendar_events/",client.getCalendarEvent().getUserId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<List<CalendarEvent>> call = calendarEventInterface.getListOfUserCalendarEvents(client.getCalendarEvent().getUserId(),client.getToken(),client.getCalendarEvent().generateQueries());

        Response<List<CalendarEvent>> response = call.execute();

        return response.body();

    }

    public boolean createCalendarEvent(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/calendar_events/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<Void> call = calendarEventInterface.createCalendarEvent(client.getToken(),client.getBookmark().generateQueries());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    public CalendarEvent getCalendarEvent(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/calendar_events/%s/",client.getCalendarEvent().getCalendarEventId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<CalendarEvent> call = calendarEventInterface.getCalendarEvent(client.getCalendarEvent().getCalendarEventId(),client.getToken());

        Response<CalendarEvent> response = call.execute();

        return response.body();

    }

    public boolean reserveTimeSlotV1(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/calendar_events/%s/reservations/",client.getCalendarEvent().getCalendarEventId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<Void> call = calendarEventInterface.reserveTimeSlotV1(client.getCalendarEvent().getCalendarEventId(),client.getToken(),client.getCalendarEvent().generateQueries());

        Response<Void> response = call.execute();

        return response.isSuccessful();


    }

    public boolean reserveTimeSlotV2(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/calendar_events/%s/reservations/%s/",client.getCalendarEvent().getCalendarEventId(),client.getCalendarEvent().getParticipantId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<Void> call = calendarEventInterface.reserveTimeSlotV2(client.getCalendarEvent().getCalendarEventId(),client.getCalendarEvent().getParticipantId(),client.getToken(),client.getCalendarEvent().generateQueries());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    public CalendarEvent updateCalendarEvent(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/calendar_events/%s",client.getCalendarEvent().getCalendarEventId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<CalendarEvent> call = calendarEventInterface.updateCalendarEvent(client.getCalendarEvent().getCalendarEventId(),client.getToken(),client.getCalendarEvent().generateQueries());

        Response<CalendarEvent> response = call.execute();

        return response.body();

    }

    public boolean deleteCalendarEvent(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/calendar_events/%s/",client.getCalendarEvent().getCalendarEventId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<CalendarEvent> call = calendarEventInterface.deleteCalendarEvent(client.getCalendarEvent().getCalendarEventId(),client.getToken(),client.getCalendarEvent().generateQueries());

        Response<CalendarEvent> response = call.execute();

        return response.isSuccessful();

    }

    public boolean setCourseTimetable(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/calendar_events/timetable/",client.getCalendarEvent().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<Void> call = calendarEventInterface.setCourseTimetable(client.getCalendarEvent().getCourseId(),client.getToken(),client.getCalendarEvent().generateQueries());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    public Object getCourseTimetable(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/calendar_events/timetable/",client.getCalendarEvent().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<Object> call = calendarEventInterface.getCourseTimetable(client.getCalendarEvent().getCourseId(),client.getToken());

        Response<Object> response = call.execute();

        return response.body();

    }

    public boolean createOrUpdateCourseTimetableEvents(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/calendar_events/timetable_events/",client.getCalendarEvent().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        calendarEventInterface calendarEventInterface = retrofit.create(Model.calendarEventInterface.class);

        Call<Void> call = calendarEventInterface.createOrUpdateTimetableEvents(client.getCalendarEvent().getCourseId(),client.getToken(),client.getCalendarEvent().generateQueries());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    /*

    Collaborations API

     */

    public List<Collaboration> listCollaborationsCourseID(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/collaborations/",client.getCollaborations().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        collaborationsInterface collaborationsInterface = retrofit.create(Model.collaborationsInterface.class);

        Call<List<Collaboration>> call = collaborationsInterface.listCollaborationsCourseID(client.getCollaborations().getCourseId(),client.getToken());

        Response<List<Collaboration>> response = call.execute();

        return response.body();

    }

    public List<Collaboration> listCollaborationsGroupID(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/collaborations/",client.getCollaborations().getGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        collaborationsInterface collaborationsInterface = retrofit.create(Model.collaborationsInterface.class);

        Call<List<Collaboration>> call = collaborationsInterface.listCollaborationsCourseID(client.getCollaborations().getGroupId(),client.getToken());

        Response<List<Collaboration>> response = call.execute();

        return response.body();
    }

    public List<Collaborator> listCollaborationMembers(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/collaborations/%s/members/",client.getCollaborations().getCollaborationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        collaborationsInterface collaborationsInterface = retrofit.create(Model.collaborationsInterface.class);

        Call<List<Collaborator>> call = collaborationsInterface.listCollaborationMembers(client.getCollaborations().getCollaborationId(),client.getToken(),client.getCollaborations().generateQueries());

        Response<List<Collaborator>> response = call.execute();

        return response.body();

    }

    public List<User> listPotentialMembersCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/potential_collaborators/",client.getCollaborations().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        collaborationsInterface collaborationsInterface = retrofit.create(Model.collaborationsInterface.class);

        Call<List<User>> call = collaborationsInterface.listPotentialMembersCourseID(client.getCollaborations().getCourseId(),client.getToken());

        Response<List<User>> response = call.execute();

        return response.body();

    }

    public List<User> listPotentialMembersGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/potential_collaborators/",client.getCollaborations().getGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        collaborationsInterface collaborationsInterface = retrofit.create(Model.collaborationsInterface.class);

        Call<List<User>> call = collaborationsInterface.listPotentialMembersGroupID(client.getCollaborations().getGroupId(),client.getToken());

        Response<List<User>> response = call.execute();

        return response.body();

    }

    /*

    CommMessages API

     */

    public List<CommMessage> listUserCommMessages(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/comm_messages/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        commMessagesInterface commMessagesInterface = retrofit.create(Model.commMessagesInterface.class);

        Call<List<CommMessage>> call = commMessagesInterface.getUserCommMessages(client.getToken(),client.getCommMessages().generateQueries());

        Response<List<CommMessage>> response = call.execute();

        return response.body();

    }

    /*

    Communication Channels API

     */

    public CommunicationChannel createCommunicationChannel(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/communication_channels/",client.getCommunicationChannels().getUserId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        communicationChannelInterface communicationChannelInterface = retrofit.create(Model.communicationChannelInterface.class);

        Call<CommunicationChannel> call = communicationChannelInterface.createCommunicationChannel(client.getCommunicationChannels().getUserId(),client.getToken(),client.getCommunicationChannels().generateQueries());

        Response<CommunicationChannel> response = call.execute();

        return response.body();
    }

    public CommunicationChannel deleteCommunicationChannel(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/communication_channels/%s/",client.getCommunicationChannels().getUserId(),client.getCommunicationChannels().getCommunicationChannelId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        communicationChannelInterface communicationChannelInterface = retrofit.create(Model.communicationChannelInterface.class);

        Call<CommunicationChannel> call = communicationChannelInterface.deleteCommunicationChannel(client.getCommunicationChannels().getUserId(),client.getCommunicationChannels().getCommunicationChannelId(),client.getToken());

        Response<CommunicationChannel> response = call.execute();

        return response.body();

    }

    public CommunicationChannel deleteCommunicationChannelAddress(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/communication_channels/%s/%s/",client.getCommunicationChannels().getUserId(),client.getCommunicationChannels().getCommunicationChannelType(),client.getCommunicationChannels().getCommunicationChannelAddress());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        communicationChannelInterface communicationChannelInterface = retrofit.create(Model.communicationChannelInterface.class);

        Call<CommunicationChannel> call = communicationChannelInterface.deleteCommunicationChannelAddress(client.getCommunicationChannels().getUserId(),client.getCommunicationChannels().getCommunicationChannelType(),client.getCommunicationChannels().getCommunicationChannelAddress(), client.getToken());

        Response<CommunicationChannel> response = call.execute();

        return response.body();

    }

    public boolean deletePushNotification(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/users/self/communications/push/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        communicationChannelInterface communicationChannelInterface = retrofit.create(Model.communicationChannelInterface.class);

        Call<Void> call = communicationChannelInterface.deletePushNotificationEndpoint(client.getToken());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    /*

    Conferences API

     */

    public List<Conference> listConferences(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/conferences/",client.getConference().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        conferenceInterface conferenceInterface = retrofit.create(Model.conferenceInterface.class);

        Call<List<Conference>> call = conferenceInterface.listConferencesCourseID(client.getConference().getCourseId(),client.getToken());

        Response<List<Conference>> response = call.execute();

        return response.body();

    }

    public List<Conference> listConferencesGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/conferences/",client.getConference().getGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        conferenceInterface conferenceInterface = retrofit.create(Model.conferenceInterface.class);

        Call<List<Conference>> call = conferenceInterface.listConferencesGroupId(client.getConference().getGroupId(),client.getToken());

        Response<List<Conference>> response = call.execute();

        return response.body();

    }

    public List<Conference> listConferencesCurrUser(CanvasClient client) throws IOException {

        String url = baseUrl + "/api/v1/conferences/";

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        conferenceInterface conferenceInterface = retrofit.create(Model.conferenceInterface.class);

        Call<List<Conference>> call = conferenceInterface.listCurrUserConferences(client.getToken(),client.getConference().generateQueries());

        Response<List<Conference>> response = call.execute();

        return response.body();

    }

    /*

    Content Exports API

     */

    public List<ContentExport> listContentExportsCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_exports/",client.getContentExport().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<List<ContentExport>> call = contentExportInterface.listContentExportsCourseId(client.getContentExport().getCourseId(),client.getToken());

        Response<List<ContentExport>> response = call.execute();

        return response.body();


    }

    public List<ContentExport> listContentExportGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_exports/",client.getContentExport().getGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<List<ContentExport>> call = contentExportInterface.listContentExportsGroupId(client.getContentExport().getGroupId(),client.getToken());

        Response<List<ContentExport>> response = call.execute();

        return response.body();

    }

    public List<ContentExport> listContentExportUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_exports/",client.getContentExport().getUserId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<List<ContentExport>> call = contentExportInterface.listContentExportsUserId(client.getContentExport().getUserId(),client.getToken());

        Response<List<ContentExport>> response = call.execute();

        return response.body();

    }

    public ContentExport showContentExportCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_exports/%s/",client.getContentExport().getCourseId(),client.getContentExport().getContentExportId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<ContentExport> call = contentExportInterface.showContentExportCourseId(client.getContentExport().getCourseId(),client.getContentExport().getContentExportId(),client.getToken());

        Response<ContentExport> response = call.execute();

        return response.body();

    }

    public ContentExport showContentExportGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_exports/%s/",client.getContentExport().getGroupId(),client.getContentExport().getContentExportId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<ContentExport> call = contentExportInterface.showContentExportGroupId(client.getContentExport().getGroupId(),client.getContentExport().getContentExportId(),client.getToken());

        Response<ContentExport> response = call.execute();

        return response.body();

    }

    public ContentExport showContentExportUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_exports/%s/", client.getContentExport().getUserId(), client.getContentExport().getContentExportId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<ContentExport> call = contentExportInterface.showContentExportUserId(client.getContentExport().getUserId(), client.getContentExport().getContentExportId(), client.getToken());

        Response<ContentExport> response = call.execute();

        return response.body();

    }

    public ContentExport exportContentCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_exports/",client.getContentExport().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<ContentExport> call = contentExportInterface.exportContentCourseID(client.getContentExport().getCourseId(),client.getToken(),client.getContentExport().generateQueries());

        Response<ContentExport> response = call.execute();

        return response.body();


    }

    public ContentExport exportContentUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_exports/",client.getContentExport().getUserId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<ContentExport> call = contentExportInterface.exportContentUserID(client.getContentExport().getUserId(),client.getToken(),client.getContentExport().generateQueries());

        Response<ContentExport> response = call.execute();

        return response.body();

    }

    public ContentExport exportContentGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_exports/",client.getContentExport().getGroupId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentExportInterface contentExportInterface = retrofit.create(Model.contentExportInterface.class);

        Call<ContentExport> call = contentExportInterface.exportContentGroupID(client.getContentExport().getGroupId(),client.getToken(),client.getContentExport().generateQueries());

        Response<ContentExport> response = call.execute();

        return response.body();

    }

    /*


    Content Migrations API


     */



    public List<MigrationIssue> listMigrationIssuesAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/%s/migration_issues",client.getContentMigration().getMigrationAccountId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<MigrationIssue>> call = contentMigrationsInterface.listMigrationIssuesAccountId(client.getContentMigration().getMigrationAccountId(),client.getContentMigration().getContentMigrationId(),client.getToken());

        Response<List<MigrationIssue>> response = call.execute();

        return response.body();



    }

    public List<MigrationIssue> listMigrationIssuesUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_migrations/%s/migration_issues",client.getContentMigration().getCourseId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<MigrationIssue>> call = contentMigrationsInterface.listMigrationIssuesCourseId(client.getContentMigration().getCourseId(),client.getContentMigration().getContentMigrationId(),client.getToken());

        Response<List<MigrationIssue>> response = call.execute();

        return response.body();

    }

    public List<MigrationIssue> listMigrationIssuesGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_migrations/%s/migration_issues",client.getContentMigration().getGroupid(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<MigrationIssue>> call = contentMigrationsInterface.listMigrationIssuesCourseId(client.getContentMigration().getGroupid(),client.getContentMigration().getContentMigrationId(),client.getToken());

        Response<List<MigrationIssue>> response = call.execute();

        return response.body();



    }

    public List<MigrationIssue> listMigrationIssuesCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_migrations/%s/migration_issues",client.getContentMigration().getUserId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<MigrationIssue>> call = contentMigrationsInterface.listMigrationIssuesCourseId(client.getContentMigration().getUserId(),client.getContentMigration().getContentMigrationId(),client.getToken());

        Response<List<MigrationIssue>> response = call.execute();

        return response.body();

    }

    public MigrationIssue getMigrationIssueAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/%s/migration_issues/%s/",client.getContentMigration().getAccountId(),client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<MigrationIssue> call = contentMigrationsInterface.getMigrationIssueAccountId(client.getContentMigration().getAccountId()+"",client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId(),client.getToken());

        Response<MigrationIssue> response = call.execute();

        return response.body();

    }

    public MigrationIssue getMigrationIssueCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_migrations/%s/migration_issues/%s/",client.getContentMigration().getCourseId(),client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<MigrationIssue> call = contentMigrationsInterface.getMigrationIssueCourseId(client.getContentMigration().getCourseId()+"",client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId(),client.getToken());

        Response<MigrationIssue> response = call.execute();

        return response.body();

    }

    public MigrationIssue getMigrationIssueGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_migrations/%s/migration_issues/%s/",client.getContentMigration().getGroupid(),client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<MigrationIssue> call = contentMigrationsInterface.getMigrationIssueGroupId(client.getContentMigration().getGroupid()+"",client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId(),client.getToken());

        Response<MigrationIssue> response = call.execute();

        return response.body();

    }

    public MigrationIssue getMigrationIssueUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_migrations/%s/migration_issues/%s/",client.getContentMigration().getUserId(),client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<MigrationIssue> call = contentMigrationsInterface.getMigrationIssueUserId(client.getContentMigration().getUserId()+"",client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId(),client.getToken());

        Response<MigrationIssue> response = call.execute();

        return response.body();

    }

    public MigrationIssue updateMigrationIssueAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/%s/migration_issues/%s/",client.getContentMigration().getAccountId(),client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<MigrationIssue> call = contentMigrationsInterface.updateMigrationIssueAccountId(client.getContentMigration().getAccountId()+"",client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId(),client.getToken(),client.getContentMigration().generateQueries());

        Response<MigrationIssue> response = call.execute();

        return response.body();

    }

    public MigrationIssue updateMigrationIssueCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_migrations/%s/migration_issues/%s/",client.getContentMigration().getCourseId(),client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<MigrationIssue> call = contentMigrationsInterface.updateMigrationIssueCourseId(client.getContentMigration().getCourseId()+"",client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId(),client.getToken(),client.getContentMigration().generateQueries());

        Response<MigrationIssue> response = call.execute();

        return response.body();

    }

    public MigrationIssue updateMigrationIssueGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_migrations/%s/migration_issues/%s/",client.getContentMigration().getGroupid(),client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<MigrationIssue> call = contentMigrationsInterface.updateMigrationIssueGroupId(client.getContentMigration().getGroupid()+"",client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId(),client.getToken(),client.getContentMigration().generateQueries());

        Response<MigrationIssue> response = call.execute();

        return response.body();

    }

    public MigrationIssue updateMigrationIssueUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_migrations/%s/migration_issues/%s/",client.getContentMigration().getUserId(),client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<MigrationIssue> call = contentMigrationsInterface.updateMigrationIssueUserId(client.getContentMigration().getUserId()+"",client.getContentMigration().getContentMigrationId(),client.getContentMigration().getMigrationIssuesId(),client.getToken(),client.getContentMigration().generateQueries());

        Response<MigrationIssue> response = call.execute();

        return response.body();

    }

    public List<ContentMigration> listContentMigrationsAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/",client.getContentMigration().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<ContentMigration>> call = contentMigrationsInterface.listContentMigrationsAccountId(client.getContentMigration().getAccountId()+"",client.getToken());

        Response<List<ContentMigration>> response = call.execute();

        return response.body();

    }

    public List<ContentMigration> listContentMigrationsCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_migrations/",client.getContentMigration().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<ContentMigration>> call = contentMigrationsInterface.listContentMigrationsCourseId(client.getContentMigration().getCourseId()+"",client.getToken());

        Response<List<ContentMigration>> response = call.execute();

        return response.body();

    }

    public List<ContentMigration> listContentMigrationsGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_migrations/",client.getContentMigration().getGroupid());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<ContentMigration>> call = contentMigrationsInterface.listContentMigrationsGroupId(client.getContentMigration().getGroupid()+"",client.getToken());

        Response<List<ContentMigration>> response = call.execute();

        return response.body();

    }

    public List<ContentMigration> listContentMigrationsUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_migrations/",client.getContentMigration().getUserId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<ContentMigration>> call = contentMigrationsInterface.listContentMigrationsUserId(client.getContentMigration().getUserId()+"",client.getToken());

        Response<List<ContentMigration>> response = call.execute();

        return response.body();

    }

    public ContentMigration getContentMigrationAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/%s/",client.getContentMigration().getAccountId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<ContentMigration> call = contentMigrationsInterface.getContentMigrationAccountId(client.getContentMigration().getAccountId()+"",client.getContentMigration().getContentMigrationId(),client.getToken());

        Response<ContentMigration> response = call.execute();

        return response.body();

    }

    public ContentMigration getContentMigrationCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_migrations/%s/",client.getContentMigration().getCourseId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<ContentMigration> call = contentMigrationsInterface.getContentMigrationCourseId(client.getContentMigration().getCourseId()+"",client.getContentMigration().getContentMigrationId(),client.getToken());

        Response<ContentMigration> response = call.execute();

        return response.body();

    }

    public ContentMigration getContentMigrationGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/%s/",client.getContentMigration().getGroupid(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<ContentMigration> call = contentMigrationsInterface.getContentMigrationGroupId(client.getContentMigration().getGroupid()+"",client.getContentMigration().getContentMigrationId(),client.getToken());

        Response<ContentMigration> response = call.execute();

        return response.body();

    }

    public ContentMigration getContentMigrationUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_migrations/%s/",client.getContentMigration().getUserId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<ContentMigration> call = contentMigrationsInterface.getContentMigrationUserId(client.getContentMigration().getUserId()+"",client.getContentMigration().getContentMigrationId(),client.getToken());

        Response<ContentMigration> response = call.execute();

        return response.body();

    }

    public ContentMigration createContentMigrationAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/",client.getContentMigration().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(contentMigrationsInterface.class);

        Call<ContentMigration> call = contentMigrationsInterface.createContentMigrationAccountId(client.getContentMigration().getAccountId()+"",client.getToken(),client.getContentMigration().generateQueries());

        Response<ContentMigration> response = call.execute();

        return response.body();

    }

    public ContentMigration createContentMigrationCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_migrations/",client.getContentMigration().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(contentMigrationsInterface.class);

        Call<ContentMigration> call = contentMigrationsInterface.createContentMigrationCourseId(client.getContentMigration().getCourseId()+"",client.getToken(),client.getContentMigration().generateQueries());

        Response<ContentMigration> response = call.execute();

        return response.body();

    }

    public ContentMigration createContentMigrationGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_migrations/",client.getContentMigration().getGroupid());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(contentMigrationsInterface.class);

        Call<ContentMigration> call = contentMigrationsInterface.createContentMigrationGroupId(client.getContentMigration().getGroupid()+"",client.getToken(),client.getContentMigration().generateQueries());

        Response<ContentMigration> response = call.execute();

        return response.body();

    }

    public ContentMigration createContentMigrationUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_migrations/",client.getContentMigration().getUserId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(contentMigrationsInterface.class);

        Call<ContentMigration> call = contentMigrationsInterface.createContentMigrationUserId(client.getContentMigration().getUserId()+"",client.getToken(),client.getContentMigration().generateQueries());

        Response<ContentMigration> response = call.execute();

        return response.body();

    }

    public List<Migrator> listMigrationSytemsAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/migrators/",client.getContentMigration().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<Migrator>> call = contentMigrationsInterface.listMigrationSystemsAccountId(client.getContentMigration().getAccountId()+"",client.getToken());

        Response<List<Migrator>> response = call.execute();

        return response.body();

    }

    public List<Migrator> listMigrationSytemsCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_migrations/migrators/",client.getContentMigration().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<Migrator>> call = contentMigrationsInterface.listMigrationSystemsCourseId(client.getContentMigration().getCourseId()+"",client.getToken());

        Response<List<Migrator>> response = call.execute();

        return response.body();

    }

    public List<Migrator> listMigrationSytemsGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_migrations/migrators/",client.getContentMigration().getGroupid());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<Migrator>> call = contentMigrationsInterface.listMigrationSystemsGroupId(client.getContentMigration().getGroupid()+"",client.getToken());

        Response<List<Migrator>> response = call.execute();

        return response.body();

    }

    public List<Migrator> listMigrationSytemsUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_migrations/migrators/",client.getContentMigration().getUserId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<List<Migrator>> call = contentMigrationsInterface.listMigrationSystemsUserId(client.getContentMigration().getUserId()+"",client.getToken());

        Response<List<Migrator>> response = call.execute();

        return response.body();

    }

    public SelectiveData listSelectiveImportItemsAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/content_migrations/%s/selective_data/",client.getContentMigration().getAccountId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<SelectiveData> call = contentMigrationsInterface.listItemsForSelectiveDataAccountId(client.getContentMigration().getAccountId()+"",client.getContentMigration().getContentMigrationId(),client.getToken(),client.getContentMigration().generateQueries());

        Response<SelectiveData> response = call.execute();

        return response.body();

    }

    public SelectiveData listSelectiveImportItemsCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/content_migrations/%s/selective_data/",client.getContentMigration().getCourseId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<SelectiveData> call = contentMigrationsInterface.listItemsForSelectiveDataCourseId(client.getContentMigration().getCourseId()+"",client.getContentMigration().getContentMigrationId(),client.getToken(),client.getContentMigration().generateQueries());

        Response<SelectiveData> response = call.execute();

        return response.body();

    }

    public SelectiveData listSelectiveImportItemsGroupId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/groups/%s/content_migrations/%s/selective_data/",client.getContentMigration().getGroupid(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<SelectiveData> call = contentMigrationsInterface.listItemsForSelectiveDataCourseId(client.getContentMigration().getGroupid()+"",client.getContentMigration().getContentMigrationId(),client.getToken(),client.getContentMigration().generateQueries());

        Response<SelectiveData> response = call.execute();

        return response.body();

    }

    public SelectiveData listSelectiveImportItemsUserId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/users/%s/content_migrations/%s/selective_data/",client.getContentMigration().getUserId(),client.getContentMigration().getContentMigrationId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentMigrationsInterface contentMigrationsInterface = retrofit.create(Model.contentMigrationsInterface.class);

        Call<SelectiveData> call = contentMigrationsInterface.listItemsForSelectiveDataCourseId(client.getContentMigration().getUserId()+"",client.getContentMigration().getContentMigrationId(),client.getToken(),client.getContentMigration().generateQueries());

        Response<SelectiveData> response = call.execute();

        return response.body();

    }

    /*

    Content Security Policy Settings API

     */

    public boolean getCurrentAccountOrCourseSettingsCourseId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/courses/%s/csp_settings",client.getContentSecurityPolicySetting().getCourseId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentSecurityPolicySettingsInterface contentSecurityPolicySettingsInterface = retrofit.create(Model.contentSecurityPolicySettingsInterface.class);

        Call<Void> call = contentSecurityPolicySettingsInterface.getCurrentSettingsCourseId(client.getContentSecurityPolicySetting().getCourseId(),client.getToken());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }

    public boolean getCurrentAccountOrCourseSettingsAccountId(CanvasClient client) throws IOException {

        String url = baseUrl + String.format("/api/v1/accounts/%s/csp_settings/",client.getContentSecurityPolicySetting().getAccountId());

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        contentSecurityPolicySettingsInterface contentSecurityPolicySettingsInterface = retrofit.create(Model.contentSecurityPolicySettingsInterface.class);

        Call<Void> call = contentSecurityPolicySettingsInterface.getCurrentSettingsAccountId(client.getContentSecurityPolicySetting().getAccountId(),client.getToken());

        Response<Void> response = call.execute();

        return response.isSuccessful();

    }
















}
