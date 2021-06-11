package Controller.AccountController.Accounts.HelpLinks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CustomHelpLink {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("subtext")
    @Expose
    private String subtext;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("available_to")
    @Expose
    private List<String> availableTo = null;
    @SerializedName("is_featured")
    @Expose
    private Boolean isFeatured;
    @SerializedName("is_new")
    @Expose
    private Boolean isNew;
    @SerializedName("feature_headline")
    @Expose
    private String featureHeadline;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubtext() {
        return subtext;
    }

    public void setSubtext(String subtext) {
        this.subtext = subtext;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getAvailableTo() {
        return availableTo;
    }

    public void setAvailableTo(List<String> availableTo) {
        this.availableTo = availableTo;
    }

    public Boolean getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    public Boolean getIsNew() {
        return isNew;
    }

    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }

    public String getFeatureHeadline() {
        return featureHeadline;
    }

    public void setFeatureHeadline(String featureHeadline) {
        this.featureHeadline = featureHeadline;
    }

}
