package Model;

import Controller.AssignmentGroupsController.AssignmentGroup.AssignmentGroup;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface assignmentGroupsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignment_groups")
    Call<List<AssignmentGroup>> getAssignmentGroupList(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
