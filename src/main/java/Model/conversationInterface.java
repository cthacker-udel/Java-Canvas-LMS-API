package Model;

import Controller.ConversationController.Conversation;
import Controller.ConversationController.RunningBatch;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface conversationInterface {

    @GET("https://udel.instructure.com/api/v1/conversations")
    Call<List<Conversation>> listConversations(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/conversations")
    Call<Void> createConversation(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/conversations/batches")
    Call<List<RunningBatch>> getRunningBatches(@Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/conversations/{conversationId}")
    Call<Conversation> getConversation(@Path("conversationId") String conversationId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
