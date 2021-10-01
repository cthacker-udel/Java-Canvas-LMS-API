package Controller.GroupCategoriesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GroupCategory {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("self_signup")
    @Expose
    private Object selfSignup;
    @SerializedName("auto_leader")
    @Expose
    private Object autoLeader;
    @SerializedName("context_type")
    @Expose
    private String contextType;
    @SerializedName("account_id")
    @Expose
    private Integer accountId;
    @SerializedName("group_limit")
    @Expose
    private Object groupLimit;
    @SerializedName("sis_group_category_id")
    @Expose
    private Object sisGroupCategoryId;
    @SerializedName("sis_import_id")
    @Expose
    private Object sisImportId;
    @SerializedName("progress")
    @Expose
    private Object progress;

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Object getSelfSignup() {
        return selfSignup;
    }

    public void setSelfSignup(Object selfSignup) {
        this.selfSignup = selfSignup;
    }

    public Object getAutoLeader() {
        return autoLeader;
    }

    public void setAutoLeader(Object autoLeader) {
        this.autoLeader = autoLeader;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Object getGroupLimit() {
        return groupLimit;
    }

    public void setGroupLimit(Object groupLimit) {
        this.groupLimit = groupLimit;
    }

    public Object getSisGroupCategoryId() {
        return sisGroupCategoryId;
    }

    public void setSisGroupCategoryId(Object sisGroupCategoryId) {
        this.sisGroupCategoryId = sisGroupCategoryId;
    }

    public Object getSisImportId() {
        return sisImportId;
    }

    public void setSisImportId(Object sisImportId) {
        this.sisImportId = sisImportId;
    }

    public Object getProgress() {
        return progress;
    }

    public void setProgress(Object progress) {
        this.progress = progress;
    }

}
