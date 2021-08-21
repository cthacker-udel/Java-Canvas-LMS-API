package Controller.ExternalToolsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExternalTool {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("consumer_key")
    @Expose
    private String consumerKey;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("privacy_level")
    @Expose
    private String privacyLevel;
    @SerializedName("custom_fields")
    @Expose
    private CustomFields customFields;
    @SerializedName("is_rce_favorite")
    @Expose
    private Boolean isRceFavorite;
    @SerializedName("account_navigation")
    @Expose
    private AccountNavigation accountNavigation;
    @SerializedName("assignment_selection")
    @Expose
    private Object assignmentSelection;
    @SerializedName("course_home_sub_navigation")
    @Expose
    private Object courseHomeSubNavigation;
    @SerializedName("course_navigation")
    @Expose
    private CourseNavigation courseNavigation;
    @SerializedName("editor_button")
    @Expose
    private EditorButton editorButton;
    @SerializedName("homework_submission")
    @Expose
    private Object homeworkSubmission;
    @SerializedName("link_selection")
    @Expose
    private Object linkSelection;
    @SerializedName("migration_selection")
    @Expose
    private Object migrationSelection;
    @SerializedName("resource_selection")
    @Expose
    private Object resourceSelection;
    @SerializedName("tool_configuration")
    @Expose
    private Object toolConfiguration;
    @SerializedName("user_navigation")
    @Expose
    private Object userNavigation;
    @SerializedName("selection_width")
    @Expose
    private Integer selectionWidth;
    @SerializedName("selection_height")
    @Expose
    private Integer selectionHeight;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("not_selectable")
    @Expose
    private Boolean notSelectable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getPrivacyLevel() {
        return privacyLevel;
    }

    public void setPrivacyLevel(String privacyLevel) {
        this.privacyLevel = privacyLevel;
    }

    public CustomFields getCustomFields() {
        return customFields;
    }

    public void setCustomFields(CustomFields customFields) {
        this.customFields = customFields;
    }

    public Boolean getIsRceFavorite() {
        return isRceFavorite;
    }

    public void setIsRceFavorite(Boolean isRceFavorite) {
        this.isRceFavorite = isRceFavorite;
    }

    public AccountNavigation getAccountNavigation() {
        return accountNavigation;
    }

    public void setAccountNavigation(AccountNavigation accountNavigation) {
        this.accountNavigation = accountNavigation;
    }

    public Object getAssignmentSelection() {
        return assignmentSelection;
    }

    public void setAssignmentSelection(Object assignmentSelection) {
        this.assignmentSelection = assignmentSelection;
    }

    public Object getCourseHomeSubNavigation() {
        return courseHomeSubNavigation;
    }

    public void setCourseHomeSubNavigation(Object courseHomeSubNavigation) {
        this.courseHomeSubNavigation = courseHomeSubNavigation;
    }

    public CourseNavigation getCourseNavigation() {
        return courseNavigation;
    }

    public void setCourseNavigation(CourseNavigation courseNavigation) {
        this.courseNavigation = courseNavigation;
    }

    public EditorButton getEditorButton() {
        return editorButton;
    }

    public void setEditorButton(EditorButton editorButton) {
        this.editorButton = editorButton;
    }

    public Object getHomeworkSubmission() {
        return homeworkSubmission;
    }

    public void setHomeworkSubmission(Object homeworkSubmission) {
        this.homeworkSubmission = homeworkSubmission;
    }

    public Object getLinkSelection() {
        return linkSelection;
    }

    public void setLinkSelection(Object linkSelection) {
        this.linkSelection = linkSelection;
    }

    public Object getMigrationSelection() {
        return migrationSelection;
    }

    public void setMigrationSelection(Object migrationSelection) {
        this.migrationSelection = migrationSelection;
    }

    public Object getResourceSelection() {
        return resourceSelection;
    }

    public void setResourceSelection(Object resourceSelection) {
        this.resourceSelection = resourceSelection;
    }

    public Object getToolConfiguration() {
        return toolConfiguration;
    }

    public void setToolConfiguration(Object toolConfiguration) {
        this.toolConfiguration = toolConfiguration;
    }

    public Object getUserNavigation() {
        return userNavigation;
    }

    public void setUserNavigation(Object userNavigation) {
        this.userNavigation = userNavigation;
    }

    public Integer getSelectionWidth() {
        return selectionWidth;
    }

    public void setSelectionWidth(Integer selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public Integer getSelectionHeight() {
        return selectionHeight;
    }

    public void setSelectionHeight(Integer selectionHeight) {
        this.selectionHeight = selectionHeight;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Boolean getNotSelectable() {
        return notSelectable;
    }

    public void setNotSelectable(Boolean notSelectable) {
        this.notSelectable = notSelectable;
    }


}
