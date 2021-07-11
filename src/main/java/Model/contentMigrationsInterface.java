package Model;

import Controller.ContentMigrationsController.ContentMigration;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

import java.util.List;

public interface contentMigrationsInterface {

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/{contentMigrationId}/migration_issues")
    Call<List<ContentMigration>> listMigrationIssuesAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues")
    Call<List<ContentMigration>> listMigrationIssuesCourseId(@Path("courseId") String courseId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_mmigrations/{contentMigrationId}/migration_issues")
    Call<List<ContentMigration>> listMigrationIssuesGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues")
    Call<List<ContentMigration>> listMigrationIssuesUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<ContentMigration> getMigrationIssueAccountId(@Path("accountId") String accountId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<ContentMigration> getMigrationIssueCourseId(@Path("courseId") String courseId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/groups/{groupId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<ContentMigration> getMigrationIssueGroupId(@Path("groupId") String groupId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/content_migrations/{contentMigrationId}/migration_issues/{migrationIssueId}")
    Call<ContentMigration> getMigrationIssueUserId(@Path("userId") String userId, @Path("contentMigrationId") String contentMigrationId, @Path("migrationIssueId") String migrationIssueId);

}
