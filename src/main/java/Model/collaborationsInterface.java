package Model;

import Controller.CollaborationsController.Collaboration;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface collaborationsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/collaborations")
    Call<List<Collaboration>> listCollaborations(@Path("courseId") String courseId, @Header("Authorization") String auth);

}
