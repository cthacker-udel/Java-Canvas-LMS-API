package Controller.AccountController.AccountDomain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountDomainSearchResponse {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("distance")
    @Expose
    private Object distance;
    @SerializedName("authentication_provider")
    @Expose
    private String authenticationProvider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Object getDistance() {
        return distance;
    }

    public void setDistance(Object distance) {
        this.distance = distance;
    }

    public String getAuthenticationProvider() {
        return authenticationProvider;
    }

    public void setAuthenticationProvider(String authenticationProvider) {
        this.authenticationProvider = authenticationProvider;
    }

}
