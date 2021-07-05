package Model;

import Controller.BookmarksController.Bookmark;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

import java.util.List;

public interface bookmarksInterface {

    @GET("https://udel.instructure.com/api/v1/users/self/bookmarks")
    Call<List<Bookmark>> listBookmarks(@Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/users/self/bookmarks")
    Call<Bookmark> createBookmark(@Header("Authorization") String auth);

}
