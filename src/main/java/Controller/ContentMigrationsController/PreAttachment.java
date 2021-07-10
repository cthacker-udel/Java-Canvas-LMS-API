package Controller.ContentMigrationsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PreAttachment {

    @SerializedName("upload_url")
    @Expose
    private String uploadUrl;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("upload_params")
    @Expose
    private UploadParams uploadParams;

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UploadParams getUploadParams() {
        return uploadParams;
    }

    public void setUploadParams(UploadParams uploadParams) {
        this.uploadParams = uploadParams;
    }


}
