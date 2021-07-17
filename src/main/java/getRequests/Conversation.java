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
    private String conversationId;

    private String conversationWorkflowState;
    private Boolean conversationSubscribed;
    private Boolean conversationStarred;


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.conversationWorkflowState != null){
            queries.put("conversation[workflow_state]",this.conversationWorkflowState);
        }
        if(this.conversationSubscribed != null){
            queries.put("conversation[subscribed]",this.conversationSubscribed);
        }
        if(this.conversationStarred != null){
            queries.put("conversation[starred]",this.conversationStarred);
        }
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

        this.conversationStarred = null;
        this.conversationSubscribed = null;
        this.conversationWorkflowState = null;
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

    public String getConversationWorkflowState() {
        return conversationWorkflowState;
    }

    public void setConversationWorkflowState(String conversationWorkflowState) {
        this.conversationWorkflowState = conversationWorkflowState;
    }

    public Boolean getConversationSubscribed() {
        return conversationSubscribed;
    }

    public void setConversationSubscribed(Boolean conversationSubscribed) {
        this.conversationSubscribed = conversationSubscribed;
    }

    public Boolean getConversationStarred() {
        return conversationStarred;
    }

    public void setConversationStarred(Boolean conversationStarred) {
        this.conversationStarred = conversationStarred;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getFilterMode() {
        return filterMode;
    }

    public void setFilterMode(String filterMode) {
        this.filterMode = filterMode;
    }

    public Boolean getInterleaveSubmissions() {
        return interleaveSubmissions;
    }

    public void setInterleaveSubmissions(Boolean interleaveSubmissions) {
        this.interleaveSubmissions = interleaveSubmissions;
    }

    public Boolean getIncludeAllConversationIds() {
        return includeAllConversationIds;
    }

    public void setIncludeAllConversationIds(Boolean includeAllConversationIds) {
        this.includeAllConversationIds = includeAllConversationIds;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public ArrayList<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(ArrayList<String> recipients) {
        this.recipients = recipients;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Boolean getForceNew() {
        return forceNew;
    }

    public void setForceNew(Boolean forceNew) {
        this.forceNew = forceNew;
    }

    public Boolean getGroupConversation() {
        return groupConversation;
    }

    public void setGroupConversation(Boolean groupConversation) {
        this.groupConversation = groupConversation;
    }

    public ArrayList<String> getAttachmentIds() {
        return attachmentIds;
    }

    public void setAttachmentIds(ArrayList<String> attachmentIds) {
        this.attachmentIds = attachmentIds;
    }

    public String getMediaCommentId() {
        return mediaCommentId;
    }

    public void setMediaCommentId(String mediaCommentId) {
        this.mediaCommentId = mediaCommentId;
    }

    public String getMediaCommentType() {
        return mediaCommentType;
    }

    public void setMediaCommentType(String mediaCommentType) {
        this.mediaCommentType = mediaCommentType;
    }

    public Boolean getUserNote() {
        return userNote;
    }

    public void setUserNote(Boolean userNote) {
        this.userNote = userNote;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getContextCode() {
        return contextCode;
    }

    public void setContextCode(String contextCode) {
        this.contextCode = contextCode;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }
}
