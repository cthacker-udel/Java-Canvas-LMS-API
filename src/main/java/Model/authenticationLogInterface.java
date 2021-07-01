package Model;

import Controller.AuthenticationLogController.AuthenticationEvent;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface authenticationLogInterface {

    @GET("https://udel.instructure.com/api/v1/audit/authentication/logins/{loginId}")
    Call<List<AuthenticationEvent>> queryByLogin(@Path("loginId") String loginId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/audit/authentication/accounts/{accountId}")
    Call<List<AuthenticationEvent>> queryByAccount(@Path("accountId") String loginId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
