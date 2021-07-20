package Model;

import Controller.CourseController.Course;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface courseInterface {

    @GET("https://udel.instructure.com/api/v1/courses")
    Call<List<Course>> listUserCourses(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
