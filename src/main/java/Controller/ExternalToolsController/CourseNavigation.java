package Controller.ExternalToolsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CourseNavigation {

    @SerializedName("canvas_icon_class")
    @Expose
    private String canvasIconClass;
    @SerializedName("icon_url")
    @Expose
    private String iconUrl;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("default")
    @Expose
    private String _default;
    @SerializedName("enabled")
    @Expose
    private String enabled;
    @SerializedName("visibility")
    @Expose
    private String visibility;
    @SerializedName("windowTarget")
    @Expose
    private String windowTarget;

    public String getCanvasIconClass() {
        return canvasIconClass;
    }

    public void setCanvasIconClass(String canvasIconClass) {
        this.canvasIconClass = canvasIconClass;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDefault() {
        return _default;
    }

    public void setDefault(String _default) {
        this._default = _default;
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getWindowTarget() {
        return windowTarget;
    }

    public void setWindowTarget(String windowTarget) {
        this.windowTarget = windowTarget;
    }


}
