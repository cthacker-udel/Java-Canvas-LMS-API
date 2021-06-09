package Model;

import Controller.CalendarEventController.CalendarEvent.CalendarEvent;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface calendarEventInterface {

    @GET("https://udel.instructure.com/api/v1/calendar_events")
    Call<List<CalendarEvent>> getListOfCalendarEvents(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
