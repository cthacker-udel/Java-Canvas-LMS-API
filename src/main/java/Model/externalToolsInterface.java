package Model;

import Controller.ExternalToolsController.ExternalTool;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface externalToolsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/external_tools")
    Call<List<ExternalTool>> listExternalToolsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
