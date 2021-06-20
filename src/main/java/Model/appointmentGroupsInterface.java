package Model;

import Controller.AppointmentGroupsController.AppointmentGroup.AppointmentGroup;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface appointmentGroupsInterface {

    @GET("https://udel.instructure.com/api/v1/appointment_groups")
    Call<List<AppointmentGroup>> getAppointmentGroupList(@QueryMap Map<String,Object> queries, @Header("Authorization") String token);

}
