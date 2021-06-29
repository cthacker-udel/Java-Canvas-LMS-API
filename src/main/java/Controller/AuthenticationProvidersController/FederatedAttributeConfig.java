package Controller.AuthenticationProvidersController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FederatedAttributeConfig {

    @SerializedName("attribute")
    @Expose
    private String attribute;
    @SerializedName("provisioning_only")
    @Expose
    private Boolean provisioningOnly;

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Boolean getProvisioningOnly() {
        return provisioningOnly;
    }

    public void setProvisioningOnly(Boolean provisioningOnly) {
        this.provisioningOnly = provisioningOnly;
    }

}
