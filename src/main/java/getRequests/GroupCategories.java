package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class GroupCategories extends CanvasClient {

    private Integer accountId;
    private String courseId;
    private String groupCategoryId;

    private String name;
    private String selfSignup;
    private String autoLeader;
    private Integer groupLimit;
    private String sisGroupCategoryId;
    private Integer createGroupCount;
    private String splitGroupContent;
    private String attachment;
    private String searchTerm;
    private Boolean unassigned;
    private Boolean sync;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.name != null){
            queries.put("name",this.name);
        }
        if(this.selfSignup != null){
            queries.put("self_signup",this.selfSignup);
        }
        if(this.autoLeader != null){
            queries.put("auto_leader",this.autoLeader);
        }
        if(this.groupLimit != null){
            queries.put("group_limit",this.groupLimit);
        }
        if(this.sisGroupCategoryId != null){
            queries.put("sis_group_category_id",this.sisGroupCategoryId);
        }
        if(this.createGroupCount != null){
            queries.put("create_group_count",this.createGroupCount);
        }
        if(this.splitGroupContent != null){
            queries.put("split_group_count",this.splitGroupContent);
        }
        if(this.attachment != null){
            queries.put("attachment",this.attachment);
        }
        if(this.searchTerm != null){
            queries.put("search_term",this.searchTerm);
        }
        if(this.unassigned != null){
            queries.put("unassigned",this.unassigned);
        }
        if(this.sync != null){
            queries.put("sync",this.sync);
        }
        return queries;

    }

    public void clearQueries(){

        this.name = null;
        this.selfSignup = null;
        this.autoLeader = null;
        this.groupLimit = null;
        this.sisGroupCategoryId = null;
        this.createGroupCount = null;
        this.splitGroupContent = null;
        this.attachment = null;
        this.searchTerm = null;
        this.unassigned = null;
        this.sync = null;
        this.accountId = null;
        this.courseId = null;
        this.groupCategoryId = null;

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

    public String getGroupCategoryId() {
        return groupCategoryId;
    }

    public void setGroupCategoryId(String groupCategoryId) {
        this.groupCategoryId = groupCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelfSignup() {
        return selfSignup;
    }

    public void setSelfSignup(String selfSignup) {
        this.selfSignup = selfSignup;
    }

    public String getAutoLeader() {
        return autoLeader;
    }

    public void setAutoLeader(String autoLeader) {
        this.autoLeader = autoLeader;
    }

    public Integer getGroupLimit() {
        return groupLimit;
    }

    public void setGroupLimit(Integer groupLimit) {
        this.groupLimit = groupLimit;
    }

    public String getSisGroupCategoryId() {
        return sisGroupCategoryId;
    }

    public void setSisGroupCategoryId(String sisGroupCategoryId) {
        this.sisGroupCategoryId = sisGroupCategoryId;
    }

    public Integer getCreateGroupCount() {
        return createGroupCount;
    }

    public void setCreateGroupCount(Integer createGroupCount) {
        this.createGroupCount = createGroupCount;
    }

    public String getSplitGroupContent() {
        return splitGroupContent;
    }

    public void setSplitGroupContent(String splitGroupContent) {
        this.splitGroupContent = splitGroupContent;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Boolean getUnassigned() {
        return unassigned;
    }

    public void setUnassigned(Boolean unassigned) {
        this.unassigned = unassigned;
    }

    public Boolean getSync() {
        return sync;
    }

    public void setSync(Boolean sync) {
        this.sync = sync;
    }
}
