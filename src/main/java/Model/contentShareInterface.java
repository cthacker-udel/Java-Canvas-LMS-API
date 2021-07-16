package Model;

import Controller.ContentSharesController.ContentShare;
import retrofit2.Call;
import retrofit2.http.*;

import javax.swing.text.AbstractDocument;
import java.util.List;
import java.util.Map;

public interface contentShareInterface {

    @POST("https://udel.instructure.com/api/v1/users/{userId}/content_shares")
    Call<ContentShare> createContentShare(@Path("userId") Integer userId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_shares/sent")
    Call<List<ContentShare>> listContentSharesSent(@Path("userId") Integer userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_shares/received")
    Call<List<ContentShare>> listContentSharesReceived(@Path("userId") Integer userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_shares/unread_count")
    Call<Integer> getUnreadSharesCount(@Path("userId") Integer userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_shares/{contentShareId}")
    Call<ContentShare> getContentShare(@Path("userId") Integer userId, @Path("contentShareId") Integer contentShareId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/users/{userId}/content_shares/{contentShareId}")
    Call<Void> removeContentShare(@Path("userId") Integer userId, @Path("contentShareId") Integer contentShareId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/api/v1/users/{userId}/content_shares/{contentShareId}/add_users")
    Call<ContentShare> addUserToContentShare(@Path("userId") String userId, @Path("contentShareId") String contentShareId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/users/{userId}/content_shares/{contentShareId}")
    Call<ContentShare> updateContentShare(@Path("userId") Integer userId, @Path("contentShareId") Integer contentShareId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
