package Controller.ContentSharesController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ContentShare {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("content_type")
    @Expose
    private String contentType;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("sender")
    @Expose
    private Sender sender;
    @SerializedName("receivers")
    @Expose
    private List<Receiver> receivers = null;
    @SerializedName("source_course")
    @Expose
    private SourceCourse sourceCourse;
    @SerializedName("read_state")
    @Expose
    private String readState;
    @SerializedName("content_export")
    @Expose
    private ContentExport contentExport;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public List<Receiver> getReceivers() {
        return receivers;
    }

    public void setReceivers(List<Receiver> receivers) {
        this.receivers = receivers;
    }

    public SourceCourse getSourceCourse() {
        return sourceCourse;
    }

    public void setSourceCourse(SourceCourse sourceCourse) {
        this.sourceCourse = sourceCourse;
    }

    public String getReadState() {
        return readState;
    }

    public void setReadState(String readState) {
        this.readState = readState;
    }

    public ContentExport getContentExport() {
        return contentExport;
    }

    public void setContentExport(ContentExport contentExport) {
        this.contentExport = contentExport;
    }

}
