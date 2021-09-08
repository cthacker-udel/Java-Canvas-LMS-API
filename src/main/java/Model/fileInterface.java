package Model;


import Controller.FilesController.File;
import Controller.FilesController.Quota;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface fileInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/files/quota")
    Call<Quota> getQuotaInformationCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/files/quota")
    Call<Quota> getQuotaInformationGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/files/quota")
    Call<Quota> getQuotaInformationUserId(@Path("userId") String userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/file")
    Call<List<File>> listFileCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/files")
    Call<List<File>> listFileUserId(@Path("userId") String userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/files")
    Call<List<File>> listFileGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/folders/{folderId}/files")
    Call<List<File>> listFileFolderId(@Path("folderId") String folderId, @Header("Authorization") String auth);




}
