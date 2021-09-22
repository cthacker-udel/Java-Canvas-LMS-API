package Model;

import Controller.gradebookController.Day;
import Controller.gradebookController.Grader;
import Controller.gradebookController.SubmissionHistory;
import Controller.gradebookController.SubmissionVersion;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface gradebookInterface {

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/gradebook_history/days")
    Call<List<Day>> daysInCourseGradebook(@Path("courseId") String courseId, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/gradebook_history/{gradebookDate}")
    Call<List<Grader>> detailsForGivenDate(@Path("courseId") String courseId, @Path("gradebookDate") String gradebookDate, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/gradebook_history/{gradebookDate}/graders/{graderId}/assingments/{assignmentId}/submissions")
    Call<List<SubmissionHistory>> listSubmissions(@Path("courseId") String courseid, @Path("gradebookDate") String gradebookDate, @Path("graderId") String graderId, @Path("assignmentId") String assignmentId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/courses/{courseId}/gradebook_history/feed")
    Call<List<SubmissionVersion>> listUncollatedSubmissionVersions(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
