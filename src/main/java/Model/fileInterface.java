package Model;


import Controller.FilesController.*;
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

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/folders/by_path/{fullFilePath}")
    Call<List<Folder>> resolvePathCourseIdFullPath(@Path("courseId") String courseId, @Path("fullFilePath") String fullFilePath, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/folders/by_path/{fullFilePath}")
    Call<List<Folder>> resolvePathUserIdFullPath(@Path("userId") String userId, @Path("fullFilePath") String fullFilePath, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/folders/by_path/{fullFilePath}")
    Call<List<Folder>> resolvePathGroupIdFullPath(@Path("groupId") String groupId, @Path("fullFilePath") String fullFilePath, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/folders/by_path")
    Call<List<Folder>> resolvePathCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/folders/by_path")
    Call<List<Folder>> resolvePathUserId(@Path("userId") String userId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/folders/by_path")
    Call<List<Folder>> resolvePathGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/folders/{folderId}")
    Call<Folder> getFolderCourseId(@Path("courseId") String courseId, @Path("folderId") String folderId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/folders/{folderId}")
    Call<Folder> getFolderUserId(@Path("userId") String userId, @Path("folderId") String folderId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/folders/{folderId}")
    Call<Folder> getFolderGroupId(@Path("groupId") String groupId, @Path("folderId") String folderId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/folders/{folderId}")
    Call<Folder> getFolderFolderId(@Path("folderId") String folderId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/folders/{folderId}")
    Call<Folder> updateFolder(@Path("folderId") String folderId, @Header("Authorization") String auth, @Body Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/folders")
    Call<Folder> createFolderCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/users/{userId}/folders")
    Call<Folder> createFolderUserId(@Path("userId") String userId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/groups/{groupId}/folders")
    Call<Folder> createFolderGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/folders/{folderId}/folders")
    Call<Folder> createFolderFolderId(@Path("folderId") String folderId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/folders/{folderId}")
    Call<Void> deleteFolder(@Path("folderId") String folderId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/folders/{folderId}/files")
    Call<Void> uploadFile(@Path("folderId") String folderId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/folders/{destFolderId}/copy_file")
    Call<File> copyFile(@Path("destFolderId") String destFolderId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/usage_rights")
    Call<UsageRights> setUsageRightsCourseId(@Path("courseId") String courseid, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/groups/{groupId}/usage_rights")
    Call<UsageRights> setUsageRightsGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/users/{userId}/usage_rights")
    Call<UsageRights> setUsageRightsUserId(@Path("userId") String userId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/folders/{destFolderId}/copy_folder")
    Call<Folder> copyFolder(@Path("destFolderId") String destFolderId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @GET("https://udel.instructure.com/api/v1/course/{courseId}/folders/media")
    Call<Folder> getUploadedMediaFolder(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/folders/media")
    Call<Folder> getUploadedMediaFolderGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/courses/{courseId}/usage_rights")
    Call<Void> removeUsageRightsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/groups/{groupId}/usage_rights")
    Call<Void> removeUsageRightsGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @DELETE("https://udel.instructure.com/api/v1/users/{userId}/usage_rights")
    Call<Void> removeUsageRightsUserId(@Path("userId") String userId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_licenses")
    Call<List<License>> listLicensesCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupID}/content_licenses")
    Call<List<License>> listLicensesGroupId(@Path("groupID") String groupID, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_licenses")
    Call<List<License>> listLicensesUserId(@Path("userId") String userId, @Header("Authorization") String auth);

}
