package Client;

import getRequests.AccountDomain;
import getRequests.AccountNotification;
import getRequests.AccountReport;

public class CanvasClient extends CanvasRestAPI {

    private String token;
    private String clientId;
    private String clientSecret;
    private Integer accountId;
    private AccountDomain accountDomain;
    private AccountNotification accountNotification;
    private AccountReport accountReport;

    public CanvasClient(){
        super();
    }

    public CanvasClient(String newClientId, String newClientSecret){

        // temp
        this.token = newClientId;

        this.clientId = newClientId;
        this.clientSecret = newClientSecret;
        this.accountDomain = new AccountDomain();
        this.accountNotification = new AccountNotification();
        this.accountReport = new AccountReport();

    }

    public AccountReport getAccountReport() {
        return accountReport;
    }

    public void setAccountReport(AccountReport accountReport) {
        this.accountReport = accountReport;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public AccountNotification getAccountNotification() {
        return accountNotification;
    }

    public void setAccountNotification(AccountNotification accountNotification) {
        this.accountNotification = accountNotification;
    }



    public AccountDomain getAccountDomain() {
        return accountDomain;
    }

    public void setAccountDomain(AccountDomain accountDomain) {
        this.accountDomain = accountDomain;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
