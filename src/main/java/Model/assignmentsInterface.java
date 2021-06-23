package Model;

import Controller.AssignmentsController.Assignment.Assignment;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface assignmentsInterface {

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}")
    Call<Assignment> deleteAssignment(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignments")
    Call<List<Assignment>> listAssignments(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
