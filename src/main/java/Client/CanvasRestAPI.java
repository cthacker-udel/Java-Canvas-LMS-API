package Client;

import Controller.AccountController.AccountDomain.AccountDomainSearchResponse;
import Controller.AccountController.AccountNotification.GlobalAccountNotification;
import Controller.AccountController.AccountNotification.GlobalCreatedNotification;
import Controller.AccountController.AccountReport.AvailableReports.AvailableReport;
import Controller.AccountController.AccountReport.CreatedReport.CreatedReport;
import Controller.AccountController.Accounts.Account;
import Controller.CalendarEventController.CalendarEvent.CalendarEvent;
import Model.*;
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
import java.util.Calendar;
import java.util.List;

public class CanvasRestAPI{

    /*

        Oauth - Methods


     */

    String baseUrl = "https://udel.instructure.com";


    public void getOauth2Token(CanvasClient client){

        // need access to client id

        HttpUrl.Builder urlBuilder = HttpUrl.parse(baseUrl + "/login/oauth2/auth").newBuilder();

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

        Call<List<Account>> call = accountsInterface.listAccounts(client.getToken());

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






}
