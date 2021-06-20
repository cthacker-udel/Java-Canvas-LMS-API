package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class AppointmentGroups extends CanvasClient {

    private String scope;
    private ArrayList<String> contextCodes = new ArrayList<>();
    private Boolean includePastAppointments;
    private ArrayList<String> include;
    private ArrayList<String> contextCodesCreateAppointmentGroup = new ArrayList<>();
    private ArrayList<String> subContextCodes = new ArrayList<>();
    private String title;
    private String description;
    private String locationName;
    private String locationAddress;
    private Boolean publish;
    private Integer participantsPerAppointment;
    private Integer minAppointmentsPerParticipant;
    private Integer maxAppointmentsPerParticipant;
    private String newAppointments;
    private String participantVisibility;


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.contextCodesCreateAppointmentGroup.size() > 0){
            queries.put("appointment_group[sub_context_codes][]",this.contextCodesCreateAppointmentGroup.toArray(String[]::new));
        }
        if(this.subContextCodes.size() > 0){
            queries.put("appointment_group[sub_context_codes][]",this.subContextCodes);
        }
        if(this.title != null){
            queries.put("appointment_group[title]",this.title);
        }
        if(this.description != null){
            queries.put("appointment_group[description]",this.description);
        }
        if(this.locationName != null){
            queries.put("appointment_group[location_name]",this.locationName);
        }
        if(this.locationAddress != null){
            queries.put("appointment_group[location_address]",this.locationAddress);
        }
        if(this.publish != null){
            queries.put("appointment_group[publish]",this.publish);
        }
        if(this.participantsPerAppointment != null){
            queries.put("appointment_group[participants_per_appointment]",this.participantsPerAppointment);
        }
        if(this.minAppointmentsPerParticipant != null){
            queries.put("appointment_group[min_appointments_per_participant]",this.minAppointmentsPerParticipant);
        }
        if(this.maxAppointmentsPerParticipant != null){
            queries.put("appointment_group[max_appointments_per_participant]",this.maxAppointmentsPerParticipant);
        }
        if(this.newAppointments != null){
            queries.put("appointment_group[new_appointments][X][]",this.newAppointments);
        }
        if(this.participantVisibility != null) {
            queries.put("appointment_group[participant_visibility]", this.participantVisibility);
        }
        if(this.scope != null){
            queries.put("scope",this.scope);
        }
        if(this.contextCodes.size() > 0){
            queries.put("context_codes[]",this.contextCodes.toArray(String[]::new));
        }
        if(this.includePastAppointments != null){
            queries.put("include_past_appointments",this.includePastAppointments);
        }
        if(this.include.size() > 0){
            queries.put("include[]",this.include.toArray(String[]::new));
        }
        return queries;

    }

    public void clearQueries(){

        this.scope = null;
        this.contextCodes.clear();
        this.includePastAppointments = null;
        this.include.clear();
        ArrayList<String> contextCodesCreateAppointmentGroup = new ArrayList<>();
        ArrayList<String> subContextCodes = new ArrayList<>();
        String title= null;
        String description= null;
        String locationName= null;
        String locationAddress= null;
        Boolean publish= null;
        Integer participantsPerAppointment= null;
        Integer minAppointmentsPerParticipant= null;
        Integer maxAppointmentsPerParticipant= null;
        String newAppointments= null;
        String participantVisibility= null;

    }

}
