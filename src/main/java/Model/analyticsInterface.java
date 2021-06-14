public interface analyticsInterface{

    @GET("https://udel.instructure.com/api/v1/accounts/analytics/terms/{termId}/activity")
    Call<DepartmentLevelParticipation> getDepartmentLevelParticipation(@Path("termId") String termId, @Header("Authorization") String auth);

    @GET("https://udel.instrcture.com/api/v1/accounts/{accountId}/analytics/current/activity")
    Call<DepartmentLevelParticipation> getCurrentDepartmentLevelParticipation(@Path("accountId") String accountId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/accounts/{accountId}/analytics/completed/activity")
    Call<DepartmentLevelParticipation> getCompletedDepartmentLevelParticipation(@Path("accountId") String accountId, @Header("Authorization") String auth);
    



}