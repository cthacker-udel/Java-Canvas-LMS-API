package getRequests;

import Client.CanvasClient;

import java.util.HashMap;
import java.util.Map;

public class AccountDomain extends CanvasClient {

    private Map<String,Object> domainSearch;

    public AccountDomain(){
        super();
        this.domainSearch = new HashMap<String,Object>();
    }

    public void addDomainSearch(String name, String value){
        this.domainSearch.put(name,value);
    }

    public Map<String, Object> getDomainSearch() {
        return domainSearch;
    }

    public void setDomainSearch(Map<String, Object> domainSearch) {
        this.domainSearch = domainSearch;
    }
}
