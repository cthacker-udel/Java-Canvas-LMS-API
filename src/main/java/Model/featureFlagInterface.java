package Model;

import Controller.FeatureFlagsController.EnvironmentalFeature;
import Controller.FeatureFlagsController.Feature;
import Controller.FeatureFlagsController.FeatureFlag;
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

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/features/enabled")
    Call<List<Feature>> listEnabledFeaturesAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/enabled")
    Call<List<Feature>> listEnabledFeaturesUserId(@Path("userId") String userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/features/environment")
    Call<List<EnvironmentalFeature>> listEnvironmentFeatures(@Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/features/flags/{featureFlagId}")
    Call<FeatureFlag> getFeatureFlagCourseId(@Path("courseId") String courseId, @Path("featureFlagId") String featureFlagId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/features/flags/{featureFlagId}")
    Call<FeatureFlag> getFeatureFlagAccountId(@Path("accountId") String accountId, @Path("featureFlagId") String featureFlagId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/features/flags/{featureFlagId}")
    Call<FeatureFlag> getFeatureFlagUserId(@Path("userId") String userId, @Path("featureFlagId") String featureFlagId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/features/flags/{featureFlagId}")
    Call<FeatureFlag> setFeatureFlagCourseId(@Path("courseId") String courseId, @Path("featureFlagId") String featureFlagId, @Header("Authorization") String auth,@Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/features/flags/{featureFlagId}")
    Call<FeatureFlag> setFeatureFlagAccountId(@Path("accountId") String accountId, @Path("featureFlagId") String featureFlagId, @Header("Authorization") String auth,@Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/users/{userId}/features/flags/{featureFlagId}")
    Call<FeatureFlag> setFeatureFlagUserId(@Path("userId") String userId, @Path("featureFlagId") String featureFlagId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/features/flags/{featureFlagId}")
    Call<FeatureFlag> removeFeatureFlagCourseId(@Path("courseId") String courseId, @Path("featureFlagId") String featureFlagId, @Header("Authorization") String auth);



}
