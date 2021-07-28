package Model;

import Controller.CustomGradebookColumsController.CustomColumn;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface customGradebookColumnInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/custom_gradebook_columns")
    Call<List<CustomColumn>> getCustomGradebookColumns(@Path("courseId") String courseID, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
