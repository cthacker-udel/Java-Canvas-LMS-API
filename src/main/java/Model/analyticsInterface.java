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

}