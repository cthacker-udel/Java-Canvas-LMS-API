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

        if(this.clientId != null){
            queries.put("client_id",this.clientId);
        }
        if(this.name != null){
            queries.put("name",this.name);
        }
        if(this.privacyLevel != null){
            queries.put("privacy_level",this.privacyLevel);
        }
        if(this.consumerKey != null){
            queries.put("consumer_key",this.consumerKey);
        }
        if(this.sharedSecret != null){
            queries.put("shared_secret",this.sharedSecret);
        }
        if(this.description != null){
            queries.put("description",this.description);
        }
        if(this.domain != null){
            queries.put("domain",this.domain);
        }
        if(this.iconUrl != null){
            queries.put("icon_url",this.iconUrl);
        }
        if(this.text != null){
            queries.put("text",this.text);
        }
        if(this.customFieldsFieldName != null){
            queries.put("custom_fields[field_name]",this.customFieldsFieldName);
        }
        if(this.isRceFavorite != null){
            queries.put("is_rce_favorite",this.isRceFavorite);
        }
        if(this.accountNavigationUrl != null){
            queries.put("account_navigation[url]",this.accountNavigationUrl);
        }
        if(this.accountNavigationEnabled != null){
            queries.put("account_navigation[enabled]",this.accountNavigationEnabled);
        }
        if(this.accountNavigationText != null){
            queries.put("account_navigation[text]",this.accountNavigationText);
        }
        if(this.accountNavigationSelectionWidth != null){
            queries.put("account_navigation[selection_width]",this.accountNavigationSelectionWidth);
        }
        if(this.accountNavigationSelectionHeight != null){
            queries.put("account_navigation[selection_height]",this.accountNavigationSelectionHeight);
        }
        if(this.accountNavigationDisplayType != null){
            queries.put("account_navigation[display_type]",this.accountNavigationDisplayType);
        }
        if(this.userNavigationUrl != null){
            queries.put("user_navigation[url]",this.userNavigationUrl);
        }
        if(this.userNavigationEnabled != null){
            queries.put("user_navigation[enabled]",this.userNavigationEnabled);
        }
        if(this.userNavigationText != null){
            queries.put("user_navigation[text]",this.userNavigationText);
        }
        if(this.userNavigationVisibility != null){
            queries.put("user_navigation[visibility]",this.userNavigationVisibility);
        }
        if(this.courseHomeSubNavigationUrl != null){
            queries.put("course_home_sub_navigation[url]",this.courseHomeSubNavigationUrl);
        }
        if(this.courseHomeSubNavigationEnabled != null){
            queries.put("course_home_sub_navigation[enabled]",this.courseHomeSubNavigationEnabled);
        }
        if(this.courseHomeSubNavigationText != null){
            queries.put("course_home_sub_navigation[text]",this.courseHomeSubNavigationText);
        }
        if(this.courseHomeSubNavigationIconUrl != null){
            queries.put("course_home_sub_navigation[icon_url]",this.courseHomeSubNavigationIconUrl);
        }
        if(this.courseNavigationEnabled != null){
            queries.put("course_navigation[enabled]",this.courseNavigationEnabled);
        }
        if(this.courseNavigationText != null){
            queries.put("course_navigation[text]",this.courseNavigationText);
        }
        if(this.courseNavigationVisibility != null){
            queries.put("course_navigation[visibility]",this.courseNavigationVisibility);
        }
        if(this.courseNavigationWindowTarget != null){
            queries.put("course_navigation[windowTarget]",this.courseNavigationWindowTarget);
        }
        if(this.courseNavigationDefault != null){
            queries.put("course_navigation[default]",this.courseNavigationDefault);
        }
        if(this.courseNavigationDisplayType != null){
            queries.put("course_navigation[display_type]",this.courseNavigationDisplayType);
        }
        if(this.editorButtonUrl != null){
            queries.put("editor_button[url]",this.editorButtonUrl);
        }
        if(this.editorButtonEnabled != null){
            queries.put("editor_button[enabled]",this.editorButtonEnabled);
        }
        if(this.editorButtonIconUrl != null){
            queries.put("editor_button[icon_url]",this.editorButtonIconUrl);
        }
        if(this.editorButtonSelectionWidth != null){
            queries.put("editor_button[selection_width]",this.editorButtonSelectionWidth);
        }
        if(this.editorButtonSelectionHeight != null){
            queries.put("editor_button[selection_height]",this.editorButtonSelectionHeight);
        }
        if(this.editorButtonMessageType != null){
            queries.put("editor_button[message_type]",this.editorButtonMessageType);
        }
        if(this.homeworkSubmissionUrl != null){
            queries.put("homework_submission[url]",this.homeworkSubmissionUrl);
        }
        if(this.homeworkSubmissionEnabled != null){
            queries.put("homework_submission[enabled]",this.homeworkSubmissionEnabled);
        }
        if(this.homeworkSubmissionText != null){
            queries.put("homework_submission[text]",this.homeworkSubmissionText);
        }
        if(this.homeworkSubmissionMessageType != null){
            queries.put("homework_submission[message_type]",this.homeworkSubmissionMessageType);
        }
        if(this.linkSelectionUrl != null){
            queries.put("link_selection[url]",this.linkSelectionUrl);
        }
        if(this.linkSelectionEnabled != null){
            queries.put("link_selection[enabled]",this.linkSelectionEnabled);
        }
        if(this.linkSelectionText != null){
            queries.put("link_selection[text]",this.linkSelectionText);
        }
        if(this.linkSelectionMessageType != null){
            queries.put("link_selection[message_type]",this.linkSelectionMessageType);
        }
        if(this.migrationSelectionUrl != null){
            queries.put("migration_selection[url]",this.migrationSelectionUrl);
        }
        if(this.migrationSelectionEnabled != null){
            queries.put("migration_selection[enabled]",this.migrationSelectionEnabled);
        }
        if(this.migrationSelectionMessageType != null){
            queries.put("migration_selection[message_type]",this.migrationSelectionMessageType);
        }
        if(this.toolConfigurationUrl != null){
            queries.put("tool_configuration[url]",this.toolConfigurationUrl);
        }
        if(this.toolConfigurationEnabled != null){
            queries.put("tool_configuration[enabled]",this.toolConfigurationEnabled);
        }
        if(this.toolConfigurationMessageType != null){
            queries.put("tool_configuration[message_type]",this.toolConfigurationMessageType);
        }
        if(this.toolConfigurationPreferSisEmail != null){
            queries.put("tool_configuration[prefer_sis_email]",this.toolConfigurationPreferSisEmail);
        }
        if(this.resourceSelectionUrl != null){
            queries.put("resource_selection[url]",this.resourceSelectionUrl);
        }
        if(this.resourceSelectionEnabled != null){
            queries.put("resource_selection[enabled]",this.resourceSelectionEnabled);
        }
        if(this.resourceSelectionIconUrl != null){
            queries.put("resource_selection[icon_url]",this.resourceSelectionIconUrl);
        }
        if(this.resourceSelectionSelectionWidth != null){
            queries.put("resource_selection[selection_width]",this.resourceSelectionSelectionWidth);
        }
        if(this.resourceSelectionSelectionHeight != null){
            queries.put("resource_selection[selection_height]",this.resourceSelectionSelectionHeight);
        }
        if(this.configType != null){
            queries.put("config_type",this.configType);
        }
        if(this.configXml != null){
            queries.put("config_xml",this.configXml);
        }
        if(this.configUrl != null){
            queries.put("config_url",this.configUrl);
        }
        if(this.notSelectable != null){
            queries.put("not_selectable",this.notSelectable);
        }
        if(this.oAuthCompliant != null){
            queries.put("oauth_compliant",this.oAuthCompliant);
        }
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
          id= null;
          url= null;
          assignmentId= null;
          moduleItemId= null;
          launchType= null;

          clientId= null;
          name= null;
          privacyLevel= null;
          consumerKey= null;
          sharedSecret= null;
          description= null;
          domain= null;
          iconUrl= null;
          text= null;
          customFieldsFieldName= null;
          isRceFavorite= null;

          accountNavigationUrl = null;
          accountNavigationEnabled= null;
          accountNavigationText= null;
          accountNavigationSelectionWidth= null;
          accountNavigationSelectionHeight= null;
          accountNavigationDisplayType= null;

          userNavigationUrl= null;
          userNavigationEnabled= null;
          userNavigationText= null;
          userNavigationVisibility= null;

          courseHomeSubNavigationUrl= null;
          courseHomeSubNavigationEnabled= null;
          courseHomeSubNavigationText= null;
          courseHomeSubNavigationIconUrl= null;

          courseNavigationEnabled= null;
          courseNavigationText= null;
          courseNavigationVisibility= null;
          courseNavigationWindowTarget= null;
          courseNavigationDefault= null;
          courseNavigationDisplayType= null;

          editorButtonUrl= null;
          editorButtonEnabled= null;
          editorButtonIconUrl= null;
          editorButtonSelectionWidth= null;
          editorButtonSelectionHeight= null;
          editorButtonMessageType= null;

          homeworkSubmissionUrl= null;
          homeworkSubmissionEnabled= null;
          homeworkSubmissionText= null;
          homeworkSubmissionMessageType= null;

          linkSelectionUrl= null;
          linkSelectionEnabled= null;
          linkSelectionText= null;
          linkSelectionMessageType= null;

          migrationSelectionUrl= null;
          migrationSelectionEnabled= null;
          migrationSelectionMessageType= null;

          toolConfigurationUrl= null;
          toolConfigurationEnabled= null;
          toolConfigurationMessageType= null;
          toolConfigurationPreferSisEmail= null;

          resourceSelectionUrl= null;
          resourceSelectionEnabled= null;
          resourceSelectionIconUrl= null;
          resourceSelectionSelectionWidth= null;
          resourceSelectionSelectionHeight= null;

          configType= null;
          configXml= null;
          configUrl= null;

          notSelectable= null;
          oAuthCompliant= null;



    }

    @Override
    public String getClientId() {
        return clientId;
    }

    @Override
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrivacyLevel() {
        return privacyLevel;
    }

    public void setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getSharedSecret() {
        return sharedSecret;
    }

    public void setSharedSecret(String sharedSecret) {
        this.sharedSecret = sharedSecret;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCustomFieldsFieldName() {
        return customFieldsFieldName;
    }

    public void setCustomFieldsFieldName(String customFieldsFieldName) {
        this.customFieldsFieldName = customFieldsFieldName;
    }

    public Boolean getRceFavorite() {
        return isRceFavorite;
    }

    public void setRceFavorite(Boolean rceFavorite) {
        isRceFavorite = rceFavorite;
    }

    public String getAccountNavigationUrl() {
        return accountNavigationUrl;
    }

    public void setAccountNavigationUrl(String accountNavigationUrl) {
        this.accountNavigationUrl = accountNavigationUrl;
    }

    public Boolean getAccountNavigationEnabled() {
        return accountNavigationEnabled;
    }

    public void setAccountNavigationEnabled(Boolean accountNavigationEnabled) {
        this.accountNavigationEnabled = accountNavigationEnabled;
    }

    public String getAccountNavigationText() {
        return accountNavigationText;
    }

    public void setAccountNavigationText(String accountNavigationText) {
        this.accountNavigationText = accountNavigationText;
    }

    public String getAccountNavigationSelectionWidth() {
        return accountNavigationSelectionWidth;
    }

    public void setAccountNavigationSelectionWidth(String accountNavigationSelectionWidth) {
        this.accountNavigationSelectionWidth = accountNavigationSelectionWidth;
    }

    public String getAccountNavigationSelectionHeight() {
        return accountNavigationSelectionHeight;
    }

    public void setAccountNavigationSelectionHeight(String accountNavigationSelectionHeight) {
        this.accountNavigationSelectionHeight = accountNavigationSelectionHeight;
    }

    public String getAccountNavigationDisplayType() {
        return accountNavigationDisplayType;
    }

    public void setAccountNavigationDisplayType(String accountNavigationDisplayType) {
        this.accountNavigationDisplayType = accountNavigationDisplayType;
    }

    public String getUserNavigationUrl() {
        return userNavigationUrl;
    }

    public void setUserNavigationUrl(String userNavigationUrl) {
        this.userNavigationUrl = userNavigationUrl;
    }

    public Boolean getUserNavigationEnabled() {
        return userNavigationEnabled;
    }

    public void setUserNavigationEnabled(Boolean userNavigationEnabled) {
        this.userNavigationEnabled = userNavigationEnabled;
    }

    public String getUserNavigationText() {
        return userNavigationText;
    }

    public void setUserNavigationText(String userNavigationText) {
        this.userNavigationText = userNavigationText;
    }

    public String getUserNavigationVisibility() {
        return userNavigationVisibility;
    }

    public void setUserNavigationVisibility(String userNavigationVisibility) {
        this.userNavigationVisibility = userNavigationVisibility;
    }

    public String getCourseHomeSubNavigationUrl() {
        return courseHomeSubNavigationUrl;
    }

    public void setCourseHomeSubNavigationUrl(String courseHomeSubNavigationUrl) {
        this.courseHomeSubNavigationUrl = courseHomeSubNavigationUrl;
    }

    public String getCourseHomeSubNavigationEnabled() {
        return courseHomeSubNavigationEnabled;
    }

    public void setCourseHomeSubNavigationEnabled(String courseHomeSubNavigationEnabled) {
        this.courseHomeSubNavigationEnabled = courseHomeSubNavigationEnabled;
    }

    public String getCourseHomeSubNavigationText() {
        return courseHomeSubNavigationText;
    }

    public void setCourseHomeSubNavigationText(String courseHomeSubNavigationText) {
        this.courseHomeSubNavigationText = courseHomeSubNavigationText;
    }

    public String getCourseHomeSubNavigationIconUrl() {
        return courseHomeSubNavigationIconUrl;
    }

    public void setCourseHomeSubNavigationIconUrl(String courseHomeSubNavigationIconUrl) {
        this.courseHomeSubNavigationIconUrl = courseHomeSubNavigationIconUrl;
    }

    public Boolean getCourseNavigationEnabled() {
        return courseNavigationEnabled;
    }

    public void setCourseNavigationEnabled(Boolean courseNavigationEnabled) {
        this.courseNavigationEnabled = courseNavigationEnabled;
    }

    public String getCourseNavigationText() {
        return courseNavigationText;
    }

    public void setCourseNavigationText(String courseNavigationText) {
        this.courseNavigationText = courseNavigationText;
    }

    public String getCourseNavigationVisibility() {
        return courseNavigationVisibility;
    }

    public void setCourseNavigationVisibility(String courseNavigationVisibility) {
        this.courseNavigationVisibility = courseNavigationVisibility;
    }

    public String getCourseNavigationWindowTarget() {
        return courseNavigationWindowTarget;
    }

    public void setCourseNavigationWindowTarget(String courseNavigationWindowTarget) {
        this.courseNavigationWindowTarget = courseNavigationWindowTarget;
    }

    public String getCourseNavigationDefault() {
        return courseNavigationDefault;
    }

    public void setCourseNavigationDefault(String courseNavigationDefault) {
        this.courseNavigationDefault = courseNavigationDefault;
    }

    public String getCourseNavigationDisplayType() {
        return courseNavigationDisplayType;
    }

    public void setCourseNavigationDisplayType(String courseNavigationDisplayType) {
        this.courseNavigationDisplayType = courseNavigationDisplayType;
    }

    public String getEditorButtonUrl() {
        return editorButtonUrl;
    }

    public void setEditorButtonUrl(String editorButtonUrl) {
        this.editorButtonUrl = editorButtonUrl;
    }

    public Boolean getEditorButtonEnabled() {
        return editorButtonEnabled;
    }

    public void setEditorButtonEnabled(Boolean editorButtonEnabled) {
        this.editorButtonEnabled = editorButtonEnabled;
    }

    public String getEditorButtonIconUrl() {
        return editorButtonIconUrl;
    }

    public void setEditorButtonIconUrl(String editorButtonIconUrl) {
        this.editorButtonIconUrl = editorButtonIconUrl;
    }

    public String getEditorButtonSelectionWidth() {
        return editorButtonSelectionWidth;
    }

    public void setEditorButtonSelectionWidth(String editorButtonSelectionWidth) {
        this.editorButtonSelectionWidth = editorButtonSelectionWidth;
    }

    public String getEditorButtonSelectionHeight() {
        return editorButtonSelectionHeight;
    }

    public void setEditorButtonSelectionHeight(String editorButtonSelectionHeight) {
        this.editorButtonSelectionHeight = editorButtonSelectionHeight;
    }

    public String getEditorButtonMessageType() {
        return editorButtonMessageType;
    }

    public void setEditorButtonMessageType(String editorButtonMessageType) {
        this.editorButtonMessageType = editorButtonMessageType;
    }

    public String getHomeworkSubmissionUrl() {
        return homeworkSubmissionUrl;
    }

    public void setHomeworkSubmissionUrl(String homeworkSubmissionUrl) {
        this.homeworkSubmissionUrl = homeworkSubmissionUrl;
    }

    public Boolean getHomeworkSubmissionEnabled() {
        return homeworkSubmissionEnabled;
    }

    public void setHomeworkSubmissionEnabled(Boolean homeworkSubmissionEnabled) {
        this.homeworkSubmissionEnabled = homeworkSubmissionEnabled;
    }

    public String getHomeworkSubmissionText() {
        return homeworkSubmissionText;
    }

    public void setHomeworkSubmissionText(String homeworkSubmissionText) {
        this.homeworkSubmissionText = homeworkSubmissionText;
    }

    public String getHomeworkSubmissionMessageType() {
        return homeworkSubmissionMessageType;
    }

    public void setHomeworkSubmissionMessageType(String homeworkSubmissionMessageType) {
        this.homeworkSubmissionMessageType = homeworkSubmissionMessageType;
    }

    public String getLinkSelectionUrl() {
        return linkSelectionUrl;
    }

    public void setLinkSelectionUrl(String linkSelectionUrl) {
        this.linkSelectionUrl = linkSelectionUrl;
    }

    public Boolean getLinkSelectionEnabled() {
        return linkSelectionEnabled;
    }

    public void setLinkSelectionEnabled(Boolean linkSelectionEnabled) {
        this.linkSelectionEnabled = linkSelectionEnabled;
    }

    public String getLinkSelectionText() {
        return linkSelectionText;
    }

    public void setLinkSelectionText(String linkSelectionText) {
        this.linkSelectionText = linkSelectionText;
    }

    public String getLinkSelectionMessageType() {
        return linkSelectionMessageType;
    }

    public void setLinkSelectionMessageType(String linkSelectionMessageType) {
        this.linkSelectionMessageType = linkSelectionMessageType;
    }

    public String getMigrationSelectionUrl() {
        return migrationSelectionUrl;
    }

    public void setMigrationSelectionUrl(String migrationSelectionUrl) {
        this.migrationSelectionUrl = migrationSelectionUrl;
    }

    public Boolean getMigrationSelectionEnabled() {
        return migrationSelectionEnabled;
    }

    public void setMigrationSelectionEnabled(Boolean migrationSelectionEnabled) {
        this.migrationSelectionEnabled = migrationSelectionEnabled;
    }

    public String getMigrationSelectionMessageType() {
        return migrationSelectionMessageType;
    }

    public void setMigrationSelectionMessageType(String migrationSelectionMessageType) {
        this.migrationSelectionMessageType = migrationSelectionMessageType;
    }

    public String getToolConfigurationUrl() {
        return toolConfigurationUrl;
    }

    public void setToolConfigurationUrl(String toolConfigurationUrl) {
        this.toolConfigurationUrl = toolConfigurationUrl;
    }

    public Boolean getToolConfigurationEnabled() {
        return toolConfigurationEnabled;
    }

    public void setToolConfigurationEnabled(Boolean toolConfigurationEnabled) {
        this.toolConfigurationEnabled = toolConfigurationEnabled;
    }

    public String getToolConfigurationMessageType() {
        return toolConfigurationMessageType;
    }

    public void setToolConfigurationMessageType(String toolConfigurationMessageType) {
        this.toolConfigurationMessageType = toolConfigurationMessageType;
    }

    public Boolean getToolConfigurationPreferSisEmail() {
        return toolConfigurationPreferSisEmail;
    }

    public void setToolConfigurationPreferSisEmail(Boolean toolConfigurationPreferSisEmail) {
        this.toolConfigurationPreferSisEmail = toolConfigurationPreferSisEmail;
    }

    public String getResourceSelectionUrl() {
        return resourceSelectionUrl;
    }

    public void setResourceSelectionUrl(String resourceSelectionUrl) {
        this.resourceSelectionUrl = resourceSelectionUrl;
    }

    public Boolean getResourceSelectionEnabled() {
        return resourceSelectionEnabled;
    }

    public void setResourceSelectionEnabled(Boolean resourceSelectionEnabled) {
        this.resourceSelectionEnabled = resourceSelectionEnabled;
    }

    public String getResourceSelectionIconUrl() {
        return resourceSelectionIconUrl;
    }

    public void setResourceSelectionIconUrl(String resourceSelectionIconUrl) {
        this.resourceSelectionIconUrl = resourceSelectionIconUrl;
    }

    public String getResourceSelectionSelectionWidth() {
        return resourceSelectionSelectionWidth;
    }

    public void setResourceSelectionSelectionWidth(String resourceSelectionSelectionWidth) {
        this.resourceSelectionSelectionWidth = resourceSelectionSelectionWidth;
    }

    public String getResourceSelectionSelectionHeight() {
        return resourceSelectionSelectionHeight;
    }

    public void setResourceSelectionSelectionHeight(String resourceSelectionSelectionHeight) {
        this.resourceSelectionSelectionHeight = resourceSelectionSelectionHeight;
    }

    public String getConfigType() {
        return configType;
    }

    public void setConfigType(String configType) {
        this.configType = configType;
    }

    public String getConfigXml() {
        return configXml;
    }

    public void setConfigXml(String configXml) {
        this.configXml = configXml;
    }

    public String getConfigUrl() {
        return configUrl;
    }

    public void setConfigUrl(String configUrl) {
        this.configUrl = configUrl;
    }

    public Boolean getNotSelectable() {
        return notSelectable;
    }

    public void setNotSelectable(Boolean notSelectable) {
        this.notSelectable = notSelectable;
    }

    public Boolean getoAuthCompliant() {
        return oAuthCompliant;
    }

    public void setoAuthCompliant(Boolean oAuthCompliant) {
        this.oAuthCompliant = oAuthCompliant;
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
