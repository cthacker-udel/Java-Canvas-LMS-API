package Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface contentSecurityPolicySettingsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/csp_settings")
    Call<Void> getCurrentSettingsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/csp_settings")
    Call<Void> getCurrentSettingsAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/csp_settings")
    Call<Void> enableDisableOrClearCSPSettingCourseID(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/csp_settings")
    Call<Void> enableDisableOrClearCSPSettingAccountID(@Path("accountId") String courseId, @Header("Authorization") String auth);

}
