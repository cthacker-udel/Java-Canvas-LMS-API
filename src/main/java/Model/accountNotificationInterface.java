package Model;

import Controller.AccountController.AccountNotification.GlobalAccountNotification;
import Controller.AccountController.AccountNotification.GlobalCreatedNotification;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface accountNotificationInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/account_notifications")
    Call<List<GlobalAccountNotification>> getGlobalNotification(@Path("accountId") Integer accountId, @Header("Authorization") String token);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/account_notifications/{notificationId}")
    Call<List<GlobalAccountNotification>> showGlobalNotification(@Path("accountId") Integer accountId, @Path("notificationId") Integer notificationId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/accounts/{accountId}/account_notifications/{notificationId}")
    Call<GlobalAccountNotification> closeGlobalNotification(@Path("accountId") Integer accountId, @Path("notificationId") Integer notificationId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/account_notifications")
    Call<GlobalCreatedNotification> createGlobalNotification(@Path("accountId") Integer accountId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/account_notifications/{notificationId}")
    Call<GlobalCreatedNotification> updateGlobalNotification(@Path("accountId") Integer accountId, @Path("notificationId") Integer notificationId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
