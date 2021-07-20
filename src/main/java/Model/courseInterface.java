package Model;

import Controller.CourseController.Course;
import Controller.CourseController.CourseProgress;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface courseInterface {

    @GET("https://udel.instructure.com/api/v1/courses")
    Call<List<Course>> listCurrUserCourses(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/courses")
    Call<List<Course>> listUserCourses(@Path("userId") String userId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/users/{userId}/progress")
    Call<CourseProgress> getUserProgress(@Path("courseId") String courseId, @Path("userId") String userId, @Header("Authorization") String auth);

}
