package Model;

import Controller.DiscussionTopicController.DiscussionTopic;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface discussionTopicInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics")
    Call<List<DiscussionTopic>> listDiscussionTopicsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{groupId}/discussion_topics")
    Call<List<DiscussionTopic>> listDiscussionTopicsGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics")
    Call<Void> createDiscussionTopicCourseId(@Path("courseId") String coursId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics")
    Call<Void> createDiscussionTopicGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}")
    Call<Void> updateTopicCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}")
    Call<Void> updateTopicGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}")
    Call<Void> deleteTopicCourseId(@Path("courseId") String courseID, @Path("topicId") String topicID, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}")
    Call<Void> deleteTopicGroupId(@Path("groupId") String groupId, @Path("topicId") String topicID, @Header("Authorization") String auth);

}
