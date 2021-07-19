package Controller.CourseAuditController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UpdatedEventData {

    @SerializedName("name")
    @Expose
    private List<String> name = null;
    @SerializedName("start_at")
    @Expose
    private List<String> startAt = null;
    @SerializedName("conclude_at")
    @Expose
    private List<String> concludeAt = null;
    @SerializedName("is_public")
    @Expose
    private List<Boolean> isPublic = null;

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<String> getStartAt() {
        return startAt;
    }

    public void setStartAt(List<String> startAt) {
        this.startAt = startAt;
    }

    public List<String> getConcludeAt() {
        return concludeAt;
    }

    public void setConcludeAt(List<String> concludeAt) {
        this.concludeAt = concludeAt;
    }

    public List<Boolean> getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(List<Boolean> isPublic) {
        this.isPublic = isPublic;
    }

}
