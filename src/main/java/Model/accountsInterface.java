package Model;

import Controller.AccountController.Accounts.Account;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

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

}
