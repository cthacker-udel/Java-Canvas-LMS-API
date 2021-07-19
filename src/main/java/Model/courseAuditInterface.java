package Model;

import Controller.CourseAuditController.CourseEvent;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface courseAuditInterface {

    @GET("https://udel.instructure.com/api/v1/audit/course/courses/{courseId}")
    Call<List<CourseEvent>> queryByCourse(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/audit/course/accounts/{accountId}")
    Call<List<CourseEvent>> queryByAccount(@Path("accountId") String accountId, @Header("Authorization") String auth,@QueryMap Map<String,Object> queries);

}
