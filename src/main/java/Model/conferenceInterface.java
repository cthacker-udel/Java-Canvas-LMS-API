package Model;


import Controller.ConferencesController.Conference;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface conferenceInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/conferences")
    Call<List<Conference>> listConferencesCourseID(@Path("courseId") String courseId, @Header("Authorization") String auth);

}
