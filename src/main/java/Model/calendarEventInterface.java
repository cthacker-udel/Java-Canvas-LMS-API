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

    @POST("https://udel.instructure.com/api/v1/calendar_events")
    Call<Void> createCalendarEvent(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/calendar_events/{calendarEventId}")
    Call<CalendarEvent> getCalendarEvent(@Path("calendarEventId") String calendarEventId, @Header("Authorization") String auth);

    @POST("https://udel.instructure.com/api/v1/calendar_events/{eventId}/reservations")
    Call<Void> reserveTimeSlotV1(@Path("eventId") String eventId, @Header("Authorization") String auth, @Body Map<String,Object> body);

    @POST("https://udel.instructure.com/api/v1/calendar_events/{eventId}/reservations/{participantId}")
    Call<Void> reserveTimeSlotV2(@Path("eventId") String eventId, @Path("participantId") String participantId, @Header("Authorization") String auth, @Body Map<String,Object> body);

}
