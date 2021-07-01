package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class AuthenticationLog extends CanvasClient {

    private ZonedDateTime startTime;
    private ZonedDateTime endTime;
    private String loginId;
    private String logAccountId;
    private String userId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.startTime != null){
            queries.put("start_time",this.startTime);
        }
        if(this.endTime != null) {
            queries.put("end_time", this.endTime);
        }

        return queries;
    }

    public void clearQueries(){

        this.startTime = null;
        this.endTime = null;

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

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLogAccountId() {
        return logAccountId;
    }

    public void setLogAccountId(String logAccountId) {
        this.logAccountId = logAccountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
