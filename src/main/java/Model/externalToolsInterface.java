package Model;

import Controller.ExternalToolsController.ExternalTool;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface externalToolsInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/external_tools")
    Call<List<ExternalTool>> listExternalToolsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/external_tools")
    Call<List<ExternalTool>> listExternalToolsAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/external_tools")
    Call<List<ExternalTool>> listExternalToolsGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/external_tools/sessionless_launch")
    Call<String> getSessionlessLaunchURLCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/external_tools/sessionless_launch")
    Call<String> getSessionlessLaunchURLAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
