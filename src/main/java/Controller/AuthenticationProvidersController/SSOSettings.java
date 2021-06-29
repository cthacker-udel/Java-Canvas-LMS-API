package Controller.AuthenticationProvidersController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SSOSettings {

    @SerializedName("login_handle_name")
    @Expose
    private String loginHandleName;
    @SerializedName("change_password_url")
    @Expose
    private String changePasswordUrl;
    @SerializedName("auth_discovery_url")
    @Expose
    private String authDiscoveryUrl;
    @SerializedName("unknown_user_url")
    @Expose
    private String unknownUserUrl;

    public String getLoginHandleName() {
        return loginHandleName;
    }

    public void setLoginHandleName(String loginHandleName) {
        this.loginHandleName = loginHandleName;
    }

    public String getChangePasswordUrl() {
        return changePasswordUrl;
    }

    public void setChangePasswordUrl(String changePasswordUrl) {
        this.changePasswordUrl = changePasswordUrl;
    }

    public String getAuthDiscoveryUrl() {
        return authDiscoveryUrl;
    }

    public void setAuthDiscoveryUrl(String authDiscoveryUrl) {
        this.authDiscoveryUrl = authDiscoveryUrl;
    }

    public String getUnknownUserUrl() {
        return unknownUserUrl;
    }

    public void setUnknownUserUrl(String unknownUserUrl) {
        this.unknownUserUrl = unknownUserUrl;
    }


}
