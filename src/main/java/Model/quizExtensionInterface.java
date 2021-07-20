package Model;

import Controller.QuizExtensionsController.QuizExtensions;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

import java.util.Map;

public interface quizExtensionInterface {

    @POST("https://udel.instructure.com/api/v1/courses/{courseId}/quiz_extensions")
    Call<QuizExtensions> setExtensionsForStudentQuizSubmissions(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
