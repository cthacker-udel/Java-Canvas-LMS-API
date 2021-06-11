package Controller.AccountController.Accounts.AccountPermissions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountPermissions {

    @SerializedName("manage_account_memberships")
    @Expose
    private Boolean manageAccountMemberships;
    @SerializedName("become_user")
    @Expose
    private Boolean becomeUser;

    public Boolean getManageAccountMemberships() {
        return manageAccountMemberships;
    }

    public void setManageAccountMemberships(Boolean manageAccountMemberships) {
        this.manageAccountMemberships = manageAccountMemberships;
    }

    public Boolean getBecomeUser() {
        return becomeUser;
    }

    public void setBecomeUser(Boolean becomeUser) {
        this.becomeUser = becomeUser;
    }

}
