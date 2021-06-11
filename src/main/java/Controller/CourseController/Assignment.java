package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Assignment {

    @SerializedName("content")
    @Expose
    private Boolean content;
    @SerializedName("points")
    @Expose
    private Boolean points;

    public Boolean getContent() {
        return content;
    }

    public void setContent(Boolean content) {
        this.content = content;
    }

    public Boolean getPoints() {
        return points;
    }

    public void setPoints(Boolean points) {
        this.points = points;
    }

}
