package Model;

import Controller.ContentMigrationsController.ContentMigration;
import Controller.ContentMigrationsController.MigrationIssue;
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
    Call<MigrationIssue> getMigrationIssueGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> getMigrationIssueUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId);



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

}
