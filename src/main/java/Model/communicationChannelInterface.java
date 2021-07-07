package Model;

import Controller.CommunicationChannelsController.CommunicationChannel;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.Map;

public interface communicationChannelInterface {

    @POST("https://udel.instructure.com/api/v1/users/{userId}/communication_channels")
    Call<CommunicationChannel> createCommunicationChannel(@Path("userId") String userId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
