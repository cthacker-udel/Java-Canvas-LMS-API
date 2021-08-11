package Model;


import Controller.EnrollmentTermsController.EnrollmentTerm;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface enrollmentTermsInterface {

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/terms")
    Call<EnrollmentTerm> createEnrollmentTerm(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
