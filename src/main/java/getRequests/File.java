package getRequests;

import Client.CanvasClient;
import net.bytebuddy.dynamic.scaffold.MethodGraph;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class File extends CanvasClient {

    private String courseId;
    private String groupId;
    private String userId;
    private String folderId;
    private String fileId;

    private String contentTypes;
    private String excludeContentTypes;
    private String searchTerm;
    private String include;
    private ArrayList<String> only;
    private String sort;
    private String order;
    private String submissionId;

    private String name;
    private String parentFolderId;
    private String parentFolderPath;
    private String sourceFileId;
    private String onDuplicate;
    private ZonedDateTime lockAt;
    private ZonedDateTime unlockAt;
    private Boolean locked;
    private Boolean hidden;
    private Boolean replace;

    private Integer position;

    private String fileIds;
    private String folderIds;
    private Boolean publish;
    private String usageRightsUseJustification;
    private String usageRightsLegalCopyright;
    private String usageRightsLicense;

    private Boolean force;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.contentTypes != null){
            queries.put("content_types[]",this.contentTypes);
        }
        if(this.excludeContentTypes != null){
            queries.put("exclude_content_types[]",this.excludeContentTypes);
        }
        if(this.searchTerm != null){
            queries.put("search_term",this.include);
        }
        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.only != null){
            queries.put("only[]",this.only);
        }
        if(this.sort != null){
            queries.put("sort",this.sort);
        }
        if(this.order != null){
            queries.put("order",this.order);
        }
        if(this.submissionId != null){
            queries.put("submission_id",this.submissionId);
        }
        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.name != null){
            queries.put("name",this.name);
        }
        if(this.parentFolderId != null){
            queries.put("parent_folder_id",this.parentFolderId);
        }
        if(this.onDuplicate != null){
            queries.put("on_duplicate",this.onDuplicate);
        }
        if(this.lockAt != null){
            queries.put("lock_at",this.lockAt);
        }
        if(this.unlockAt != null){
            queries.put("unlock_at",this.unlockAt);
        }
        if(this.locked != null){
            queries.put("locked",this.locked);
        }
        if(this.hidden != null){
            queries.put("hidden",this.hidden);
        }
        if(this.replace != null){
            queries.put("replace",this.replace);
        }
        if(this.name != null){
            queries.put("name",this.name);
        }
        if(this.parentFolderId != null){
            queries.put("parent_folder_id",this.parentFolderId);
        }
        if(this.position != null){
            queries.put("position",this.position);
        }
        if(this.force != null){
            queries.put("force",this.force);
        }
        if(this.fileIds != null){
            queries.put("file_ids[]",this.fileIds);
        }
        if(this.folderIds != null){
            queries.put("folder_ids[]",this.folderIds);
        }
        if(this.publish != null){
            queries.put("publish",this.publish);
        }
        if(this.usageRightsUseJustification != null){
            queries.put("usage_rights[use_justification]",this.usageRightsUseJustification);
        }
        if(this.usageRightsLegalCopyright != null){
            queries.put("usage_rights[legal_copyright]",this.usageRightsLegalCopyright);
        }
        if(this.usageRightsLicense != null){
            queries.put("usage_rights[license]",this.usageRightsLicense);
        }
        return queries;
    }


    public void clearQueries(){

        this.courseId = null;
        this.groupId = null;
        this.userId = null;
        this.folderId = null;
        this.fileId = null;

        this.contentTypes = null;
        this.excludeContentTypes = null;
        this.searchTerm = null;
        this.include = null;
        this.only = new ArrayList<String>();
        this.sort = null;
        this.order = null;
        this.submissionId = null;
        this.name = null;

        this.parentFolderId = null;
        this.parentFolderPath = null;
        this.sourceFileId = null;
        this.onDuplicate = null;
        this.lockAt = null;
        this.unlockAt = null;
        this.locked = null;
        this.hidden = null;
        this.replace = null;

        this.position = null;
        this.fileIds = null;
        this.folderIds = null;
        this.publish = null;
        this.usageRightsLegalCopyright = null;
        this.usageRightsUseJustification = null;
        this.usageRightsLicense = null;

    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getContentTypes() {
        return contentTypes;
    }

    public void setContentTypes(String contentTypes) {
        this.contentTypes = contentTypes;
    }

    public String getExcludeContentTypes() {
        return excludeContentTypes;
    }

    public void setExcludeContentTypes(String excludeContentTypes) {
        this.excludeContentTypes = excludeContentTypes;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public ArrayList<String> getOnly() {
        return only;
    }

    public void setOnly(ArrayList<String> only) {
        this.only = only;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentFolderId() {
        return parentFolderId;
    }

    public void setParentFolderId(String parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public String getParentFolderPath() {
        return parentFolderPath;
    }

    public void setParentFolderPath(String parentFolderPath) {
        this.parentFolderPath = parentFolderPath;
    }

    public String getSourceFileId() {
        return sourceFileId;
    }

    public void setSourceFileId(String sourceFileId) {
        this.sourceFileId = sourceFileId;
    }

    public String getOnDuplicate() {
        return onDuplicate;
    }

    public void setOnDuplicate(String onDuplicate) {
        this.onDuplicate = onDuplicate;
    }

    public ZonedDateTime getLockAt() {
        return lockAt;
    }

    public void setLockAt(ZonedDateTime lockAt) {
        this.lockAt = lockAt;
    }

    public ZonedDateTime getUnlockAt() {
        return unlockAt;
    }

    public void setUnlockAt(ZonedDateTime unlockAt) {
        this.unlockAt = unlockAt;
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getReplace() {
        return replace;
    }

    public void setReplace(Boolean replace) {
        this.replace = replace;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getFileIds() {
        return fileIds;
    }

    public void setFileIds(String fileIds) {
        this.fileIds = fileIds;
    }

    public String getFolderIds() {
        return folderIds;
    }

    public void setFolderIds(String folderIds) {
        this.folderIds = folderIds;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    public String getUsageRightsUseJustification() {
        return usageRightsUseJustification;
    }

    public void setUsageRightsUseJustification(String usageRightsUseJustification) {
        this.usageRightsUseJustification = usageRightsUseJustification;
    }

    public String getUsageRightsLegalCopyright() {
        return usageRightsLegalCopyright;
    }

    public void setUsageRightsLegalCopyright(String usageRightsLegalCopyright) {
        this.usageRightsLegalCopyright = usageRightsLegalCopyright;
    }

    public String getUsageRightsLicense() {
        return usageRightsLicense;
    }

    public void setUsageRightsLicense(String usageRightsLicense) {
        this.usageRightsLicense = usageRightsLicense;
    }

    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }
}
