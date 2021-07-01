package Controller.BlueprintCourseController.BlueprintSubscription;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BlueprintSubscription {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("template_id")
    @Expose
    private Integer templateId;
    @SerializedName("blueprint_course")
    @Expose
    private BlueprintCourse blueprintCourse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public BlueprintCourse getBlueprintCourse() {
        return blueprintCourse;
    }

    public void setBlueprintCourse(BlueprintCourse blueprintCourse) {
        this.blueprintCourse = blueprintCourse;
    }

}
