package Model;

import Controller.GradingStandardController.GradingStandard;
import retrofit2.Call;
import retrofit2.http.*;
import java.util.List;
import java.util.Map;

public interface gradingStandardInterface {

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/grading_standards")
    Call<GradingStandard> createNewGradingStandard(@Path("accountId") Integer accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/grading_standards")
    Call<List<GradingStandard>> listGradingStandardsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

}
