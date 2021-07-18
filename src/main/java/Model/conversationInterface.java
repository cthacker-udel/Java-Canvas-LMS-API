package Model;

import Controller.ConversationController.*;
import Controller.ProgressController.Progress;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface conversationInterface {

    @GET("https://udel.instructure.com/api/v1/conversations")
    Call<List<Conversation>> listConversations(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/conversations")
    Call<Void> createConversation(@Header("Authorization") String auth, @Body Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/conversations/batches")
    Call<List<RunningBatch>> getRunningBatches(@Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/conversations/{conversationId}")
    Call<Conversation> getConversation(@Path("conversationId") String conversationId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/conversations/{conversationId}")
    Call<Void> editConversation(@Path("conversationId") String conversationId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/conversations/mark_all_as_read")
    Call<Void> markAllConversationsRead(@Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/conversations/{conversationId}")
    Call<DeletedConversation> deleteConversation(@Path("conversationId") String conversation, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/conversations/{conversationId}/add_recipients")
    Call<Recipient> addRecipients(@Path("conversationId") String conversationId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/conversations/{conversationId}/add_message")
    Call<Recipient> addMessage(@Path("conversationId") String conversationId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/conversations/{conversationId}/remove_messages")
    Call<Message> deleteMessage(@Path("conversationId") String conversationId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/conversations")
    Call<Progress> batchUpdateConversations(@Header("Authorization") String auth, @Body Map<String,Object> body);

    @GET("https://udel.instructure.com/api/v1/conversations/find_recipients")
    Call<Void> findRecipients(@Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/conversations/unread_count/")
    Call<Void> getNumberOfUnreadConversations(@Header("Authorization") String auth);


}
