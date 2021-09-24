package Model;

import Controller.GradingPeriodController.GradingPeriod;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface gradingPeriodInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/grading_periods")
    Call<List<GradingPeriod>> listGradingPeriodsAccountId(@Path("accountId") Integer accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/grading_periods")
    Call<List<GradingPeriod>> listGradingPeriodsCourseId(@Path("courseId") String courseID, @Header("Authorization") String auth);

}
