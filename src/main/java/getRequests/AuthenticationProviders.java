package getRequests;

import Client.CanvasClient;

import java.util.Map;

public class AuthenticationProviders extends CanvasClient {

    private String accountIdAuthenticationProviders;

    public Map<String,Object> generateQueries(){

        return null;

    }

    public void clearQueries(){


    }

    public String getAccountIdAuthenticationProviders() {
        return accountIdAuthenticationProviders;
    }

    public void setAccountIdAuthenticationProviders(String accountIdAuthenticationProviders) {
        this.accountIdAuthenticationProviders = accountIdAuthenticationProviders;
    }
}
