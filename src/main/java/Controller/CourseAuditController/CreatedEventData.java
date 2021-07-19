package Controller.CourseAuditController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CreatedEventData {

    @SerializedName("name")
    @Expose
    private List<Object> name = null;
    @SerializedName("start_at")
    @Expose
    private List<Object> startAt = null;
    @SerializedName("conclude_at")
    @Expose
    private List<Object> concludeAt = null;
    @SerializedName("is_public")
    @Expose
    private List<Object> isPublic = null;
    @SerializedName("created_source")
    @Expose
    private String createdSource;

    public List<Object> getName() {
        return name;
    }

    public void setName(List<Object> name) {
        this.name = name;
    }

    public List<Object> getStartAt() {
        return startAt;
    }

    public void setStartAt(List<Object> startAt) {
        this.startAt = startAt;
    }

    public List<Object> getConcludeAt() {
        return concludeAt;
    }

    public void setConcludeAt(List<Object> concludeAt) {
        this.concludeAt = concludeAt;
    }

    public List<Object> getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(List<Object> isPublic) {
        this.isPublic = isPublic;
    }

    public String getCreatedSource() {
        return createdSource;
    }

    public void setCreatedSource(String createdSource) {
        this.createdSource = createdSource;
    }


}
