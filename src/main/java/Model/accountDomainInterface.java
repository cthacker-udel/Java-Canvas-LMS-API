package Model;

import Controller.AccountController.AccountDomain.AccountDomainSearchResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface accountDomainInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/search")
    Call<List<AccountDomainSearchResponse>> searchAccountDomains(@Header("Authorization") String token, @QueryMap Map<String,Object> domainSearch);

}
