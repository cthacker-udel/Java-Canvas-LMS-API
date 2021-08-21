package Model;

import Controller.EnrollmentController.Enrollment;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface enrollmentInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/enrollments")
    Call<List<Enrollment>> listEnrollmentsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/sections/{sectionId}/enrollments")
    Call<List<Enrollment>> listEnrollmentsSectionId(@Path("sectionId") String sectionId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/enrollments")
    Call<List<Enrollment>> listEnrollmentsUserId(@Path("userId") String userId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/enrollments/{enrollmentId}")
    Call<Enrollment> getEnrollmentById(@Path("accountId") String accountId, @Path("enrollmentId") String enrollment, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/enrollments")
    Call<Void> enrollUserCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/sections/{sectionId}/enrollments")
    Call<Void> enrollUserSectionId(@Path("sectionId") String sectionId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/enrollments/{enrollmentId}")
    Call<Enrollment> concludeOrDeactivateOrDeleteEnrollment(@Path("courseId") String courseid, @Path("enrollmentId") String enrollmentId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/enrollments/{enrollmentId}/accept")
    Call<Void> acceptCourseInvitation(@Path("courseId") String courseId, @Path("enrollmentId") String enrollmentId, @Header("Authorization") String auth);

}
