package Model;


import Controller.EnrollmentTermsController.EnrollmentTerm;
import getRequests.EnrollmentTerms;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface enrollmentTermsInterface {

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/terms")
    Call<EnrollmentTerm> createEnrollmentTerm(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/terms/{termId}")
    Call<EnrollmentTerm> updateEnrollmentTerm(@Path("accountId") String accountId, @Path("termId") String termId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/accounts/{accountId}/terms/{termId}")
    Call<EnrollmentTerm> deleteEnrollmentTerm(@Path("accountId") String accountId, @Path("termId") String termId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/terms")
    Call<List<EnrollmentTerms>> listEnrollmentTerms(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
