package Model;

import Controller.CalendarEventController.CalendarEvent.CalendarEvent;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

public interface calendarEventInterface {

    @GET("https://udel.instructure.com/api/v1/calendar_events")
    Call<List<CalendarEvent>> getListOfCalendarEvents(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/users/{userId}/calendar_events")
    Call<List<CalendarEvent>> getListOfUserCalendarEvents(@Path("userId") String userId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
