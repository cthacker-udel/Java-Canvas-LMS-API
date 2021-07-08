package Model;

import Controller.ContentExportsController.ContentExport;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface contentExportInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_exports")
    Call<List<ContentExport>> listContentExportsCourseId(@Path("courseId") String courseID, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_exports")
    Call<List<ContentExport>> listContentExportsGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_exports")
    Call<List<ContentExport>> listContentExportsUserId(@Path("userId") String userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_exports/{contentExportId}")
    Call<ContentExport> showContentExportCourseId(@Path("courseId") String courseId, @Path("contentExportId") String contentExportId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_exports/{contentExportId}")
    Call<ContentExport> showContentExportGroupId(@Path("groupId") String groupId, @Path("contentExportId") String contentExportId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_exports/{contentExportId}")
    Call<ContentExport> showContentExportUserId(@Path("userId") String userId, @Path("contentExportId") String contentExportId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/content_exports")
    Call<ContentExport> exportContentCourseID(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/groups/{groupId}/content_exports")
    Call<ContentExport> exportContentGroupID(@Path("groupId") String groupId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/users/{userId}/content_exports")
    Call<ContentExport> exportContentUserID(@Path("userId") String userId, @Header("Authorization") String auth, @Body Map<String,Object> body);
}
