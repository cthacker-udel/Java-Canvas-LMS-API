package Model;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

public interface errorReportInterface {

    @POST("https://udel.instructure.com/api/v1/error_reports")
    Call<Void> createErrorReport(@Header("Authorization") String token, @Body Map<String,Object> body);

}
