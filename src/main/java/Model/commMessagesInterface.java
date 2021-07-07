package Model;

import Controller.CommMessagesController.CommMessage;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface commMessagesInterface {

    @GET("https://udel.instructure.com/api/v1/comm_messages")
    Call<List<CommMessage>> getUserCommMessages(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
