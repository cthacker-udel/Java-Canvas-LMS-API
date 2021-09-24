package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;


public class GradingPeriod extends CanvasClient {

    private Integer accountId;
    private String courseId;
    private String gradingPeriodId;
    private String gradingPeriodStartDate;
    private String gradingPeriodEndDate;
    private Integer gradingPeriodWeight;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.gradingPeriodStartDate != null){
            queries.put("grading_periods[][start_date]",this.gradingPeriodStartDate);
        }
        if(this.gradingPeriodEndDate != null){
            queries.put("grading_periods[][end_date]",this.gradingPeriodEndDate);
        }
        if(this.gradingPeriodWeight != null){
            queries.put("grading_periods[][weight]",this.gradingPeriodWeight);
        }
        return queries;

    }

    public void clearQueries(){

        this.gradingPeriodWeight = null;
        this.gradingPeriodEndDate = null;
        this.gradingPeriodId = null;
        this.gradingPeriodStartDate = null;
        this.courseId = null;
        this.gradingPeriodId = null;

    }

    @Override
    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getGradingPeriodId() {
        return gradingPeriodId;
    }

    public void setGradingPeriodId(String gradingPeriodId) {
        this.gradingPeriodId = gradingPeriodId;
    }

    public String getGradingPeriodStartDate() {
        return gradingPeriodStartDate;
    }

    public void setGradingPeriodStartDate(String gradingPeriodStartDate) {
        this.gradingPeriodStartDate = gradingPeriodStartDate;
    }

    public String getGradingPeriodEndDate() {
        return gradingPeriodEndDate;
    }

    public void setGradingPeriodEndDate(String gradingPeriodEndDate) {
        this.gradingPeriodEndDate = gradingPeriodEndDate;
    }

    public Integer getGradingPeriodWeight() {
        return gradingPeriodWeight;
    }

    public void setGradingPeriodWeight(Integer gradingPeriodWeight) {
        this.gradingPeriodWeight = gradingPeriodWeight;
    }
}
