package Model;


import Controller.FilesController.File;
import Controller.FilesController.Folder;
import Controller.FilesController.PublicInlinePreviewURL;
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
    Call<List<File>> listFileCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/files")
    Call<List<File>> listFileUserId(@Path("userId") String userId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/files")
    Call<List<File>> listFileGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/folders/{folderId}/files")
    Call<List<File>> listFileFolderId(@Path("folderId") String folderId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/files/{fileId}/public_url")
    Call<PublicInlinePreviewURL> getPublicInlinePreviewHTMLLink(@Path("fileId") String fileId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/files/{fileId}")
    Call<File> getFileFileIdGET(@Path("fileId") String fileId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/files/{fileId}")
    Call<File> getFileFileIdPOST(@Path("fileId") String fileId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/files/{fileId}")
    Call<File> getFileCourseId(@Path("courseId") String courseId, @Path("fileId") String fileId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/files/{fileId}")
    Call<File> getFileGroupId(@Path("groupId") String groupId, @Path("fileId") String fileId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/files/{fileId}")
    Call<File> getFileUserId(@Path("userId") String userId, @Path("fileId") String fileId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/files/{fileId}")
    Call<File> updateFile(@Path("fileId") String fileId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/files/{fileId}")
    Call<File> deleteFile(@Path("fileId") String fileId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/files/{fileId}/reset_verifier")
    Call<File> resetLinkVerifier(@Path("fileId") String fileId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/folders/{folderId}/folders")
    Call<List<Folder>> listFolders(@Path("folderId") String folderId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/folders")
    Call<List<Folder>> listAllFoldersCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/folders")
    Call<List<Folder>> listAllFoldersUserId(@Path("userId") String userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/folders")
    Call<List<Folder>> listAllFoldersGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth);

}
