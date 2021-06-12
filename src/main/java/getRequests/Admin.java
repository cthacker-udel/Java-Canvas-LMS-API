public class Admin extends CanvasClient{

    private Integer userId;

    private String role;
    
    private Integer roleId;

    private Boolean sendConfirmation;

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

        return queries;

    }

    public void clearQueries(){

        this.role = null;
        this.userId = null;
        this.roleId = null;
        this.sendConfirmation = null;

    }


}