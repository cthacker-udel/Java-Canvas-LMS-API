package Controller.FilesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Quota {

    @SerializedName("quota")
    @Expose
    private Integer quota;
    @SerializedName("quota_used")
    @Expose
    private Integer quotaUsed;

    public Integer getQuota() {
        return quota;
    }

    public void setQuota(Integer quota) {
        this.quota = quota;
    }

    public Integer getQuotaUsed() {
        return quotaUsed;
    }

    public void setQuotaUsed(Integer quotaUsed) {
        this.quotaUsed = quotaUsed;
    }


}
