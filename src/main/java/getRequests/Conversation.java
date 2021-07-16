package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class Conversation extends CanvasClient {

    private String scope;
    private String filter;
    private String filterMode;
    private Boolean interleaveSubmissions;
    private Boolean includeAllConversationIds;
    private String include;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.scope != null){
            queries.put("scope",this.scope);
        }
        if(this.filter != null){
            queries.put("filter[]",this.filter);
        }
        if(this.filterMode != null){
            queries.put("filter_mode",this.filterMode);
        }
        if(this.interleaveSubmissions != null){
            queries.put("interleave_submissions",this.interleaveSubmissions);
        }
        if(this.includeAllConversationIds != null){
            queries.put("include_all_conversation_ids",this.includeAllConversationIds);
        }
        if(this.include != null){
            queries.put("include[]",this.include);
        }
        return queries;
    }

    public void clearQueries(){

        this.scope = null;
        this.filter = null;
        this.filterMode = null;
        this.interleaveSubmissions = null;
        this.includeAllConversationIds = null;
        this.include = null;

    }


}
