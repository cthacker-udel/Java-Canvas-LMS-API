public class Analytics extends CanvasClient{

    private Integer accountId;

    private Integer termId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        return queries;


    }

    public void clearQueries(){

        this.accountId = null;
        this.termId = null;

    }

    public Integer getAccountId(){
        return this.accountId;
    }

    public Integer getTermId(){
        return this.termId;
    }

    public void setAccountId(Integer newAccountId){
        this.accountId = newAccountId;
    }

    public void setTermId(Integer newTermId){
        this.termId = newTermId;
    }

    
}