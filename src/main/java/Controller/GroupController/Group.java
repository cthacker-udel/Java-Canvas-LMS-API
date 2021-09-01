package Controller.GroupController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("is_public")
    @Expose
    private Boolean isPublic;
    @SerializedName("followed_by_user")
    @Expose
    private Boolean followedByUser;
    @SerializedName("join_level")
    @Expose
    private String joinLevel;
    @SerializedName("members_count")
    @Expose
    private Integer membersCount;
    @SerializedName("avatar_url")
    @Expose
    private String avatarUrl;
    @SerializedName("context_type")
    @Expose
    private String contextType;
    @SerializedName("course_id")
    @Expose
    private Integer courseId;
    @SerializedName("role")
    @Expose
    private Object role;
    @SerializedName("group_category_id")
    @Expose
    private Integer groupCategoryId;
    @SerializedName("sis_group_id")
    @Expose
    private String sisGroupId;
    @SerializedName("sis_import_id")
    @Expose
    private Integer sisImportId;
    @SerializedName("storage_quota_mb")
    @Expose
    private Integer storageQuotaMb;
    @SerializedName("permissions")
    @Expose
    private Permissions permissions;
    @SerializedName("users")
    @Expose
    private Object users;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Boolean getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getFollowedByUser() {
        return followedByUser;
    }

    public void setFollowedByUser(Boolean followedByUser) {
        this.followedByUser = followedByUser;
    }

    public String getJoinLevel() {
        return joinLevel;
    }

    public void setJoinLevel(String joinLevel) {
        this.joinLevel = joinLevel;
    }

    public Integer getMembersCount() {
        return membersCount;
    }

    public void setMembersCount(Integer membersCount) {
        this.membersCount = membersCount;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }

    public Integer getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(Integer groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    public String getSisGroupId() {
        return sisGroupId;
    }

    public void setSisGroupId(String sisGroupId) {
        this.sisGroupId = sisGroupId;
    }

    public Integer getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }

    public Integer getStorageQuotaMb() {
        return storageQuotaMb;
    }

    public void setStorageQuotaMb(Integer storageQuotaMb) {
        this.storageQuotaMb = storageQuotaMb;
    }

    public Permissions getPermissions() {
        return permissions;
    }

    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    public Object getUsers() {
        return users;
    }

    public void setUsers(Object users) {
        this.users = users;
    }


}
