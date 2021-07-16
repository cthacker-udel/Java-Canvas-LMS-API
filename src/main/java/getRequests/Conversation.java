package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Conversation extends CanvasClient {

    private String scope;
    private String filter;
    private String filterMode;
    private Boolean interleaveSubmissions;
    private Boolean includeAllConversationIds;
    private String include;

    private ArrayList<String> recipients = new ArrayList<>();
    private String subject;
    private String body;
    private Boolean forceNew;
    private Boolean groupConversation;
    private ArrayList<String> attachmentIds = new ArrayList<>();
    private String mediaCommentId;
    private String mediaCommentType;
    private Boolean userNote;
    private String mode;
    private String contextCode;


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.recipients.size() > 0){
            queries.put("recipients[]",String.join(",",this.recipients));
        }
        if(this.subject != null){
            queries.put("subject",this.subject);
        }
        if(this.body != null){
            queries.put("body",this.body);
        }
        if(this.forceNew != null){
            queries.put("force_new",this.forceNew);
        }
        if(this.groupConversation != null){
            queries.put("group_conversation",this.groupConversation);
        }
        if(this.attachmentIds.size() > 0){
            queries.put("attachment_ids[]",String.join(",",this.attachmentIds));
        }
        if(this.mediaCommentId != null){
            queries.put("media_comment_id",this.mediaCommentId);
        }
        if(this.mediaCommentType != null){
            queries.put("media_comment_type",this.mediaCommentType);
        }
        if(this.userNote != null){
            queries.put("user_note",this.userNote);
        }
        if(this.mode != null){
            queries.put("mode",this.mode);
        }
        if(this.contextCode != null){
            queries.put("context_code",this.contextCode);
        }
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
        this.recipients = new ArrayList<>();
        this.subject = null;
        this.body = null;
        this.forceNew = null;
        this.groupConversation = null;
        this.attachmentIds = new ArrayList<>();
        this.mediaCommentId = null;
        this.mediaCommentType = null;
        this.userNote = null;
        this.mode = null;
        this.contextCode = null;

    }


}
