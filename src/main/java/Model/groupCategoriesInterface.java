package Model;


import Controller.GroupCategoriesController.GroupCategory;
import Controller.ProgressController.Progress;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface groupCategoriesInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/group_categories")
    Call<List<GroupCategory>> listGroupCategoriesAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/group_categories")
    Call<List<GroupCategory>> listGroupCategoriesCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/group_categories/{groupCategoryId}")
    Call<GroupCategory> getSingleGroupCategory(@Path("groupCategoryId") String groupCategoryId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/group_categories")
    Call<GroupCategory> createGroupCategory(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/group_categories")
    Call<GroupCategory> createGroupCategoryCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/group_categories/{groupCategoryId}/import")
    Call<Progress> importCategoryGroups(@Path("groupCategoryId") String groupCategoryId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/group_categories/{groupCategoryId}")
    Call<GroupCategory> updateGroupCategory(@Path("groupCategoryId") String groupCategoryId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
