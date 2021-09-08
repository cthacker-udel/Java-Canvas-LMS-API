package Controller.FilesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PublicInlinePreviewURL {

    @SerializedName("public_url")
    @Expose
    private String publicUrl;

    public String getPublicUrl() {
        return publicUrl;
    }

    public void setPublicUrl(String publicUrl) {
        this.publicUrl = publicUrl;
    }

}
