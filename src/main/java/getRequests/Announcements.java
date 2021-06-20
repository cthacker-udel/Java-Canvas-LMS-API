package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Announcements extends CanvasClient {

    private ArrayList<String> contextCodes = new ArrayList<>();
    private ZonedDateTime startDate;
    private ZonedDateTime endDate;
    private Boolean activeOnly;
    private Boolean latestOnly;
    private ArrayList<String> include;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<String,Object>();
        if(this.contextCodes.size() > 0){
            queries.put("context_codes[]",this.contextCodes);
        }
        if(this.startDate != null){
            queries.put("start_date",this.startDate);
        }
        if(this.endDate != null){
            queries.put("end_date",this.endDate);
        }
        if(this.activeOnly != null){
            queries.put("active_only",this.activeOnly);
        }
        if(this.latestOnly != null){
            queries.put("latest_only",this.latestOnly);
        }
        if(this.include != null){
            queries.put("include",this.include);
        }
        return queries;

    }

    public void clearQueries(){
        this.contextCodes.clear();
        this.startDate = null;
        this.endDate = null;
        this.activeOnly = null;
        this.latestOnly = null;
        this.include = null;
    }

    public ArrayList<String> getContextCodes() {
        return contextCodes;
    }

    public void setContextCodes(ArrayList<String> contextCodes) {
        this.contextCodes = contextCodes;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(ZonedDateTime startDate) {
        this.startDate = startDate;
    }

    public ZonedDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(ZonedDateTime endDate) {
        this.endDate = endDate;
    }

    public Boolean getActiveOnly() {
        return activeOnly;
    }

    public void setActiveOnly(Boolean activeOnly) {
        this.activeOnly = activeOnly;
    }

    public Boolean getLatestOnly() {
        return latestOnly;
    }

    public void setLatestOnly(Boolean latestOnly) {
        this.latestOnly = latestOnly;
    }

    public ArrayList<String> getInclude() {
        return include;
    }

    public void setInclude(ArrayList<String> include) {
        this.include = include;
    }
}
