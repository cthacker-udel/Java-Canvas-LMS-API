package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class ContentMigration extends CanvasClient {

    private String accountId;
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

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.accountId != null){
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
        /*

        add rest of queries and clear queries method

         */

    }


}
