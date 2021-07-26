package Model;

import Controller.CourseController.Course;
import Controller.CourseController.CourseProgress;
import Controller.CourseController.HTML;
import Controller.CourseController.Settings;
import Controller.ProgressController.Progress;
import Controller.UserController.User;
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

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/courses")
    Call<Course> createCourse(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/files")
    Call<Void> uploadFile(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/students")
    Call<List<User>> listStudents(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/users")
    Call<List<User>> listCourseUsers(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/search_users")
    Call<List<User>> listCourseUsersSearch(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/recent_students")
    Call<List<User>> listRecentlyLoggedStudents(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/users/{userId}")
    Call<User> getSingleUser(@Path("courseId") String courseId, @Path("userId") String userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_share_users")
    Call<List<User>> searchForContentShareUsers(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/preview_html")
    Call<HTML> previewProcessedHTML(@Path("courseId") String courseID, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @Streaming
    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/activity_stream")
    Call<Object> getCourseActivityStream(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/activity_stream/summary")
    Call<Object> getCourseActivityStreamSummary(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/todo")
    Call<Object> getTODOItems(@Path("courseId") String courseID, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}")
    Call<Void> deleteCourse(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/settings")
    Call<Settings> getCourseSettings(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/settings")
    Call<Void> updateCourseSettings(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/student_view_student")
    Call<User> getCourseTestStudent(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}")
    Call<Course> getSingleCourse(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/courses/{courseId}")
    Call<Course> getSingleCourseAccountId(@Path("accountId") String accountId, @Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}")
    Call<Course> updateCourse(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/courses")
    Call<Progress> updateCourses(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);


}
