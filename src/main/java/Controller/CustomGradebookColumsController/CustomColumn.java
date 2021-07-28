package Controller.CustomGradebookColumsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomColumn {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("teacher_notes")
    @Expose
    private Boolean teacherNotes;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("position")
    @Expose
    private Integer position;
    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("read_only")
    @Expose
    private Boolean readOnly;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getTeacherNotes() {
        return teacherNotes;
    }

    public void setTeacherNotes(Boolean teacherNotes) {
        this.teacherNotes = teacherNotes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }


}
