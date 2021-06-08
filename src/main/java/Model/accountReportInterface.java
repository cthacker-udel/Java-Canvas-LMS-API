package Model;

import Controller.AccountController.AccountReport.AvailableReports.AvailableReport;
import Controller.AccountController.AccountReport.CreatedReport.CreatedReport;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface accountReportInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/reports")
    Call<List<AvailableReport>> getAvailableReportList(@Path("accountId") Integer accountId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/reports/{reportId}")
    Call<CreatedReport> startReport(@Path("accountId") Integer accountId, @Path("reportId") String reportId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://api.udel.instructure.com/api/v1/accounts/{accountId}/reports/{reportId}")
    Call<List<CreatedReport>> indexOfReports(@Path("accountId") Integer accountId, @Path("reportId") String reportId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://api.udel.instructure.com/api/v1/accounts/{accountId}/reports/{reportType}/{reportId}")
    Call<CreatedReport> reportStatus(@Path("accountId") Integer accountId, @Path("reportType") String reportType, @Path("reportId") String reportId, @Header("Authorization") String auth);
}
