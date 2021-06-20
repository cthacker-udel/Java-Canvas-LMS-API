package Model;

import Controller.AnnouncementsController.Announcement;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface announcementsInterface {

    @GET("https://udel.instructure.com/api/v1/announcements")
    Call<List<Announcement>> getAnnouncementsList(@QueryMap Map<String,Object> queries, @Header("Authorization") String auth);

}
