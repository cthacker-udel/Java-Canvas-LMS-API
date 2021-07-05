package Model;

import Controller.BookmarksController.Bookmark;
import Controller.FilesController.Folder;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface bookmarksInterface {

    @GET("https://udel.instructure.com/api/v1/users/self/bookmarks")
    Call<List<Bookmark>> listBookmarks(@Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/users/self/bookmarks")
    Call<Bookmark> createBookmark(@Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/users/self/bookmarks/{bookmarkId}")
    Call<Bookmark> getBookmark(@Path("bookmarkId") String bookmarkId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/users/self/bookmarks/{bookmarkId}")
    Call<Folder> updateBookmark(@Path("bookmarkId") String bookmarkId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
