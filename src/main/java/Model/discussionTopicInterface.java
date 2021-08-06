package Model;

import Controller.DiscussionTopicController.DiscussionTopic;
import Controller.DiscussionTopicController.EntryReply;
import Controller.DiscussionTopicController.FullTopic;
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

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/reorder")
    Call<Void> reorderPinnedTopicsCourse(@Path("courseId") String courseID, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/reorder")
    Call<Void> reorderPinnedTopicsGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}")
    Call<Void> updateEntryCourseId(@Path("courseId") String courseID, @Path("topicId") String topicID, @Path("entryId") String entryId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}")
    Call<Void> updateEntryGroupId(@Path("groupId") String groupId, @Path("topicId") String topicID, @Path("entryId") String entryId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}")
    Call<Void> deleteEntryCourseId(@Path("courseId") String courseID, @Path("topicId") String topicID, @Path("entryId") String entryId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topic/{topicId}/entries/{entryId}")
    Call<Void> deleteEntryGroupId(@Path("groupId") String groupId, @Path("topicId") String topicID, @Path("entryId") String entryId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}")
    Call<DiscussionTopic> getSingleTopicCourseId(@Path("courseId") String courseID, @Path("topicId") String topicId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}")
    Call<DiscussionTopic> getSingleTopicGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/view")
    Call<FullTopic> getFullTopicCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/view")
    Call<FullTopic> getFullTopicGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/entries")
    Call<Void> postEntryCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/entries")
    Call<Void> postEntryGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/duplicate")
    Call<DiscussionTopic> duplicateDiscussionTopicCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/duplicate")
    Call<DiscussionTopic> duplicateDiscussionTopicGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/entries/{entryId}/replies")
    Call<Void> postReplyCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Path("entryId") String entryId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}/replies")
    Call<Void> postReplyGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Path("entryId") String entryId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/dicussion_topics/{topicId}/entries/{entryId}/replies")
    Call<List<EntryReply>> listEntryRepliesCourseId(@Path("courseId") String courseID, @Path("topicId") String topicId, @Path("entryId") String entryId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/entries/{entryId}/replies")
    Call<List<EntryReply>> listEntryRepliesGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Path("entryId") String entryId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/entry_list")
    Call<List<EntryReply>> listEntriesCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/entry_list")
    Call<List<EntryReply>> listEntriesGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/read")
    Call<Void> markTopicReadCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/read")
    Call<Void> markTopicReadGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/read")
    Call<Void> markTopicUnreadCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/read")
    Call<Void> markTopicUnreadGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/discussion_topics/{topicId}/read_all")
    Call<Void> markAllEntriesAsReadCourseId(@Path("courseId") String courseId, @Path("topicId") String topicId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/groups/{groupId}/discussion_topics/{topicId}/read_all")
    Call<Void> markAllEntriesAsReadGroupId(@Path("groupId") String groupId, @Path("topicId") String topicId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
