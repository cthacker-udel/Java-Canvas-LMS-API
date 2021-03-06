package Model;

import Controller.AssignmentGroupsController.AssignmentGroup.AssignmentGroup;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface assignmentGroupsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignment_groups")
    Call<List<AssignmentGroup>> getAssignmentGroupList(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignment_groups/{assignmentGroupId}")
    Call<AssignmentGroup> getSingularAssignmentGroup(@Path("courseId") String courseId, @Path("assignmentGroupId") String assignmentGroupId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/assignment_groups")
    Call<AssignmentGroup> createAssignmentGroup(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/assignment_groups/{assignmentGroupsId}")
    Call<AssignmentGroup> editAssignmentGroup(@Path("courseId") String courseId, @Path("assignmentGroupsId") String assignmentGroupsId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/assignment_groups/{assignmentGroupsId}")
    Call<AssignmentGroup> deleteAssignmentGroup(@Path("courseId") String courseId, @Path("assignmentGroupsId") String assignmentGroupsId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
