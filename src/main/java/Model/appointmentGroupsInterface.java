package Model;

import Controller.AppointmentGroupsController.AppointmentGroup.AppointmentGroup;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;
import java.util.Map;

public interface appointmentGroupsInterface {

    @GET("https://udel.instructure.com/api/v1/appointment_groups")
    Call<List<AppointmentGroup>> getAppointmentGroupList(@QueryMap Map<String,Object> queries, @Header("Authorization") String token);

    @POST("https://udel.instructure.com/api/v1/appointment_groups")
    Call<Void> createAppointmentGroups(@Body Map<String,Object>  body, @Header("Authorization") String auth);

    @GET("https://udel.instructure.com/api/v1/appointment_groups/{appointmentId}")
    Call<AppointmentGroup> getAppointment(@Path("appointmentId") String appointmentId, @Header("Authorization") String auth);

    @PUT("https://udel.instructure.com/api/v1/appointment_groups/{appointmentId}")
    Call<AppointmentGroup> updateAppointment(@Path("appointmentId") String appointmentId, @Header("Authorization") String auth);

    @DELETE("https://udel.instructure.com/api/v1/appointment_groups/{appointmentId}")
    Call<Void> deleteAppointmentGroup(@Path("appointmentId") String appointmentId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/appointment_groups/{appointmentId}/users")
    Call<List<AppointmentGroup>> listUserParticipants(@Path("appointmentId") String appointmentId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/appointment_groups/{appointmentId}/groups")
    Call<List<AppointmentGroup>> listStudentGroupParticipants(@Path("appointmentId") String appointmentId, @Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

    @GET("https://udel.instructure.com/api/v1/appointment_groups/next_appointment")
    Call<AppointmentGroup> getNextAppointment(@Header("Authorization") String auth, @QueryMap Map<String,Object> queries);

}
