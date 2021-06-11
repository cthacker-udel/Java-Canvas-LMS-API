package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccountList extends CanvasClient {

    private ArrayList<String> include = new ArrayList<>();

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.include.size() > 0){
            queries.put("include[]",this.include.toArray(String[]::new));
        }

        return queries;


    }

    public void clearQueries(){

        this.include.clear();

    }



}
