package Model;

import Controller.DiscussionTopicController.DiscussionTopic;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface discussionTopicInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics")
    Call<List<DiscussionTopic>> listDiscussionTopicsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{groupId}/discussion_topics")
    Call<List<DiscussionTopic>> listDiscussionTopicsGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
