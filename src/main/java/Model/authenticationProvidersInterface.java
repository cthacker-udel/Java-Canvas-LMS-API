package Model;

import Controller.AuthenticationProvidersController.AuthenticationProviders;
import Controller.AuthenticationProvidersController.SSOSettings;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface authenticationProvidersInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/authentication_providers")
    Call<List<AuthenticationProviders>> listAuthenticationProviders(@Path("accountId") String accountId, @Header("Authorization") String authorization);

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/authentication_providers")
    Call<AuthenticationProviders> addAuthenticationProvider(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/authentication_providers/{authId}")
    Call<AuthenticationProviders> updateAuthenticationProviders(@Path("accountId") String accountId, @Path("authId") String authId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/authentication_providers/{authId}")
    Call<AuthenticationProviders> getAuthenticationProvider(@Path("accountId") String accountID, @Path("authId") String authId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/accounts/{accountId}/authentication_providers/{authId}")
    Call<Void> deleteAuthenticationProvider(@Path("accountId") String accountId, @Path("authId") String authId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/sso_settings")
    Call<SSOSettings> showAccountAuthSettings(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/sso_settings")
    Call<SSOSettings> updateAuthSettings(@Path("accountId") String accountId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
