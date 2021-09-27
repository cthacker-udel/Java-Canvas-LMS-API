package Controller.GradingStandardController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GradingStandard {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("context_type")
    @Expose
    private String contextType;
    @SerializedName("context_id")
    @Expose
    private Integer contextId;
    @SerializedName("grading_scheme")
    @Expose
    private List<GradingSchemeEntry> gradingScheme = null;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContextType() {
        return contextType;
    }

    public void setContextType(String contextType) {
        this.contextType = contextType;
    }

    public Integer getContextId() {
        return contextId;
    }

    public void setContextId(Integer contextId) {
        this.contextId = contextId;
    }

    public List<GradingSchemeEntry> getGradingScheme() {
        return gradingScheme;
    }

    public void setGradingScheme(List<GradingSchemeEntry> gradingScheme) {
        this.gradingScheme = gradingScheme;
    }


}
