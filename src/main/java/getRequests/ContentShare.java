package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContentShare extends CanvasClient {

    private ArrayList<String> receiverIds = new ArrayList<>();
    private String contentType;
    private Integer contentId;
    private Integer userId;


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.receiverIds.size() > 0){
            queries.put("receiver_ids",this.receiverIds.toArray(String[]::new));
        }
        if(this.contentType != null){
            queries.put("content_type",this.contentType);
        }
        if(this.contentId != null){
            queries.put("content_id",this.contentId);
        }
        return queries;

    }

    public void clearQueries(){

        this.receiverIds = new ArrayList<>();
        this.contentType = null;
        this.contentId = null;

    }

    public ArrayList<String> getReceiverIds() {
        return receiverIds;
    }

    public void setReceiverIds(ArrayList<String> receiverIds) {
        this.receiverIds = receiverIds;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
