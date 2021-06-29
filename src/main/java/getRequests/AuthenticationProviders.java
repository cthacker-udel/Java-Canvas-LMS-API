package getRequests;

import Client.CanvasClient;

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

    public Map<String,Object> generateQueries(){

        return null;

    }

    public void clearQueries(){


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
