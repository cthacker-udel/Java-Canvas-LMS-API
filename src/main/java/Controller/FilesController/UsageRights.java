package Controller.FilesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UsageRights {

    @SerializedName("legal_copyright")
    @Expose
    private String legalCopyright;
    @SerializedName("use_justification")
    @Expose
    private String useJustification;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("license_name")
    @Expose
    private String licenseName;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("file_ids")
    @Expose
    private List<Integer> fileIds = null;

    public String getLegalCopyright() {
        return legalCopyright;
    }

    public void setLegalCopyright(String legalCopyright) {
        this.legalCopyright = legalCopyright;
    }

    public String getUseJustification() {
        return useJustification;
    }

    public void setUseJustification(String useJustification) {
        this.useJustification = useJustification;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Integer> getFileIds() {
        return fileIds;
    }

    public void setFileIds(List<Integer> fileIds) {
        this.fileIds = fileIds;
    }

}
