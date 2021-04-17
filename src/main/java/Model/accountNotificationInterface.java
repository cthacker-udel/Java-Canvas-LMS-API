package Model;

import Controller.AccountController.AccountNotification.GlobalAccountNotification;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface accountNotificationInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/account_notifications")
    Call<GlobalAccountNotification> getGlobalNotification(@Path("accountId") Integer accountId, @Header("Authorization") String token);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/account_notifications/{notificationId}")
    Call<GlobalAccountNotification> showGlobalNotification(@Path("accountId") Integer accountId, @Path("notificationId") Integer notificationId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/accounts/{accountId}/account_notifications/{notificationId}")
    Call<GlobalAccountNotification> closeGlobalNotification(@Path("accountId") Integer accountId, @Path("notifiacationId") Integer notificationId, @Header("Authorization") String auth);

}
