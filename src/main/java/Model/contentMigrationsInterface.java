package Model;

import Controller.ContentMigrationsController.ContentMigration;
import Controller.ContentMigrationsController.MigrationIssue;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

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
    Call<MigrationIssue> updateMigrationIssueAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> updateMigrationIssueCourseId(@Path("courseId") String courseId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> updateMigrationIssueGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<MigrationIssue> updateMigrationIssueUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

}
