package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccountList extends CanvasClient {

    private ArrayList<String> include = new ArrayList<>();

    private ArrayList<String> permissions = new ArrayList<>();

    private Boolean recursive;

    private String accountListId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.include.size() > 0){
            queries.put("include[]",this.include.toArray(String[]::new));
        }
        if(this.permissions.size() > 0){
            queries.put("permissions[]",this.permissions.toArray(String[]::new));
        }

        return queries;


    }

    public void clearQueries(){

        this.include.clear();
        this.permissions.clear();

    }

    public Boolean getRecursive() {
        return recursive;
    }

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    public ArrayList<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }

    public ArrayList<String> getInclude() {
        return include;
    }

    public void setInclude(ArrayList<String> include) {
        this.include = include;
    }

    public String getAccountListId() {
        return accountListId;
    }

    public void setAccountListId(String accountListId) {
        this.accountListId = accountListId;
    }
}
