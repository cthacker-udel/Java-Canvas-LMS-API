package Controller.AssignmentsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LockInfo {

    @SerializedName("asset_string")
    @Expose
    private String assetString;
    @SerializedName("unlock_at")
    @Expose
    private String unlockAt;
    @SerializedName("lock_at")
    @Expose
    private String lockAt;
    @SerializedName("context_module")
    @Expose
    private String contextModule;
    @SerializedName("manually_locked")
    @Expose
    private Boolean manuallyLocked;

    public String getAssetString() {
        return assetString;
    }

    public void setAssetString(String assetString) {
        this.assetString = assetString;
    }

    public String getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(String unlockAt) {
        this.unlockAt = unlockAt;
    }

    public String getLockAt() {
        return lockAt;
    }

    public void setLockAt(String lockAt) {
        this.lockAt = lockAt;
    }

    public String getContextModule() {
        return contextModule;
    }

    public void setContextModule(String contextModule) {
        this.contextModule = contextModule;
    }

    public Boolean getManuallyLocked() {
        return manuallyLocked;
    }

    public void setManuallyLocked(Boolean manuallyLocked) {
        this.manuallyLocked = manuallyLocked;
    }


}
