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
    private String courseId;
    private String accountId;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getSettingsLocked() {
        return settingsLocked;
    }

    public void setSettingsLocked(Boolean settingsLocked) {
        this.settingsLocked = settingsLocked;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ArrayList<String> getDomains() {
        return domains;
    }

    public void setDomains(ArrayList<String> domains) {
        this.domains = domains;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
