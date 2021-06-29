package Controller.AuthenticationProvidersController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthenticationProviders {

    @SerializedName("identifier_format")
    @Expose
    private String identifierFormat;
    @SerializedName("auth_type")
    @Expose
    private String authType;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("log_out_url")
    @Expose
    private String logOutUrl;
    @SerializedName("log_in_url")
    @Expose
    private String logInUrl;
    @SerializedName("certificate_fingerprint")
    @Expose
    private String certificateFingerprint;
    @SerializedName("requested_authn_context")
    @Expose
    private Object requestedAuthnContext;
    @SerializedName("auth_host")
    @Expose
    private String authHost;
    @SerializedName("auth_filter")
    @Expose
    private String authFilter;
    @SerializedName("auth_over_tls")
    @Expose
    private Object authOverTls;
    @SerializedName("auth_base")
    @Expose
    private Object authBase;
    @SerializedName("auth_username")
    @Expose
    private String authUsername;
    @SerializedName("auth_port")
    @Expose
    private Object authPort;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("idp_entity_id")
    @Expose
    private String idpEntityId;
    @SerializedName("login_attribute")
    @Expose
    private String loginAttribute;
    @SerializedName("sig_alg")
    @Expose
    private String sigAlg;
    @SerializedName("jit_provisioning")
    @Expose
    private Object jitProvisioning;
    @SerializedName("federated_attributes")
    @Expose
    private Object federatedAttributes;
    @SerializedName("mfa_required")
    @Expose
    private Object mfaRequired;

    public String getIdentifierFormat() {
        return identifierFormat;
    }

    public void setIdentifierFormat(String identifierFormat) {
        this.identifierFormat = identifierFormat;
    }

    public String getAuthType() {
        return authType;
    }

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogOutUrl() {
        return logOutUrl;
    }

    public void setLogOutUrl(String logOutUrl) {
        this.logOutUrl = logOutUrl;
    }

    public String getLogInUrl() {
        return logInUrl;
    }

    public void setLogInUrl(String logInUrl) {
        this.logInUrl = logInUrl;
    }

    public String getCertificateFingerprint() {
        return certificateFingerprint;
    }

    public void setCertificateFingerprint(String certificateFingerprint) {
        this.certificateFingerprint = certificateFingerprint;
    }

    public Object getRequestedAuthnContext() {
        return requestedAuthnContext;
    }

    public void setRequestedAuthnContext(Object requestedAuthnContext) {
        this.requestedAuthnContext = requestedAuthnContext;
    }

    public String getAuthHost() {
        return authHost;
    }

    public void setAuthHost(String authHost) {
        this.authHost = authHost;
    }

    public String getAuthFilter() {
        return authFilter;
    }

    public void setAuthFilter(String authFilter) {
        this.authFilter = authFilter;
    }

    public Object getAuthOverTls() {
        return authOverTls;
    }

    public void setAuthOverTls(Object authOverTls) {
        this.authOverTls = authOverTls;
    }

    public Object getAuthBase() {
        return authBase;
    }

    public void setAuthBase(Object authBase) {
        this.authBase = authBase;
    }

    public String getAuthUsername() {
        return authUsername;
    }

    public void setAuthUsername(String authUsername) {
        this.authUsername = authUsername;
    }

    public Object getAuthPort() {
        return authPort;
    }

    public void setAuthPort(Object authPort) {
        this.authPort = authPort;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getIdpEntityId() {
        return idpEntityId;
    }

    public void setIdpEntityId(String idpEntityId) {
        this.idpEntityId = idpEntityId;
    }

    public String getLoginAttribute() {
        return loginAttribute;
    }

    public void setLoginAttribute(String loginAttribute) {
        this.loginAttribute = loginAttribute;
    }

    public String getSigAlg() {
        return sigAlg;
    }

    public void setSigAlg(String sigAlg) {
        this.sigAlg = sigAlg;
    }

    public Object getJitProvisioning() {
        return jitProvisioning;
    }

    public void setJitProvisioning(Object jitProvisioning) {
        this.jitProvisioning = jitProvisioning;
    }

    public Object getFederatedAttributes() {
        return federatedAttributes;
    }

    public void setFederatedAttributes(Object federatedAttributes) {
        this.federatedAttributes = federatedAttributes;
    }

    public Object getMfaRequired() {
        return mfaRequired;
    }

    public void setMfaRequired(Object mfaRequired) {
        this.mfaRequired = mfaRequired;
    }


}
