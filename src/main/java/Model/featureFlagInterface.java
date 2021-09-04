package Model;

import Controller.FeatureFlagsController.Feature;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface featureFlagInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/features")
    Call<List<Feature>> listFeaturesCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/features")
    Call<List<Feature>> listFeaturesAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/features/enabled")
    Call<List<Feature>> listFeaturesUserId(@Path("userId") String userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/features/enabled")
    Call<List<Feature>> listEnabledFeaturesCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

}
