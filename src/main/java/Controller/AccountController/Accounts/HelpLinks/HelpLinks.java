package Controller.AccountController.Accounts.HelpLinks;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class HelpLinks {

    @SerializedName("help_link_name")
    @Expose
    private String helpLinkName;
    @SerializedName("help_link_icon")
    @Expose
    private String helpLinkIcon;
    @SerializedName("custom_help_links")
    @Expose
    private List<CustomHelpLink> customHelpLinks = null;
    @SerializedName("default_help_links")
    @Expose
    private List<DefaultHelpLink> defaultHelpLinks = null;

    public String getHelpLinkName() {
        return helpLinkName;
    }

    public void setHelpLinkName(String helpLinkName) {
        this.helpLinkName = helpLinkName;
    }

    public String getHelpLinkIcon() {
        return helpLinkIcon;
    }

    public void setHelpLinkIcon(String helpLinkIcon) {
        this.helpLinkIcon = helpLinkIcon;
    }

    public List<CustomHelpLink> getCustomHelpLinks() {
        return customHelpLinks;
    }

    public void setCustomHelpLinks(List<CustomHelpLink> customHelpLinks) {
        this.customHelpLinks = customHelpLinks;
    }

    public List<DefaultHelpLink> getDefaultHelpLinks() {
        return defaultHelpLinks;
    }

    public void setDefaultHelpLinks(List<DefaultHelpLink> defaultHelpLinks) {
        this.defaultHelpLinks = defaultHelpLinks;
    }

}
