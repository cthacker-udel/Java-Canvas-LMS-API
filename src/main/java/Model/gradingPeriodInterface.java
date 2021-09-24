package Model;

import Controller.GradingPeriodController.GradingPeriod;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface gradingPeriodInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/grading_periods")
    Call<List<GradingPeriod>> listGradingPeriodsAccountId(@Path("accountId") Integer accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/grading_periods")
    Call<List<GradingPeriod>> listGradingPeriodsCourseId(@Path("courseId") String courseID, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/grading_periods/{gradingPeriodId}")
    Call<GradingPeriod> getSingleGradingPeriod(@Path("courseId") String courseId, @Path("gradingPeriodId") String gradingPeriodId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/grading_periods/{gradingPeriodId}")
    Call<Void> updateSingleGradingPeriod(@Path("courseId") String courseId, @Path("gradingPeriodId") String gradingPeriodId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
