package Model;

import Controller.ConversationController.Conversation;
import Controller.ConversationController.RunningBatch;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface conversationInterface {

    @GET("https://udel.instructure.com/api/v1/conversations")
    Call<List<Conversation>> listConversations(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/conversations")
    Call<Void> createConversation(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/conversations/batches")
    Call<List<RunningBatch>> getRunningBatches(@Header("Authorization") String auth);

}
