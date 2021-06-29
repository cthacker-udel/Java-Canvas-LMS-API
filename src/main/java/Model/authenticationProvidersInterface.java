package Model;

import Controller.AuthenticationProvidersController.AuthenticationProviders;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface authenticationProvidersInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/authentication_providers")
    Call<List<AuthenticationProviders>> listAuthenticationProviders(@Path("accountId") String accountId, @Header("Authorization") String authorization);

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/authentication_providers")
    Call<AuthenticationProviders> addAuthenticationProvider(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
