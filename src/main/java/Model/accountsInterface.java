package Model;

import Controller.AccountController.Accounts.Account;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

import java.util.List;

public interface accountsInterface {

    @GET("https://udel.instructure.com/api/v1/accounts")
    Call<List<Account>> listAccounts(@Header("Authorization") String auth);

}
