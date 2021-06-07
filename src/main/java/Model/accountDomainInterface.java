package Model;

import Controller.AccountController.AccountDomain.AccountDomainSearchResponse;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface accountDomainInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/search")
    Call<List<AccountDomainSearchResponse>> searchAccountDomains(@Query("access_token") String token, @QueryMap Map<String,Object> domainSearch);

}
