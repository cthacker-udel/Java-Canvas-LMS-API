package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class GradingStandard extends CanvasClient {

    private String title;
    private String gradingSchemeEntryName;
    private Integer gradingSchemeEntryValue;

    private String courseId;
    private String accountId;
    private String gradingStandardId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<String,Object>();

        if(this.title != null){
            queries.put("title",this.title);
        }
        if(this.gradingSchemeEntryName != null){
            queries.put("grading_scheme_entry[][name]",this.gradingSchemeEntryName);
        }
        if(this.gradingSchemeEntryValue != null){
            queries.put("grading_scheme_entry[][value]",this.gradingSchemeEntryValue);
        }
        return queries;

    }

    public void clearQueries(){

        this.title = null;
        this.gradingSchemeEntryValue = null;
        this.gradingSchemeEntryName = null;

    }

}
