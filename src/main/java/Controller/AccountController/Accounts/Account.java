package Controller.AccountController.Accounts;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("parent_account_id")
    @Expose
    private Integer parentAccountId;
    @SerializedName("root_account_id")
    @Expose
    private Integer rootAccountId;
    @SerializedName("default_storage_quota_mb")
    @Expose
    private Integer defaultStorageQuotaMb;
    @SerializedName("default_user_storage_quota_mb")
    @Expose
    private Integer defaultUserStorageQuotaMb;
    @SerializedName("default_group_storage_quota_mb")
    @Expose
    private Integer defaultGroupStorageQuotaMb;
    @SerializedName("default_time_zone")
    @Expose
    private String defaultTimeZone;
    @SerializedName("sis_account_id")
    @Expose
    private String sisAccountId;
    @SerializedName("integration_id")
    @Expose
    private String integrationId;
    @SerializedName("sis_import_id")
    @Expose
    private Integer sisImportId;
    @SerializedName("lti_guid")
    @Expose
    private String ltiGuid;
    @SerializedName("workflow_state")
    @Expose
    private String workflowState;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Integer getParentAccountId() {
        return parentAccountId;
    }

    public void setParentAccountId(Integer parentAccountId) {
        this.parentAccountId = parentAccountId;
    }

    public Integer getRootAccountId() {
        return rootAccountId;
    }

    public void setRootAccountId(Integer rootAccountId) {
        this.rootAccountId = rootAccountId;
    }

    public Integer getDefaultStorageQuotaMb() {
        return defaultStorageQuotaMb;
    }

    public void setDefaultStorageQuotaMb(Integer defaultStorageQuotaMb) {
        this.defaultStorageQuotaMb = defaultStorageQuotaMb;
    }

    public Integer getDefaultUserStorageQuotaMb() {
        return defaultUserStorageQuotaMb;
    }

    public void setDefaultUserStorageQuotaMb(Integer defaultUserStorageQuotaMb) {
        this.defaultUserStorageQuotaMb = defaultUserStorageQuotaMb;
    }

    public Integer getDefaultGroupStorageQuotaMb() {
        return defaultGroupStorageQuotaMb;
    }

    public void setDefaultGroupStorageQuotaMb(Integer defaultGroupStorageQuotaMb) {
        this.defaultGroupStorageQuotaMb = defaultGroupStorageQuotaMb;
    }

    public String getDefaultTimeZone() {
        return defaultTimeZone;
    }

    public void setDefaultTimeZone(String defaultTimeZone) {
        this.defaultTimeZone = defaultTimeZone;
    }

    public String getSisAccountId() {
        return sisAccountId;
    }

    public void setSisAccountId(String sisAccountId) {
        this.sisAccountId = sisAccountId;
    }

    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public Integer getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Integer sisImportId) {
        this.sisImportId = sisImportId;
    }

    public String getLtiGuid() {
        return ltiGuid;
    }

    public void setLtiGuid(String ltiGuid) {
        this.ltiGuid = ltiGuid;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

}
