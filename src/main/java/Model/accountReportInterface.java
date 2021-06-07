package Model;

import Controller.AccountController.AccountReport.AvailableReports.AvailableReport;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface accountReportInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/reports")
    Call<List<AvailableReport>> getAvailableReportList(@Path("accountId") Integer accountId, @Header("Authorization") String auth);

}
