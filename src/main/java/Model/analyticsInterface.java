package Model;

import Controller.AnalyticsController.CourseLevelAssignmentData.CourseLevelAssignmentData;
import Controller.AnalyticsController.CourseLevelParticipation.CourseLevelParticipationData;
import Controller.AnalyticsController.CourseLevelStudentSummaryData.CourseLevelStudentSummaryData;
import Controller.AnalyticsController.DepartmentLevelGrades.DepartmentLevelGrades;
import Controller.AnalyticsController.DepartmentLevelParticipation.DepartmentLevelParticipation;
import Controller.AnalyticsController.DepartmentLevelStatistics.DepartmentLevelStatistics;
import Controller.AnalyticsController.UserInCourseParticipationData.UserInCourseParticipationData;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface analyticsInterface{

    @GET("https://udel.instructure.com/api/v1/accounts/analytics/terms/{termId}/activity")
    Call<DepartmentLevelParticipation> getDepartmentLevelParticipation(@Path("termId") String termId, @Header("Authorization") String auth);

    @GET("https://udel.instrcture.com/api/v1/accounts/{accountId}/analytics/current/activity")
    Call<DepartmentLevelParticipation> getCurrentDepartmentLevelParticipation(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/analytics/completed/activity")
    Call<DepartmentLevelParticipation> getCompletedDepartmentLevelParticipation(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/analytics/terms/{termId}/grades")
    Call<DepartmentLevelGrades> getDepartmentLevelGradesByDate(@Path("accountId") String accountId, @Path("termId") String termId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/analytics/current/grades")
    Call<DepartmentLevelGrades> getCurrentDepartmentLevelGrades(@Path("accountId") String accountId, @Header("Authorization") String authorization);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/analytics/completed/grades")
    Call<DepartmentLevelGrades> getCompletedDepartmentLevelGrades(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/analytics/terms/{termId}/statistics")
    Call<DepartmentLevelStatistics> getDepartmentLevelStatisticsByDate(@Path("accountId") String accountId, @Path("termId") String termId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/analytics/current/statistics")
    Call<DepartmentLevelStatistics> getCurrentDepartmentLevelStatistics(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/analytics/completed/statistics")
    Call<DepartmentLevelStatistics> getCompletedDepartmentLevelStatistics(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/analytics/activity")
    Call<List<CourseLevelParticipationData>> getCourseLevelParticipationData(@Path("courseId") String courseId, @QueryMap Map<String,Object> queries, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/analytics/assignments")
    Call<List<CourseLevelAssignmentData>> getCourseLevelAssignmentData(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/analytics/student_summaries")
    Call<List<CourseLevelStudentSummaryData>> getCourseLevelStudentSummaryData(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/analytics/users/{studentId}/activity")
    Call<UserInCourseParticipationData> getUserInCourseParticipationData(@Path("courseId") String courseId, @Path("studentId") String studentId, @Header("Authorization") String auth);

}
