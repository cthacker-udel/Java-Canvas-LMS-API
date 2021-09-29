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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGradingSchemeEntryName() {
        return gradingSchemeEntryName;
    }

    public void setGradingSchemeEntryName(String gradingSchemeEntryName) {
        this.gradingSchemeEntryName = gradingSchemeEntryName;
    }

    public Integer getGradingSchemeEntryValue() {
        return gradingSchemeEntryValue;
    }

    public void setGradingSchemeEntryValue(Integer gradingSchemeEntryValue) {
        this.gradingSchemeEntryValue = gradingSchemeEntryValue;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    @Override
    public Integer getAccountId() {
        return Integer.parseInt(accountId);
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getGradingStandardId() {
        return gradingStandardId;
    }

    public void setGradingStandardId(String gradingStandardId) {
        this.gradingStandardId = gradingStandardId;
    }
}
