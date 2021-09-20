package Model;

import Controller.gradebookController.Day;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface gradebookInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/gradebook_history/days")
    Call<List<Day>> daysInCourseGradebook(@Path("courseId") String courseId, @Header("Authorization") String auth);

}
