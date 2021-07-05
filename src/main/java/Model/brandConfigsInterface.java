package Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface brandConfigsInterface {

    @GET("https://udel.instructure.com/api/v1/brand_variables")
    Call<Void> getBrandConfig(@Header("Authorization") String auth);

}
