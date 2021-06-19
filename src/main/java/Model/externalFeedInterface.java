package Model;

import Controller.ExternalFeedController.ExternalFeed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface externalFeedInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/external_feeds")
    Call<List<ExternalFeed>> listExternalFeeds(@Path("courseId") String courseId, @Header("Authorization") String auth);

}
