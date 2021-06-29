package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class AuthenticationProviders extends CanvasClient {

    private String accountIdAuthenticationProviders;
    private String clientId;
    private String loginAttribute;
    private String federated_attributes;
    private String selfRegistration;
    private String authBase;
    private String loginUrl;
    private String clientSecret;
    private String districtId;
    private String appId;
    private String appSecret;
    private String domain;
    private String hostedDomain;
    private String authHost;
    private String authPort;
    private String authOverTls;
    private String authFilter;
    private String identifierFormat;
    private String authUsername;
    private String authPassword;
    private String tenant;
    private String tokenUrl;
    private String scope;
    private String endSessionEndpoint;
    private String userInfoEndpoint;
    private String metadata;
    private String metadataUri;
    private String idpEntityId;
    private String logoutUrl;
    private String ceritificateFingerprint;
    private String requestedAuthnContext;
    private String sigAlg;
    private String consumerKey;
    private String consumerSecret;
    private String parentRegistration;
    private String applicationId;
    private String applicationSecret;
    private String authorizeUrl;
    private String authenticationProviderId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.clientId != null){
            queries.put("client_id",this.clientId);
        }
        if(this.loginAttribute != null){
            queries.put("login_attribute",this.loginAttribute);
        }
        if(this.federated_attributes != null){
            queries.put("federated_attributes",this.federated_attributes);
        }
        if(this.selfRegistration != null){
            queries.put("self_registration",this.selfRegistration);
        }
        if(this.authBase != null){
            queries.put("auth_base",this.authBase);
        }
        if(this.loginUrl != null){
            queries.put("log_in_url",this.loginUrl);
        }
        if(this.clientId != null) {
            queries.put("client_id", this.clientId);
        }
        if(this.clientSecret != null){
            queries.put("client_secret",this.clientSecret);
        }
        if(this.districtId != null){
            queries.put("district_id",this.districtId);
        }
        if(this.loginAttribute != null){
            queries.put("login_attribute",this.loginAttribute);
        }
        if(this.appId != null){
            queries.put("app_id",this.appId);
        }
        if(this.appSecret != null){
            queries.put("app_secret",this.appSecret);
        }
        if(this.domain != null){
            queries.put("domain",this.domain);
        }
        if(this.hostedDomain != null){
            queries.put("hosted_domain",this.hostedDomain);
        }
        if(this.authHost != null){
            queries.put("auth_host",this.authHost);
        }
        if(this.authPort != null){
            queries.put("auth_port",this.authPort);
        }
        if(this.authOverTls != null){
            queries.put("auth_over_tls",this.authOverTls);
        }
        if(this.authFilter != null){
            queries.put("auth_filter",this.authFilter);
        }
        if(this.identifierFormat != null){
            queries.put("identifier_format",this.identifierFormat);
        }
        if(this.authUsername != null){
            queries.put("auth_username",this.authUsername);
        }
        if(this.authPassword != null){
            queries.put("auth_password",this.authPassword);
        }
        if(this.applicationSecret != null){
            queries.put("application_secret",this.applicationSecret);
        }
        if(this.applicationId != null){
            queries.put("application_id",this.applicationId);
        }
        if(this.tenant != null){
            queries.put("tenant",this.tenant);
        }
        if(this.authorizeUrl != null){
            queries.put("authorize_url",this.authorizeUrl);
        }
        if(this.tokenUrl != null){
            queries.put("token_url",this.tokenUrl);
        }
        if(this.scope != null){
            queries.put("scope",this.scope);
        }
        if(this.endSessionEndpoint != null){
            queries.put("end_session_endpoint",this.endSessionEndpoint);
        }
        if(this.userInfoEndpoint != null){
            queries.put("userinfo_endpoint",this.userInfoEndpoint);
        }
        if(this.metadata != null){
            queries.put("metadata",this.metadata);
        }
        if(this.metadataUri != null){
            queries.put("metadata_uri",this.metadataUri);
        }
        if(this.idpEntityId != null){
            queries.put("idp_entity_id",this.idpEntityId);
        }
        if(this.logoutUrl != null){
            queries.put("log_out_url",this.logoutUrl);
        }
        if(this.ceritificateFingerprint != null){
            queries.put("certificate_fingerprint",this.ceritificateFingerprint);
        }
        if(this.identifierFormat != null){
            queries.put("identifier_format",this.identifierFormat);
        }
        if(this.requestedAuthnContext != null){
            queries.put("requested_authn_context",this.requestedAuthnContext);
        }
        if(this.sigAlg != null){
            queries.put("sig_alg",this.sigAlg);
        }
        if(this.consumerKey != null){
            queries.put("consumer_key",this.consumerKey);
        }
        if(this.consumerSecret != null){
            queries.put("consumer_secret",this.consumerSecret);
        }
        if(this.parentRegistration != null) {
            queries.put("parent_registration", this.parentRegistration);
        }

        return queries;

    }

    public void clearQueries(){

        this.clientId = null;
        this.loginAttribute = null;
        this.federated_attributes = null;
        this.selfRegistration = null;
        this.authBase = null;
        this.loginUrl = null;
        this.clientSecret = null;
        this.districtId = null;
        this.appId = null;
        this.appSecret = null;
        this.domain = null;
        this.hostedDomain = null;
        this.authHost = null;
        this.authPort = null;
        this.authOverTls = null;
        this.authFilter = null;
        this.identifierFormat = null;
        this.authUsername = null;
        this.authPassword = null;
        this.tenant = null;
        this.tokenUrl = null;
        this.scope = null;
        this.endSessionEndpoint = null;
        this.userInfoEndpoint = null;
        this.metadata = null;
        this.metadataUri = null;
        this.idpEntityId = null;
        this.logoutUrl = null;
        this.ceritificateFingerprint = null;
        this.requestedAuthnContext = null;
        this.sigAlg = null;
        this.consumerKey = null;
        this.consumerSecret = null;
        this.parentRegistration = null;
        this.applicationId = null;
        this.applicationSecret = null;
        this.authorizeUrl = null;

    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationSecret() {
        return applicationSecret;
    }

    public void setApplicationSecret(String applicationSecret) {
        this.applicationSecret = applicationSecret;
    }

    public String getAuthorizeUrl() {
        return authorizeUrl;
    }

    public void setAuthorizeUrl(String authorizeUrl) {
        this.authorizeUrl = authorizeUrl;
    }

    public String getAuthenticationProviderId() {
        return authenticationProviderId;
    }

    public void setAuthenticationProviderId(String authenticationProviderId) {
        this.authenticationProviderId = authenticationProviderId;
    }

    @Override
    public String getClientId() {
        return clientId;
    }

    @Override
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getLoginAttribute() {
        return loginAttribute;
    }

    public void setLoginAttribute(String loginAttribute) {
        this.loginAttribute = loginAttribute;
    }

    public String getFederated_attributes() {
        return federated_attributes;
    }

    public void setFederated_attributes(String federated_attributes) {
        this.federated_attributes = federated_attributes;
    }

    public String getSelfRegistration() {
        return selfRegistration;
    }

    public void setSelfRegistration(String selfRegistration) {
        this.selfRegistration = selfRegistration;
    }

    public String getAuthBase() {
        return authBase;
    }

    public void setAuthBase(String authBase) {
        this.authBase = authBase;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    @Override
    public String getClientSecret() {
        return clientSecret;
    }

    @Override
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public String getDistrictId() {
        return districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getHostedDomain() {
        return hostedDomain;
    }

    public void setHostedDomain(String hostedDomain) {
        this.hostedDomain = hostedDomain;
    }

    public String getAuthHost() {
        return authHost;
    }

    public void setAuthHost(String authHost) {
        this.authHost = authHost;
    }

    public String getAuthPort() {
        return authPort;
    }

    public void setAuthPort(String authPort) {
        this.authPort = authPort;
    }

    public String getAuthOverTls() {
        return authOverTls;
    }

    public void setAuthOverTls(String authOverTls) {
        this.authOverTls = authOverTls;
    }

    public String getAuthFilter() {
        return authFilter;
    }

    public void setAuthFilter(String authFilter) {
        this.authFilter = authFilter;
    }

    public String getIdentifierFormat() {
        return identifierFormat;
    }

    public void setIdentifierFormat(String identifierFormat) {
        this.identifierFormat = identifierFormat;
    }

    public String getAuthUsername() {
        return authUsername;
    }

    public void setAuthUsername(String authUsername) {
        this.authUsername = authUsername;
    }

    public String getAuthPassword() {
        return authPassword;
    }

    public void setAuthPassword(String authPassword) {
        this.authPassword = authPassword;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getTokenUrl() {
        return tokenUrl;
    }

    public void setTokenUrl(String tokenUrl) {
        this.tokenUrl = tokenUrl;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getEndSessionEndpoint() {
        return endSessionEndpoint;
    }

    public void setEndSessionEndpoint(String endSessionEndpoint) {
        this.endSessionEndpoint = endSessionEndpoint;
    }

    public String getUserInfoEndpoint() {
        return userInfoEndpoint;
    }

    public void setUserInfoEndpoint(String userInfoEndpoint) {
        this.userInfoEndpoint = userInfoEndpoint;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getMetadataUri() {
        return metadataUri;
    }

    public void setMetadataUri(String metadataUri) {
        this.metadataUri = metadataUri;
    }

    public String getIdpEntityId() {
        return idpEntityId;
    }

    public void setIdpEntityId(String idpEntityId) {
        this.idpEntityId = idpEntityId;
    }

    public String getLogoutUrl() {
        return logoutUrl;
    }

    public void setLogoutUrl(String logoutUrl) {
        this.logoutUrl = logoutUrl;
    }

    public String getCeritificateFingerprint() {
        return ceritificateFingerprint;
    }

    public void setCeritificateFingerprint(String ceritificateFingerprint) {
        this.ceritificateFingerprint = ceritificateFingerprint;
    }

    public String getRequestedAuthnContext() {
        return requestedAuthnContext;
    }

    public void setRequestedAuthnContext(String requestedAuthnContext) {
        this.requestedAuthnContext = requestedAuthnContext;
    }

    public String getSigAlg() {
        return sigAlg;
    }

    public void setSigAlg(String sigAlg) {
        this.sigAlg = sigAlg;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public String getParentRegistration() {
        return parentRegistration;
    }

    public void setParentRegistration(String parentRegistration) {
        this.parentRegistration = parentRegistration;
    }

    public String getAccountIdAuthenticationProviders() {
        return accountIdAuthenticationProviders;
    }

    public void setAccountIdAuthenticationProviders(String accountIdAuthenticationProviders) {
        this.accountIdAuthenticationProviders = accountIdAuthenticationProviders;
    }
}
