package Controller.AccountController.AccountReport.CreatedReport;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CreatedReport {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("report")
    @Expose
    private String report;
    @SerializedName("file_url")
    @Expose
    private String fileUrl;
    @SerializedName("attachment")
    @Expose
    private Object attachment;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("started_at")
    @Expose
    private String startedAt;
    @SerializedName("ended_at")
    @Expose
    private String endedAt;
    @SerializedName("parameters")
    @Expose
    private Parameters parameters;
    @SerializedName("progress")
    @Expose
    private Integer progress;
    @SerializedName("current_line")
    @Expose
    private Integer currentLine;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Object getAttachment() {
        return attachment;
    }

    public void setAttachment(Object attachment) {
        this.attachment = attachment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public String getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(String endedAt) {
        this.endedAt = endedAt;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public Integer getCurrentLine() {
        return currentLine;
    }

    public void setCurrentLine(Integer currentLine) {
        this.currentLine = currentLine;
    }


}
