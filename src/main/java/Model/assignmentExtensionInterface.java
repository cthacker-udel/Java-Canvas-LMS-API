package Model;

import Controller.AssignmentExtensionController.SetExtensions.SetExtensions;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface assignmentExtensionInterface {

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/assignments/{assignmentId}/extensions")
    Call<SetExtensions> setExtensionsForStudentAssignmentSubmissions(@Header("Authorization") String auth, @Body Map<String,Object> queries);

}
