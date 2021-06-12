public interface adminInterface{

    @POST("https://udel.instructure.com/api/v1/accounts/{accountId}/admins")
    Call<Admin> createAdmin(@Path("accountId") Integer accountId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @DELETE("https://udel.instructure.com/api/v1/accounts/{accountId}/admins/{userId}")
    Call<Admin> removeAdmin(@Path("accountId") Integer accountId, @Path("userId") Integer userId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);


}