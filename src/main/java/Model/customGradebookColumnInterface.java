package Model;

import Controller.CustomGradebookColumsController.CustomColumn;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface customGradebookColumnInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/custom_gradebook_columns")
    Call<List<CustomColumn>> getCustomGradebookColumns(@Path("courseId") String courseID, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/custom_gradebook_columns")
    Call<CustomColumn> createCustomGradebookColumns(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/custom_gradebook_columns/{customGradebookColumnId}")
    Call<CustomColumn> updateCustomGradebookColumns(@Path("courseId") String courseID, @Path("customGradebookColumnId") String customGradebookColumnId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/custom_gradebook_columns/{customGradebookColumnId}")
    Call<CustomColumn> deleteCustomGradebookColumns(@Path("courseId") String courseID, @Path("customGradebookColumnId") String customGradebookColumnId, @Header("Authorization") String auth);


}
