package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommunicationChannels extends CanvasClient {

    private String address;
    private String type;
    private String token;
    private Boolean skipConfirmation;
    private String userId;
    private String communicationChannelId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();
        if(this.address != null){
            queries.put("communication_channel[address]",this.address);
        }
        if(this.type != null){
            queries.put("communication_channel[type]",this.type);
        }
        if(this.token != null){
            queries.put("communication_channel[token]",this.token);
        }
        if(this.skipConfirmation != null){
            queries.put("skip_confirmation",this.skipConfirmation);
        }
        return queries;

    }

    public void clearQueries(){

        this.address = null;
        this.type = null;
        this.token = null;
        this.skipConfirmation = null;

    }

    public String getCommunicationChannelId() {
        return communicationChannelId;
    }

    public void setCommunicationChannelId(String communicationChannelId) {
        this.communicationChannelId = communicationChannelId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getToken() {
        return token;
    }

    @Override
    public void setToken(String token) {
        this.token = token;
    }

    public Boolean getSkipConfirmation() {
        return skipConfirmation;
    }

    public void setSkipConfirmation(Boolean skipConfirmation) {
        this.skipConfirmation = skipConfirmation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
