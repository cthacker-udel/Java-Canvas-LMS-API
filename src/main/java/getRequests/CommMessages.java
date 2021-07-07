package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class CommMessages extends CanvasClient {

    private String userId;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.userId != null){
            queries.put("user_id",this.userId);
        }
        if(this.startTime != null){
            queries.put("start_time",this.startTime);
        }
        if(this.endTime != null){
            queries.put("end_time",this.endTime);
        }
        return queries;

    }

    public void clearQueries(){

        this.userId = null;
        this.startTime = null;
        this.endTime = null;

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ZonedDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(ZonedDateTime startTime) {
        this.startTime = startTime;
    }

    public ZonedDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(ZonedDateTime endTime) {
        this.endTime = endTime;
    }
}
