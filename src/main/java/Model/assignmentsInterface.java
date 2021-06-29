package Model;

import Controller.AssignmentsController.Assignment.Assignment;
import Controller.AssignmentsController.AssignmentOverride;
import Controller.ProgressController.Progress;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface assignmentsInterface {

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}")
    Call<Assignment> deleteAssignment(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignments")
    Call<List<Assignment>> listAssignments(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignment_groups/{assignmentsGroupId}/assignments")
    Call<List<Assignment>> listAssignmentsV2(@Path("courseId") String courseId, @Path("assignmentsGroupId") String assignmentsGroupId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/courses/{courseId}/assignments")
    Call<List<Assignment>> listUserAssignments(@Path("userId") String userId, @Path("courseId") String courseId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}/duplicate")
    Call<Assignment> duplicateAssignment(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}")
    Call<Assignment> getAssignment(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/assignments")
    Call<Assignment> createAssignment(@Path("courseId") String courseId, @Header("Authorization") String auth,@Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}")
    Call<Assignment> editAssignment(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/bulk_update")
    Call<Progress> bulkUpdateAssignmentDates(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}/overrides")
    Call<List<AssignmentOverride>> listAssignmentOverrides(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}/overrides/{overrideId}")
    Call<AssignmentOverride> getSingleAssignmentOverride(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Path("overrideId") String overrideId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/assignments/{assignmentId}/override")
    Call<String> getAssignmentOverrideRedirect(@Path("groupId") String groupId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}/overrides")
    Call<AssignmentOverride> createAssignmentOverride(@Path("courseId") String courseId, @Path("assignmentId") String assingmentId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}/overrides/{overrideId}")
    Call<AssignmentOverride> updateAssignmentOverride(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Path("overrideId") String overrideId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}/overrides/{overrideId}")
    Call<AssignmentOverride> deleteAssignmentOverride(@Path("courseId") String courseId, @Path("assignmentId") String assignmentId, @Path("overrideId") String overrideId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/overrides")
    Call<List<AssignmentOverride>> batchRetrieveOverrides(@Path("courseId") Integer courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/overrides")
    Call<List<AssignmentOverride>> batchCreateOverrides(@Path("courseId") Integer courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/overrides")
    Call<List<AssignmentOverride>> batchUpdateOverrides(@Path("courseId") Integer courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
