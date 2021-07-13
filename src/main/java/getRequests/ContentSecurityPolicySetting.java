package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContentSecurityPolicySetting extends CanvasClient {

    private String status;
    private Boolean settingsLocked;
    private String domain;
    private ArrayList<String> domains = new ArrayList<>();

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.status != null){
            queries.put("status",this.status);
        }
        if(this.settingsLocked != null){
            queries.put("settings_locked",this.settingsLocked);
        }
        if(this.domain != null){
            queries.put("domain",this.domain);
        }
        if(this.domains.size() > 0){
            queries.put("domains",this.domains.toArray(String[]::new));
        }
        return queries;
    }

    public void clearQueries(){

        this.status = null;
        this.settingsLocked = null;
        this.domain = null;
        this.domains = new ArrayList<>();

    }

}
