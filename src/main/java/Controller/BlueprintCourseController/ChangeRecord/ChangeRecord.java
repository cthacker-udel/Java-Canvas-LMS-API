package Controller.BlueprintCourseController.ChangeRecord;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChangeRecord {

    @SerializedName("asset_id")
    @Expose
    private Integer assetId;
    @SerializedName("asset_type")
    @Expose
    private String assetType;
    @SerializedName("asset_name")
    @Expose
    private String assetName;
    @SerializedName("change_type")
    @Expose
    private String changeType;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("locked")
    @Expose
    private Boolean locked;
    @SerializedName("exceptions")
    @Expose
    private List<Exception> exceptions = null;

    public Integer getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public List<Exception> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<Exception> exceptions) {
        this.exceptions = exceptions;
    }

}
