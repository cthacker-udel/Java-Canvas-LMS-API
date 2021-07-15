package Model;

import Controller.ContentSharesController.ContentShare;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.Map;

public interface contentShareInterface {

    @POST("https://udel.instructure.com/api/v1/users/{userId}/content_shares")
    Call<ContentShare> createContentShare(@Path("userId") Integer userId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
