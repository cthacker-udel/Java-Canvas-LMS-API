package Controller.CourseController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HTML {

    @SerializedName("html")
    @Expose
    private String html;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

}
