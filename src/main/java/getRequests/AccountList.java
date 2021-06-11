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

        return queries;


    }

    public void clearQueries(){

        this.include.clear();
        this.permissions.clear();
        this.with_enrollments = null;
        ArrayList<String> enrollmentType = new ArrayList<>();

        Boolean published= null;

        Boolean completed= null;

        Boolean blueprint= null;

        Boolean blueprintAssociated= null;

        ArrayList<Integer> byTeachers = new ArrayList<>();

        ArrayList<Integer> bySubaccounts = new ArrayList<>();

        Boolean hideEnrollmentsCourses= null;

        ArrayList<String> state = new ArrayList<>();

        Integer enrollmentTermId= null;

        String searchTerm= null;

        String sort= null;

        String order= null;

        String searchBy= null;

        ZonedDateTime startsBefore= null;

        ZonedDateTime endsAfter= null;


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
}
