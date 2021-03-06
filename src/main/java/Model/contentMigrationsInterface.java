package Model;

import Controller.ContentMigrationsController.ContentMigration;
import Controller.ContentMigrationsController.MigrationIssue;
import Controller.ContentMigrationsController.Migrator;
import Controller.ContentMigrationsController.SelectiveData;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface contentMigrationsInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/{contentMigrationId}/migration_issues")
    Call<List<MigrationIssue>> listMigrationIssuesAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues")
    Call<List<MigrationIssue>> listMigrationIssuesCourseId(@Path("courseId") String courseId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_mmigrations/{contentMigrationId}/migration_issues")
    Call<List<MigrationIssue>> listMigrationIssuesGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues")
    Call<List<MigrationIssue>> listMigrationIssuesUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);



    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> getMigrationIssueAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> getMigrationIssueCourseId(@Path("courseId") String courseId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> getMigrationIssueGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> getMigrationIssueUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);



    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> updateMigrationIssueAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> updateMigrationIssueCourseId(@Path("courseId") String courseId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> updateMigrationIssueGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @PUT("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> updateMigrationIssueUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);




    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations")
    Call<List<ContentMigration>> listContentMigrationsAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations")
    Call<List<ContentMigration>> listContentMigrationsCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations")
    Call<List<ContentMigration>> listContentMigrationsGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations")
    Call<List<ContentMigration>> listContentMigrationsUserId(@Path("userId") String userId, @Header("Authorization") String auth);


    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/{contentMigrationId}")
    Call<ContentMigration> getContentMigrationAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}")
    Call<ContentMigration> getContentMigrationCourseId(@Path("courseId") String courseId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations/{contentMigrationId}")
    Call<ContentMigration> getContentMigrationGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}")
    Call<ContentMigration> getContentMigrationUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);


    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations")
    Call<ContentMigration> createContentMigrationAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations")
    Call<ContentMigration> createContentMigrationCourseId(@Path("courseId") String courseId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations")
    Call<ContentMigration> createContentMigrationGroupId(@Path("groupId") String groupId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/users/{userId}/content_migrations")
    Call<ContentMigration> createContentMigrationUserId(@Path("userId") String userId, @Header("Authorization") String auth, @Body Map<String,Object> body);



    @PUT("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/{contentMigrationId}")
    Call<ContentMigration> updateContentMigrationAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}")
    Call<ContentMigration> updateContentMigrationCourseId(@Path("courseId") String courseId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations/{contentMigrationId}")
    Call<ContentMigration> updateContentMigrationGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}")
    Call<ContentMigration> updateContentMigrationUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth, @Body Map<String,Object> body);



    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/migrators")
    Call<List<Migrator>> listMigrationSystemsAccountId(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/migrators")
    Call<List<Migrator>> listMigrationSystemsCourseId(@Path("courseId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations/migrators")
    Call<List<Migrator>> listMigrationSystemsGroupId(@Path("groupId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/migrators")
    Call<List<Migrator>> listMigrationSystemsUserId(@Path("userId") String accountId, @Header("Authorization") String auth);


    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/{contentMigrationId}/selective_data")
    Call<SelectiveData> listItemsForSelectiveDataAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}/selective_data")
    Call<SelectiveData> listItemsForSelectiveDataCourseId(@Path("courseId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations/{contentMigrationId}/selective_data")
    Call<SelectiveData> listItemsForSelectiveDataGroupId(@Path("groupId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}/selective_data")
    Call<SelectiveData> listItemsForSelectiveDataUserId(@Path("userId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);



}
