package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class ContentExport extends CanvasClient {

    private String exportType;
    private Boolean skipNotifications;
    private String hash;
    private String userId;
    private String groupId;
    private String courseId;
    private String contentExportId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.exportType != null){
            queries.put("export_type",this.exportType);
        }
        if(this.skipNotifications != null){
            queries.put("skip_notifications",this.skipNotifications);
        }
        if(this.hash != null){
            queries.put("select",this.hash);
        }
        return queries;

    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getContentExportId() {
        return contentExportId;
    }

    public void setContentExportId(String contentExportId) {
        this.contentExportId = contentExportId;
    }

    public void clearQueries(){
        this.exportType = null;
        this.skipNotifications = null;
        this.hash = null;
    }

    public String getExportType() {
        return exportType;
    }

    public void setExportType(String exportType) {
        this.exportType = exportType;
    }

    public Boolean getSkipNotifications() {
        return skipNotifications;
    }

    public void setSkipNotifications(Boolean skipNotifications) {
        this.skipNotifications = skipNotifications;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
