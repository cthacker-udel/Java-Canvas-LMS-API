package Model;

import Controller.AssignmentsController.Assignment.Assignment;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface assignmentsInterface {

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}")
    Call<Assignment> deleteAssignment(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth);

}
