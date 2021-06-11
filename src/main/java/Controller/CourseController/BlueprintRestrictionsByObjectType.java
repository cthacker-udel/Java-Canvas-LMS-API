package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlueprintRestrictionsByObjectType {

    @SerializedName("assignment")
    @Expose
    private Assignment assignment;
    @SerializedName("wiki_page")
    @Expose
    private WikiPage wikiPage;

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public WikiPage getWikiPage() {
        return wikiPage;
    }

    public void setWikiPage(WikiPage wikiPage) {
        this.wikiPage = wikiPage;
    }

}
