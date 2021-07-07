package Model;

import Controller.CollaborationsController.Collaboration;
import Controller.CollaborationsController.Collaborator;
import Controller.UserController.User;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface collaborationsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/collaborations")
    Call<List<Collaboration>> listCollaborationsCourseID(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/collaborations")
    Call<List<Collaboration>> listCollaborationsGroupID(@Path("groupId") String groupId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/collaborations/{collaborationId}/members")
    Call<List<Collaborator>> listCollaborationMembers(@Path("collaborationId") String collaborationId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/potential_collaborators")
    Call<List<User>> listPotentialMembersCourseID(@Path("courseId") String courseID, @Header("Authorization") String auth);

}
