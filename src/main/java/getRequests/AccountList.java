package getRequests;

import Client.CanvasClient;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class AccountList extends CanvasClient {

    private ArrayList<String> include = new ArrayList<>();

    private ArrayList<String> permissions = new ArrayList<>();

    private Boolean recursive;

    private String accountListId;

    private Boolean with_enrollments;

    private ArrayList<String> enrollmentType = new ArrayList<>();

    private Boolean published;

    private Boolean completed;

    private Boolean blueprint;

    private Boolean blueprintAssociated;

    private ArrayList<Integer> byTeachers = new ArrayList<>();

    private ArrayList<Integer> bySubaccounts = new ArrayList<>();

    private Boolean hideEnrollmentsCourses;

    private ArrayList<String> state = new ArrayList<>();

    private Integer enrollmentTermId;

    private String searchTerm;

    private String sort;

    private String order;

    private String searchBy;

    private ZonedDateTime startsBefore;

    private ZonedDateTime endsAfter;

    private String accountName;

    private String accountSisId;

    private String defaultTimeZone;

    private Integer accountDefaultStorageQuota;

    private Integer defaultUserStorageQuota;

    private Integer defaultGroupStorageQuota;

    private Integer courseTemplateId;

    private Boolean restrictStudentPastViewValue;

    private Boolean restrictStudentPastViewLocked;

    private Boolean restrictStudentFutureViewValue;

    private Boolean accountMicrosoftSyncEnabled;

    private String miscrosoftSyncTenant;

    private String microsoftSyncLoginAttribute;

    private Boolean restrictStudentFutureView;

    private Boolean lockAllAnnouncementsValue;

    private Boolean lockAllAnnouncementsLocked;

    private Boolean usageRightsRequiredValue;

    private Boolean usageRightsRequiredLocked;

    private Boolean restrictStudentFutureListingValue;

    private Boolean restrictStudentFutureListingLocked;

    private Boolean lockOutcomeProficiencyValue;

    private Boolean lockOutcomeProficiencyLocked;

    private Boolean lockProficiencyCalculationValue;

    private Boolean lockProficiencyCalculationLocked;

    private String accountServices;

    private String subAccountId;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.include.size() > 0){
            queries.put("include[]",this.include.toArray(String[]::new));
        }
        if(this.permissions.size() > 0){
            queries.put("permissions[]",this.permissions.toArray(String[]::new));
        }
        if(this.recursive != null){
            queries.put("recursive",this.recursive);
        }
        if(this.enrollmentType.size() > 0){
            queries.put("enrollment_type[]",this.enrollmentType.toArray(String[]::new));
        }
        if(this.published != null){
            queries.put("published",this.published);
        }
        if(this.completed != null){
            queries.put("completed",this.completed);
        }
        if(this.blueprint != null){
            queries.put("blueprint",this.blueprint);
        }
        if(this.blueprintAssociated != null){
            queries.put("blueprint_associated",this.blueprintAssociated);
        }
        if(this.byTeachers.size() > 0){
            queries.put("by_teachers[]",this.byTeachers.toArray(String[]::new));
        }
        if(this.bySubaccounts.size() > 0){
            queries.put("by_subaccounts[]",this.bySubaccounts.toArray(String[]::new));
        }
        if(this.hideEnrollmentsCourses != null){
            queries.put("hide_enrollment_courses",this.hideEnrollmentsCourses);
        }
        if(this.state.size() > 0){
            queries.put("state[]",this.state.toArray(String[]::new));
        }
        if(this.enrollmentTermId != null){
            queries.put("enrollment_term_id",this.enrollmentTermId);
        }
        if(this.searchTerm != null){
            queries.put("search_term",this.searchTerm);
        }
        if(this.sort != null){
            queries.put("sort",this.sort);
        }
        if(this.order != null){
            queries.put("order",this.order);
        }
        if(this.searchBy != null){
            queries.put("search_by",this.searchBy);
        }
        if(this.startsBefore != null){
            queries.put("starts_before",this.startsBefore);
        }
        if(this.endsAfter != null){
            queries.put("ends_after",this.endsAfter);
        }
        if(this.accountName != null){
            queries.put("account[name]",this.accountName);
        }
        if(this.accountSisId != null){
            queries.put("account[sis_account_id]",this.accountSisId);
        }
        if(this.defaultTimeZone != null){
            queries.put("account[default_time_zone]",this.defaultTimeZone);
        }
        if(this.accountDefaultStorageQuota != null){
            queries.put("account[default_user_storage_quota_mb]",this.accountDefaultStorageQuota);
        }
        if(this.defaultGroupStorageQuota != null){
            queries.put("account[default_group_storage_quota_mb]",this.defaultGroupStorageQuota);
        }
        if(this.courseTemplateId != null){
            queries.put("account[course_template_id]",this.courseTemplateId);
        }
        if(this.restrictStudentPastViewValue != null){
            queries.put("account[settings][restrict_student_past_view][value]",this.restrictStudentPastViewValue);
        }
        if(this.restrictStudentPastViewLocked != null){
            queries.put("account[settings][restrict_student_past_view][locked]",this.restrictStudentPastViewLocked);
        }
        if(this.restrictStudentFutureListingValue != null){
            queries.put("account[settings][restrict_student_future_view][value]",this.restrictStudentFutureViewValue);
        }
        if(this.accountMicrosoftSyncEnabled != null){
            queries.put("account[settings][microsoft_sync_enabled]",this.accountMicrosoftSyncEnabled);
        }
        if(this.miscrosoftSyncTenant != null){
            queries.put("account[settings][microsoft_sync_tenant]",this.miscrosoftSyncTenant);
        }
        if(this.microsoftSyncLoginAttribute != null){
            queries.put("account[settings][microsoft_sync_login_attribute]",this.microsoftSyncLoginAttribute);
        }
        if(this.lockAllAnnouncementsValue != null){
            queries.put("account[settings][lock_all_announcements][value]",this.lockAllAnnouncementsValue);
        }
        if(this.lockAllAnnouncementsLocked != null){
            queries.put("account[settings][lock_all_announcements][locked]",this.lockAllAnnouncementsLocked);
        }
        if(this.usageRightsRequiredValue != null){
            queries.put("account[settings][usage_rights_required][value]",this.usageRightsRequiredValue);
        }
        if(this.usageRightsRequiredLocked != null){
            queries.put("account[settings][usage_rights_required][locked]",this.usageRightsRequiredLocked);
        }
        if(this.restrictStudentFutureListingValue != null){
            queries.put("account[settings][restrict_student_future_listing][value]",this.restrictStudentFutureListingValue);
        }
        if(this.restrictStudentFutureListingLocked != null){
            queries.put("account[settings][restrict_student_future_listing][locked]",this.restrictStudentFutureListingLocked);
        }
        if(this.lockOutcomeProficiencyValue != null){
            queries.put("account[settings][lock_outcome_proficiency][value]",this.lockOutcomeProficiencyValue);
        }
        if(this.lockOutcomeProficiencyLocked != null){
            queries.put("account[lock_outcome_proficiency][locked]",this.lockOutcomeProficiencyLocked);
        }
        if(this.lockProficiencyCalculationValue != null){
            queries.put("account[settings][lock_proficiency_calculation][value]",this.lockProficiencyCalculationValue);
        }
        if(this.lockProficiencyCalculationLocked != null){
            queries.put("account[lock_proficiency_calculation][locked]",this.lockOutcomeProficiencyLocked);
        }
        if(this.accountServices != null){
            queries.put("account[services]",this.accountServices);
        }
        return queries;
    }

    public void clearQueries(){

        this.include.clear();
        this.permissions.clear();
        this.with_enrollments = null;
        ArrayList<String> enrollmentType = new ArrayList<>();

        published= null;

        completed= null;

        blueprint= null;

        blueprintAssociated= null;

        byTeachers = new ArrayList<>();

        bySubaccounts = new ArrayList<>();

        hideEnrollmentsCourses= null;

        state = new ArrayList<>();

        enrollmentTermId= null;

        searchTerm= null;

        sort= null;

        order= null;

        searchBy= null;

        startsBefore= null;

        endsAfter= null;

        this.accountName = null;

        this.accountSisId = null;

        this.defaultTimeZone = null;

        this.defaultGroupStorageQuota = null;

        this.defaultUserStorageQuota = null;

        this.defaultGroupStorageQuota = null;

        this.courseTemplateId = null;

        this.restrictStudentPastViewValue = null;

        this.restrictStudentPastViewLocked = null;

        this.restrictStudentFutureViewValue = null;

        this.restrictStudentFutureView = null;

        this.miscrosoftSyncTenant = null;

        this.microsoftSyncLoginAttribute = null;

        this.lockAllAnnouncementsValue = null;

        this.lockAllAnnouncementsLocked = null;

        this.usageRightsRequiredValue = null;

        this.usageRightsRequiredLocked = null;

        this.restrictStudentFutureListingValue = null;

        this.restrictStudentFutureListingLocked = null;

        this.lockOutcomeProficiencyValue = null;

        this.lockOutcomeProficiencyLocked = null;

        this.lockProficiencyCalculationValue = null;

        this.lockProficiencyCalculationLocked = null;

        this.accountServices = null;

    }

    public Boolean getRecursive() {
        return recursive;
    }

    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    public ArrayList<String> getPermissions() {
        return permissions;
    }

    public void setPermissions(ArrayList<String> permissions) {
        this.permissions = permissions;
    }

    public ArrayList<String> getInclude() {
        return include;
    }

    public void setInclude(ArrayList<String> include) {
        this.include = include;
    }

    public String getAccountListId() {
        return accountListId;
    }

    public void setAccountListId(String accountListId) {
        this.accountListId = accountListId;
    }

    public String getSubAccountId(){
        return this.subAccountId;
    }

    public void setSubAccountId(String newSubAccountId){
        this.subAccountId = newSubAccountId;
    }
}
