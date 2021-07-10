package Controller.ContentMigrationsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Migrator {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("requires_file_upload")
    @Expose
    private Boolean requiresFileUpload;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("required_settings")
    @Expose
    private List<String> requiredSettings = null;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getRequiresFileUpload() {
        return requiresFileUpload;
    }

    public void setRequiresFileUpload(Boolean requiresFileUpload) {
        this.requiresFileUpload = requiresFileUpload;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRequiredSettings() {
        return requiredSettings;
    }

    public void setRequiredSettings(List<String> requiredSettings) {
        this.requiredSettings = requiredSettings;
    }

}
