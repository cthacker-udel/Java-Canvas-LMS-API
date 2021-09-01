package Model;

import Controller.CourseController.Course;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface favoriteInterface {

    @GET("https://udel.instructure.com/api/v1/users/self/favorites/courses")
    Call<List<Course>> listFavoriteCourses(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
