package Model;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface contentSecurityPolicySettingsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/csp_settings")
    Call<Void> getCurrentSettingsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/csp_settings")
    Call<Void> getCurrentSettingsAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/csp_settings")
    Call<Void> enableDisableOrClearCSPSettingCourseID(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/csp_settings")
    Call<Void> enableDisableOrClearCSPSettingAccountID(@Path("accountId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/csp_settings/lock")
    Call<Void> lockOrUnlockCSPSettingsSubAccountsCourses(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/csp_settings/domains")
    Call<Void> addAllowedDomainToAccount(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
