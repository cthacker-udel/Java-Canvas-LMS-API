package Model;

import Controller.CourseController.Course;
import Controller.FavoriteController.Favorite;
import Controller.GroupController.Group;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface favoriteInterface {

    @GET("https://udel.instructure.com/api/v1/users/self/favorites/courses")
    Call<List<Course>> listFavoriteCourses(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/users/self/favorites/groups")
    Call<List<Group>> listFavoriteGroups(@Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/users/self/favorites/courses/{courseId}")
    Call<Favorite> addCourseToFavorites(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @POST("https://udel.instructure.com/api/v1/users/self/favorites/groups/{groupId}")
    Call<Favorite> addGroupToFavorites(@Path("groupId") String groupId, @Header("Authorization") String auth, @QueryMap Map<String, Object> queries);

    @DELETE("https://udel.instructure.com/api/v1/users/self/favorites/courses/{courseId}")
    Call<Favorite> removeCourseFromFavorites(@Path("courseId") String courseId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @DELETE("https://udel.instructure.com/api/v1/users/self/favorite/groups/{groupId}")
    Call<Favorite> removeGroupFromFavorites(@Path("groupId") String groupId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
