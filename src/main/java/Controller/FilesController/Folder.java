package Controller.FilesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Folder {

    @SerializedName("context_type")
    @Expose
    private String contextType;
    @SerializedName("context_id")
    @Expose
    private Integer contextId;
    @SerializedName("files_count")
    @Expose
    private Integer filesCount;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("folders_url")
    @Expose
    private String foldersUrl;
    @SerializedName("files_url")
    @Expose
    private String filesUrl;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("lock_at")
    @Expose
    private String lockAt;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("folders_count")
    @Expose
    private Integer foldersCount;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("parent_folder_id")
    @Expose
    private Integer parentFolderId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("unlock_at")
    @Expose
    private Object unlockAt;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("hidden_for_user")
    @Expose
    private Boolean hiddenForUser;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("locked_for_user")
    @Expose
    private Boolean lockedForUser;
    @SerializedName("for_submissions")
    @Expose
    private Boolean forSubmissions;

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Integer getContextId() {
        return contextId;
    }

    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public Integer getFilesCount() {
        return filesCount;
    }

    public void setFilesCount(Integer filesCount) {
        this.filesCount = filesCount;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getFoldersUrl() {
        return foldersUrl;
    }

    public void setFoldersUrl(String foldersUrl) {
        this.foldersUrl = foldersUrl;
    }

    public String getFilesUrl() {
        return filesUrl;
    }

    public void setFilesUrl(String filesUrl) {
        this.filesUrl = filesUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLockAt() {
        return lockAt;
    }

    public void setLockAt(String lockAt) {
        this.lockAt = lockAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFoldersCount() {
        return foldersCount;
    }

    public void setFoldersCount(Integer foldersCount) {
        this.foldersCount = foldersCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentFolderId() {
        return parentFolderId;
    }

    public void setParentFolderId(Integer parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Object getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(Object unlockAt) {
        this.unlockAt = unlockAt;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getHiddenForUser() {
        return hiddenForUser;
    }

    public void setHiddenForUser(Boolean hiddenForUser) {
        this.hiddenForUser = hiddenForUser;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getLockedForUser() {
        return lockedForUser;
    }

    public void setLockedForUser(Boolean lockedForUser) {
        this.lockedForUser = lockedForUser;
    }

    public Boolean getForSubmissions() {
        return forSubmissions;
    }

    public void setForSubmissions(Boolean forSubmissions) {
        this.forSubmissions = forSubmissions;
    }

}
