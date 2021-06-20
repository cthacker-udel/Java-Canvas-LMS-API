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

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

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

    }

}
