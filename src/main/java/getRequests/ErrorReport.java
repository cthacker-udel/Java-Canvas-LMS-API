package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class ErrorReport extends CanvasClient {

    private String errorSubject;
    private String errorUrl;
    private String errorEmail;
    private String errorComments;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.errorSubject != null){
            queries.put("error[subject]",this.errorSubject);
        }
        if(this.errorUrl != null){
            queries.put("error[url]",this.errorUrl);
        }
        if(this.errorEmail != null){
            queries.put("error[email]",this.errorEmail);
        }
        if(this.errorComments != null){
            queries.put("error[comments]",this.errorComments);
        }
        return queries;

    }

    public void clearQueries(){

        this.errorSubject = null;
        this.errorUrl = null;
        this.errorEmail = null;
        this.errorComments = null;

    }

    public String getErrorSubject() {
        return errorSubject;
    }

    public void setErrorSubject(String errorSubject) {
        this.errorSubject = errorSubject;
    }

    public String getErrorUrl() {
        return errorUrl;
    }

    public void setErrorUrl(String errorUrl) {
        this.errorUrl = errorUrl;
    }

    public String getErrorEmail() {
        return errorEmail;
    }

    public void setErrorEmail(String errorEmail) {
        this.errorEmail = errorEmail;
    }

    public String getErrorComments() {
        return errorComments;
    }

    public void setErrorComments(String errorComments) {
        this.errorComments = errorComments;
    }
}
