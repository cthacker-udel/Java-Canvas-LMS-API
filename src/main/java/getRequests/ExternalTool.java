package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExternalTool extends CanvasClient {

    private String courseId;
    private String exToolAccountId;
    private String groupId;
    private String externalToolId;

    private String searchTerm;
    private Boolean selectable;
    private Boolean include_parents;

    private String id;
    private String url;
    private String assignmentId;
    private String moduleItemId;
    private String launchType;

    private String clientId;
    private String name;
    private String privacyLevel;
    private String consumerKey;
    private String sharedSecret;
    private String description;
    private String domain;
    private String iconUrl;
    private String text;
    private String customFieldsFieldName;
    private Boolean isRceFavorite;

    private String accountNavigationUrl;
    private Boolean accountNavigationEnabled;
    private String accountNavigationText;
    private String accountNavigationSelectionWidth;
    private String accountNavigationSelectionHeight;
    private String accountNavigationDisplayType;

    private String userNavigationUrl;
    private Boolean userNavigationEnabled;
    private String userNavigationText;
    private String userNavigationVisibility;

    private String courseHomeSubNavigationUrl;
    private String courseHomeSubNavigationEnabled;
    private String courseHomeSubNavigationText;
    private String courseHomeSubNavigationIconUrl;

    private Boolean courseNavigationEnabled;
    private String courseNavigationText;
    private String courseNavigationVisibility;
    private String courseNavigationWindowTarget;
    private String courseNavigationDefault;
    private String courseNavigationDisplayType;

    private String editorButtonUrl;
    private Boolean editorButtonEnabled;
    private String editorButtonIconUrl;
    private String editorButtonSelectionWidth;
    private String editorButtonSelectionHeight;
    private String editorButtonMessageType;

    private String homeworkSubmissionUrl;
    private Boolean homeworkSubmissionEnabled;
    private String homeworkSubmissionText;
    private String homeworkSubmissionMessageType;

    private String linkSelectionUrl;
    private Boolean linkSelectionEnabled;
    private String linkSelectionText;
    private String linkSelectionMessageType;

    private String migrationSelectionUrl;
    private Boolean migrationSelectionEnabled;
    private String migrationSelectionMessageType;

    private String toolConfigurationUrl;
    private Boolean toolConfigurationEnabled;
    private String toolConfigurationMessageType;
    private Boolean toolConfigurationPreferSisEmail;

    private String resourceSelectionUrl;
    private Boolean resourceSelectionEnabled;
    private String resourceSelectionIconUrl;
    private String resourceSelectionSelectionWidth;
    private String resourceSelectionSelectionHeight;

    private String configType;
    private String configXml;
    private String configUrl;

    private Boolean notSelectable;
    private Boolean oAuthCompliant;


    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.id != null){
            queries.put("id",this.id);
        }
        if(this.url != null){
            queries.put("url",this.url);
        }
        if(this.assignmentId != null){
            queries.put("assignment_id",this.assignmentId);
        }
        if(this.moduleItemId != null){
            queries.put("module_item_id",this.moduleItemId);
        }
        if(this.launchType != null){
            queries.put("launch_type",this.launchType);
        }
        if(this.searchTerm != null){
            queries.put("search_term",this.searchTerm);
        }
        if(this.selectable != null){
            queries.put("selectable",this.selectable);
        }
        if(this.include_parents != null){
            queries.put("include_parents",this.include_parents);
        }
        return queries;

    }

    public void clearQueries(){

        this.searchTerm = null;
        this.selectable = null;
        this.include_parents = null;

    }

    public String getExternalToolId() {
        return externalToolId;
    }

    public void setExternalToolId(String externalToolId) {
        this.externalToolId = externalToolId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getModuleItemId() {
        return moduleItemId;
    }

    public void setModuleItemId(String moduleItemId) {
        this.moduleItemId = moduleItemId;
    }

    public String getLaunchType() {
        return launchType;
    }

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getExToolAccountId() {
        return exToolAccountId;
    }

    public void setExToolAccountId(String exToolAccountId) {
        this.exToolAccountId = exToolAccountId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public Boolean getInclude_parents() {
        return include_parents;
    }

    public void setInclude_parents(Boolean include_parents) {
        this.include_parents = include_parents;
    }
}
