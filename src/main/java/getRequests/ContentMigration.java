package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContentMigration extends CanvasClient {

    private String migrationAccountId;
    private String contentMigrationId;
    private String courseId;
    private String groupid;
    private String userId;
    private String migrationIssuesId;
    private String workflowState;
    private String migrationType;
    private String preAttachmentName;
    private String preAttachment;
    private String settingsFileUrl;
    private String settingsContentExportId;
    private String sourceCourseId;
    private String folderId;
    private Boolean overwriteQuizzes;
    private Integer questionBankId;
    private String questionBankName;
    private Integer insertIntoModuleId;
    private String insertIntoModuleType;
    private Integer insertIntoModulePosition;
    private Integer moveToAssignmentGroupId;
    private Boolean shiftDates;
    private ZonedDateTime oldStartDate;
    private ZonedDateTime oldEndDate;
    private ZonedDateTime newStartDate;
    private ZonedDateTime newEndDate;
    private Integer daySubstitutions;
    private Boolean removeDates;
    private Boolean selectiveImport;
    private String select;
    private String type;
    private Integer daySubstitutionDay;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.workflowState != null){
            queries.put("workflow_state",this.workflowState);
        }
        if(this.migrationType != null){
            queries.put("migration_type",this.migrationType);
        }
        if(this.preAttachmentName != null){
            queries.put("pre_attachment[name]",this.preAttachmentName);
        }
        if(this.preAttachment != null){
            queries.put("pre_attachment[*]",this.preAttachment);
        }
        if(this.settingsFileUrl != null){
            queries.put("settings[file_url]",this.settingsFileUrl);
        }
        if(this.settingsContentExportId != null){
            queries.put("settings[content_export_id]",this.settingsContentExportId);
        }
        if(this.sourceCourseId != null){
            queries.put("settings[source_course_id]",this.sourceCourseId);
        }
        if(this.folderId != null){
            queries.put("settings[folder_id]",this.folderId);
        }
        if(this.overwriteQuizzes != null){
            queries.put("settings[overwrite_quizzes]",this.overwriteQuizzes);
        }
        if(this.questionBankId != null){
            queries.put("settings[question_bank_id]",this.questionBankId);
        }
        if(this.questionBankName != null){
            queries.put("settings[question_bank_name]",this.questionBankName);
        }
        if(this.insertIntoModuleId != null){
            queries.put("settings[insert_into_module_id]",this.insertIntoModuleId);
        }
        if(this.insertIntoModuleType != null){
            queries.put("settings[insert_into_module_type]",this.insertIntoModuleType);
        }
        if(this.insertIntoModulePosition != null){
            queries.put("settings[insert_into_module_position]",this.insertIntoModulePosition);
        }
        if(this.moveToAssignmentGroupId != null){
            queries.put("settings[move_to_assignment_group_id]",this.moveToAssignmentGroupId);
        }
        if(this.shiftDates != null){
            queries.put("date_shift_options[shift_dates]",this.shiftDates);
        }
        if(this.oldStartDate != null){
            queries.put("date_shift_options[old_start_date]",this.oldStartDate);
        }
        if(this.oldEndDate != null){
            queries.put("date_shift_options[old_end_date]",this.oldEndDate);
        }
        if(this.newStartDate != null){
            queries.put("date_shift_options[new_start_date]",this.newStartDate);
        }
        if(this.newEndDate != null){
            queries.put("date_shift_options[new_end_date]",this.newEndDate);
        }
        if(this.daySubstitutions != null){
            queries.put(String.format("day_shift_options[day_substitutions][%d]",this.daySubstitutionDay),this.daySubstitutions);
        }
        if(this.removeDates != null){
            queries.put("date_shift_options[remove_dates]",this.removeDates);
        }
        if(this.selectiveImport != null){
            queries.put("selective_import",this.selectiveImport);
        }
        if(this.select != null){
            queries.put("select",this.select);
        }
        return queries;
    }

    public void clearQueries(){

        this.migrationAccountId = null;
        this.contentMigrationId = null;
        this.courseId = null;
        this.groupid = null;
        this.userId = null;
        this.migrationIssuesId = null;
        this.workflowState = null;
        this.migrationType = null;
        this.preAttachmentName = null;
        this.preAttachment = null;
        this.settingsFileUrl = null;
        this.settingsContentExportId = null;
        this.sourceCourseId = null;
        this.folderId = null;
        this.overwriteQuizzes = null;
        this.questionBankName = null;
        this.questionBankId = null;
        this.insertIntoModuleId = null;
        this.insertIntoModuleType = null;
        this.insertIntoModulePosition = null;
        this.moveToAssignmentGroupId = null;
        this.shiftDates = null;
        this.oldStartDate = null;
        this.oldEndDate = null;
        this.newStartDate = null;
        this.newEndDate = null;
        this.daySubstitutions = null;
        this.removeDates = null;
        this.selectiveImport = null;
        this.select = null;
        this.type = null;
        this.daySubstitutionDay = null;

    }


    public String getMigrationAccountId() {
        return migrationAccountId;
    }

    public void setMigrationAccountId(String accountId) {
        this.migrationAccountId = accountId;
    }

    public String getContentMigrationId() {
        return contentMigrationId;
    }

    public void setContentMigrationId(String contentMigrationId) {
        this.contentMigrationId = contentMigrationId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMigrationIssuesId() {
        return migrationIssuesId;
    }

    public void setMigrationIssuesId(String migrationIssuesId) {
        this.migrationIssuesId = migrationIssuesId;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public String getMigrationType() {
        return migrationType;
    }

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    public String getPreAttachmentName() {
        return preAttachmentName;
    }

    public void setPreAttachmentName(String preAttachmentName) {
        this.preAttachmentName = preAttachmentName;
    }

    public String getPreAttachment() {
        return preAttachment;
    }

    public void setPreAttachment(String preAttachment) {
        this.preAttachment = preAttachment;
    }

    public String getSettingsFileUrl() {
        return settingsFileUrl;
    }

    public void setSettingsFileUrl(String settingsFileUrl) {
        this.settingsFileUrl = settingsFileUrl;
    }

    public String getSettingsContentExportId() {
        return settingsContentExportId;
    }

    public void setSettingsContentExportId(String settingsContentExportId) {
        this.settingsContentExportId = settingsContentExportId;
    }

    public String getSourceCourseId() {
        return sourceCourseId;
    }

    public void setSourceCourseId(String sourceCourseId) {
        this.sourceCourseId = sourceCourseId;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public Boolean getOverwriteQuizzes() {
        return overwriteQuizzes;
    }

    public void setOverwriteQuizzes(Boolean overwriteQuizzes) {
        this.overwriteQuizzes = overwriteQuizzes;
    }

    public Integer getQuestionBankId() {
        return questionBankId;
    }

    public void setQuestionBankId(Integer questionBankId) {
        this.questionBankId = questionBankId;
    }

    public String getQuestionBankName() {
        return questionBankName;
    }

    public void setQuestionBankName(String questionBankName) {
        this.questionBankName = questionBankName;
    }

    public Integer getInsertIntoModuleId() {
        return insertIntoModuleId;
    }

    public void setInsertIntoModuleId(Integer insertIntoModuleId) {
        this.insertIntoModuleId = insertIntoModuleId;
    }

    public String getInsertIntoModuleType() {
        return insertIntoModuleType;
    }

    public void setInsertIntoModuleType(String insertIntoModuleType) {
        this.insertIntoModuleType = insertIntoModuleType;
    }

    public Integer getInsertIntoModulePosition() {
        return insertIntoModulePosition;
    }

    public void setInsertIntoModulePosition(Integer insertIntoModulePosition) {
        this.insertIntoModulePosition = insertIntoModulePosition;
    }

    public Integer getMoveToAssignmentGroupId() {
        return moveToAssignmentGroupId;
    }

    public void setMoveToAssignmentGroupId(Integer moveToAssignmentGroupId) {
        this.moveToAssignmentGroupId = moveToAssignmentGroupId;
    }

    public Boolean getShiftDates() {
        return shiftDates;
    }

    public void setShiftDates(Boolean shiftDates) {
        this.shiftDates = shiftDates;
    }

    public ZonedDateTime getOldStartDate() {
        return oldStartDate;
    }

    public void setOldStartDate(ZonedDateTime oldStartDate) {
        this.oldStartDate = oldStartDate;
    }

    public ZonedDateTime getOldEndDate() {
        return oldEndDate;
    }

    public void setOldEndDate(ZonedDateTime oldEndDate) {
        this.oldEndDate = oldEndDate;
    }

    public ZonedDateTime getNewStartDate() {
        return newStartDate;
    }

    public void setNewStartDate(ZonedDateTime newStartDate) {
        this.newStartDate = newStartDate;
    }

    public ZonedDateTime getNewEndDate() {
        return newEndDate;
    }

    public void setNewEndDate(ZonedDateTime newEndDate) {
        this.newEndDate = newEndDate;
    }

    public Integer getDaySubstitutions() {
        return daySubstitutions;
    }

    public void setDaySubstitutions(Integer daySubstitutions) {
        this.daySubstitutions = daySubstitutions;
    }

    public Boolean getRemoveDates() {
        return removeDates;
    }

    public void setRemoveDates(Boolean removeDates) {
        this.removeDates = removeDates;
    }

    public Boolean getSelectiveImport() {
        return selectiveImport;
    }

    public void setSelectiveImport(Boolean selectiveImport) {
        this.selectiveImport = selectiveImport;
    }
}
