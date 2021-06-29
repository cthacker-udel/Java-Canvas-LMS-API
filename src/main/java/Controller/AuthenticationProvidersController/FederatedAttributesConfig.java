package Controller.AuthenticationProvidersController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FederatedAttributesConfig {

    @SerializedName("admin_roles")
    @Expose
    private Object adminRoles;
    @SerializedName("display_name")
    @Expose
    private Object displayName;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("given_name")
    @Expose
    private Object givenName;
    @SerializedName("integration_id")
    @Expose
    private Object integrationId;
    @SerializedName("locale")
    @Expose
    private Object locale;
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("sis_user_id")
    @Expose
    private Object sisUserId;
    @SerializedName("sortable_name")
    @Expose
    private Object sortableName;
    @SerializedName("surname")
    @Expose
    private Object surname;
    @SerializedName("timezone")
    @Expose
    private Object timezone;

    public Object getAdminRoles() {
        return adminRoles;
    }

    public void setAdminRoles(Object adminRoles) {
        this.adminRoles = adminRoles;
    }

    public Object getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Object displayName) {
        this.displayName = displayName;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public Object getGivenName() {
        return givenName;
    }

    public void setGivenName(Object givenName) {
        this.givenName = givenName;
    }

    public Object getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(Object integrationId) {
        this.integrationId = integrationId;
    }

    public Object getLocale() {
        return locale;
    }

    public void setLocale(Object locale) {
        this.locale = locale;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getSisUserId() {
        return sisUserId;
    }

    public void setSisUserId(Object sisUserId) {
        this.sisUserId = sisUserId;
    }

    public Object getSortableName() {
        return sortableName;
    }

    public void setSortableName(Object sortableName) {
        this.sortableName = sortableName;
    }

    public Object getSurname() {
        return surname;
    }

    public void setSurname(Object surname) {
        this.surname = surname;
    }

    public Object getTimezone() {
        return timezone;
    }

    public void setTimezone(Object timezone) {
        this.timezone = timezone;
    }


}
