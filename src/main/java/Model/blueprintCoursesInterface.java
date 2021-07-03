package Model;

import Controller.BlueprintCourseController.BlueprintMigration;
import Controller.BlueprintCourseController.BlueprintSubscription.BlueprintSubscription;
import Controller.BlueprintCourseController.BlueprintTemplate;
import Controller.BlueprintCourseController.ChangeRecord.ChangeRecord;
import Controller.CourseController.Course;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface blueprintCoursesInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}")
    Call<BlueprintTemplate> getBlueprintInformation(@Path("courseId") String courseId, @Path("templateId") String templateId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}/associated_courses")
    Call<List<Course>> getAssociatedCourseInformation(@Path("courseId") String courseId, @Path("templateId") String templateId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}/update_associations")
    Call<Void> updateAssociatedCourses(@Path("courseId") String courseId, @Path("templateId") String templateId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}/migrations")
    Call<BlueprintMigration> beginMigration(@Path("courseId") String courseId, @Path("templateId") String templateId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @PUT("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}/restrict_item")
    Call<Void> setOrRemoveBlueprintRestrictions(@Path("courseId") String courseId, @Path("templateId") String templateId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}/unsynced_changes")
    Call<List<ChangeRecord>> getUnsyncedChanges(@Path("courseId") String courseId, @Path("templateId") String templateId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}/migrations")
    Call<List<BlueprintMigration>> listBlueprintMigrations(@Path("courseId") String courseId, @Path("templateId") String templateId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}/migrations/{migrationId}")
    Call<BlueprintMigration> showBlueprintMigration(@Path("courseId") String courseId, @Path("templateId") String templateId, @Path("migrationId") String migrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_templates/{templateId}/migrations/{migrationId}/details")
    Call<ChangeRecord> getMigrationDetails(@Path("courseId") String courseId, @Path("templateId") String templateId, @Path("migrationId") String migrationId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_subscriptions")
    Call<List<BlueprintSubscription>> listBlueprintSubscriptions(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/blueprint_subscriptions/{subscriptionId}/migrations")
    Call<List<BlueprintMigration>> listBlueprintImports(@Path("courseId") String courseId, @Path("subscriptionId") String subscriptionId, @Header("Authorization") String auth);

}
