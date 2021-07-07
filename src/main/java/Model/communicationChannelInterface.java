package Model;

import Controller.CommunicationChannelsController.CommunicationChannel;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface communicationChannelInterface {

    @POST("https://udel.instructure.com/api/v1/users/{userId}/communication_channels")
    Call<CommunicationChannel> createCommunicationChannel(@Path("userId") String userId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/users/{userId}/communication_channels/{communicationChannelId}")
    Call<CommunicationChannel> deleteCommunicationChannel(@Path("userId") String userId, @Path("communicationChannelId") String communicationChannelId, @Header("Authorization") String auth);

}
