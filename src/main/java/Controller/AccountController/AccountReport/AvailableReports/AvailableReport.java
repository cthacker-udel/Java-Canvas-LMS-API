package Controller.AccountController.AccountReport.AvailableReports;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AvailableReport {

    @SerializedName("report")
    @Expose
    private String report;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("parameters")
    @Expose
    private Object parameters;

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getParameters() {
        return parameters;
    }

    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

}
