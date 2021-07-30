package getRequests;

import Client.CanvasClient;

import java.util.LinkedHashMap;
import java.util.Map;

public class DiscussionTopic extends CanvasClient {

    private String courseId;
    private String include;
    private String orderBy;
    private String scope;
    private Boolean onlyAnnouncements;
    private String filterBy;
    private String searchTerm;
    private Boolean excludeContextModuleLockedTopics;

    public Map<String,Object> generateQueries(){

        Map<String,Object> queries = new LinkedHashMap<>();

        if(this.include != null){
            queries.put("include[]",this.include);
        }
        if(this.orderBy != null){
            queries.put("order_by",this.orderBy);
        }
        if(this.scope != null){
            queries.put("scope",this.scope);
        }
        if(this.onlyAnnouncements != null){
            queries.put("only_announcements",this.onlyAnnouncements);
        }
        if(this.filterBy != null){
            queries.put("filter_by",this.filterBy);
        }
        if(this.searchTerm != null){
            queries.put("search_term",this.searchTerm);
        }
        if(this.excludeContextModuleLockedTopics != null){
            queries.put("exclude_context_module_locked_topic",this.excludeContextModuleLockedTopics);
        }
        return queries;

    }

    public void clearQueries(){
        this.include = null;
        this.orderBy = null;
        this.scope = null;
        this.onlyAnnouncements = null;
        this.filterBy = null;
        this.searchTerm = null;
        this.excludeContextModuleLockedTopics = null;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getInclude() {
        return include;
    }

    public void setInclude(String include) {
        this.include = include;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Boolean getOnlyAnnouncements() {
        return onlyAnnouncements;
    }

    public void setOnlyAnnouncements(Boolean onlyAnnouncements) {
        this.onlyAnnouncements = onlyAnnouncements;
    }

    public String getFilterBy() {
        return filterBy;
    }

    public void setFilterBy(String filterBy) {
        this.filterBy = filterBy;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public Boolean getExcludeContextModuleLockedTopics() {
        return excludeContextModuleLockedTopics;
    }

    public void setExcludeContextModuleLockedTopics(Boolean excludeContextModuleLockedTopics) {
        this.excludeContextModuleLockedTopics = excludeContextModuleLockedTopics;
    }
}
