package Model;


import Controller.ConferencesController.Conference;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface conferenceInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/conferences")
    Call<List<Conference>> listConferencesCourseID(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/conferences")
    Call<List<Conference>> listConferencesGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/conferences")
    Call<List<Conference>> listCurrUserConferences(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);



}
