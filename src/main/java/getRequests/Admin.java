package getRequests;

import Client.CanvasClient;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Admin extends CanvasClient {

    private Integer userId;

    private String role;
    
    private Integer roleId;

    private Boolean sendConfirmation;

    private ArrayList<Integer> userIds = new ArrayList<Integer>();

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.userId != null){
            queries.put("user_id",this.userId);
        }
        if(this.role != null){
            queries.put("role",this.role);
        }
        if(this.roleId != null){
            queries.put("role_id",this.roleId);
        }
        if(this.sendConfirmation != null){
            queries.put("send_confirmation",this.sendConfirmation);
        }
        if(this.userIds.size() > 0){
            queries.put("user_id[]",this.userIds.toArray(Integer[]::new));
        }

        return queries;

    }

    public void clearQueries(){

        this.role = null;
        this.userId = null;
        this.roleId = null;
        this.sendConfirmation = null;
        this.userIds.clear();

    }

    public Integer getUserId(){

        return this.userId;

    }

    public ArrayList<Integer> getUserIds(){
        return this.userIds;
    }

    public void setUserIds(ArrayList<Integer> userIds){
        this.userIds = userIds;
    }

    public String getRole(){

        return this.role;

    }

    public Integer getRoleId(){

        return this.roleId;

    }

    public Boolean getSendConfirmation(){

        return this.sendConfirmation;

    }

    public void setUserId(Integer userId){
        this.userId = userId;
    }

    public void setRoleId(Integer roleId){
        this.roleId = roleId;
    }

    public void setRole(String role){
        this.role = role;
    }

    public void setSendConfirmation(Boolean sendConfirmation){
        this.sendConfirmation = sendConfirmation;
    }

}