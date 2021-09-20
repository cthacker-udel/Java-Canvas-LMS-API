package Model;

import Controller.GradeChangeLogController.GradeChangeEvent;
import retrofit2.Call;
import retrofit2.http.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

public interface gradeChangeLogInterface {

    @GET("https://udel.instructure.com/api/v1/audit/grade_change/assignments/{assignmentId}")
    Call<List<GradeChangeEvent>> queryByAssignment(@Path("assignmentId") String assignmentId, @Header("Authorization") String auth, @Field("start_time")ZonedDateTime startTime, @Field("end_time") ZonedDateTime endTime);

    @GET("https://udel.instructure.com/api/v1/audit/grade/courses/{courseId}")
    Call<List<GradeChangeEvent>> queryByCourse(@Path("courseId") String courseId, @Header("Authorization") String auth, @Field("start_time") ZonedDateTime startTime, @Field("end_time") ZonedDateTime endTime);

    @GET("https://udel.instructure.com/api/v1/audit/grade_change/graders/{graderId}")
    Call<List<GradeChangeEvent>> queryByGrader(@Path("graderId") String graderId, @Header("Authorization") String auth, @Field("start_time") ZonedDateTime startTime, @Field("end_time") ZonedDateTime endTime);

}
