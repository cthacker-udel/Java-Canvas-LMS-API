package Model;


import Controller.GroupCategoriesController.GroupCategory;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface groupCategoriesInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/group_categories")
    Call<List<GroupCategory>> listGroupCategoriesAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/group_categories")
    Call<List<GroupCategory>> listGroupCategoriesCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

}
