package Controller.FilesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class File {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("folder_id")
    @Expose
    private Integer folderId;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("filename")
    @Expose
    private String filename;
    @SerializedName("content-type")
    @Expose
    private String contentType;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("size")
    @Expose
    private Integer size;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("unlock_at")
    @Expose
    private String unlockAt;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("lock_at")
    @Expose
    private String lockAt;
    @SerializedName("hidden_for_user")
    @Expose
    private Boolean hiddenForUser;
    @SerializedName("thumbnail_url")
    @Expose
    private Object thumbnailUrl;
    @SerializedName("modified_at")
    @Expose
    private String modifiedAt;
    @SerializedName("mime_class")
    @Expose
    private String mimeClass;
    @SerializedName("media_entry_id")
    @Expose
    private String mediaEntryId;
    @SerializedName("locked_for_user")
    @Expose
    private Boolean lockedForUser;
    @SerializedName("lock_info")
    @Expose
    private Object lockInfo;
    @SerializedName("lock_explanation")
    @Expose
    private String lockExplanation;
    @SerializedName("preview_url")
    @Expose
    private Object previewUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
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

    public String getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(String unlockAt) {
        this.unlockAt = unlockAt;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getLockAt() {
        return lockAt;
    }

    public void setLockAt(String lockAt) {
        this.lockAt = lockAt;
    }

    public Boolean getHiddenForUser() {
        return hiddenForUser;
    }

    public void setHiddenForUser(Boolean hiddenForUser) {
        this.hiddenForUser = hiddenForUser;
    }

    public Object getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(Object thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public String getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    public String getMimeClass() {
        return mimeClass;
    }

    public void setMimeClass(String mimeClass) {
        this.mimeClass = mimeClass;
    }

    public String getMediaEntryId() {
        return mediaEntryId;
    }

    public void setMediaEntryId(String mediaEntryId) {
        this.mediaEntryId = mediaEntryId;
    }

    public Boolean getLockedForUser() {
        return lockedForUser;
    }

    public void setLockedForUser(Boolean lockedForUser) {
        this.lockedForUser = lockedForUser;
    }

    public Object getLockInfo() {
        return lockInfo;
    }

    public void setLockInfo(Object lockInfo) {
        this.lockInfo = lockInfo;
    }

    public String getLockExplanation() {
        return lockExplanation;
    }

    public void setLockExplanation(String lockExplanation) {
        this.lockExplanation = lockExplanation;
    }

    public Object getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(Object previewUrl) {
        this.previewUrl = previewUrl;
    }

}
