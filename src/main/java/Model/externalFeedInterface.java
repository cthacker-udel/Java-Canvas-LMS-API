package Model;

import Controller.ExternalFeedController.ExternalFeed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface externalFeedInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/external_feeds")
    Call<List<ExternalFeed>> listExternalFeedsByCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/external_feeds")
    Call<List<ExternalFeed>> listExternalFeedsByGroupID(@Path("groupId") String groupId, @Header("Authorization") String auth);

}
