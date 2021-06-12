package Model;

import Controller.AccountController.Accounts.Account;
import Controller.AccountController.Accounts.AccountPermissions.AccountPermissions;
import Controller.AccountController.Accounts.AccountSettings.AccountSettings;
import Controller.AccountController.Accounts.HelpLinks.HelpLinks;
import Controller.AccountController.Accounts.TermsOfService.TermsOfService;
import Controller.CourseController.Course;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface accountsInterface {

    @GET("https://udel.instructure.com/api/v1/accounts")
    Call<List<Account>> listAccounts(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/manageable_accounts")
    Call<List<Account>> listAdminManageableAccounts(@Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/course_accounts")
    Call<List<Account>> listAccountsForCourseAdmins(@Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}")
    Call<Account> getAccount(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/settings")
    Call<AccountSettings> getAccountSettings(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/permissions")
    Call<AccountPermissions> getAccountPermissions(@Path("accountId") String accountId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/sub_accounts")
    Call<List<Account>> getSubAccountsOfAccount(@Path("accountId") String accountId, @Header("Authorization") String auth, @Query("recursive") Boolean recursive);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/terms_of_service")
    Call<TermsOfService> getAccountsTermsOfService(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/help_links")
    Call<HelpLinks> getAccountHelpLinks(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/courses")
    Call<List<Course>> getActiveCoursesInAccount(@Path("accountId") String accountId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}")
    Call<Account> updateAccount(@Path("accountId") String accountId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @DELETE("https://udel.instructure.com/api/v1/accounts/{accountId}/users/{userId}")
    Call<User> deleteUserFromRootAccount(@Path("accountId") String accountId, @Path("userId") String userId, @Header("Authorization") String auth);

}
