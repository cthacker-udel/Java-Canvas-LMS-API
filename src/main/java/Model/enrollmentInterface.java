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

}
