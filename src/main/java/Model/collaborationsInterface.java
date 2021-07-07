package Model;

import Controller.CollaborationsController.Collaboration;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface collaborationsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/collaborations")
    Call<List<Collaboration>> listCollaborationsCourseID(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/collaborations")
    Call<List<Collaboration>> listCollaborationsGroupID(@Path("groupId") String groupId, @Header("Authorization") String auth);

}
