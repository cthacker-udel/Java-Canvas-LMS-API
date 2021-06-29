package Model;

import Controller.AuthenticationProvidersController.AuthenticationProviders;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface authenticationProvidersInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/authentication_providers")
    Call<List<AuthenticationProviders>> listAuthenticationProviders(@Path("accountId") String accountId, @Header("Authorization") String authorization);

}
