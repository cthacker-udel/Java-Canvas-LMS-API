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

}
