package Controller.ExternalToolsController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AccountNavigation {

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
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("selection_width")
    @Expose
    private Integer selectionWidth;
    @SerializedName("selection_height")
    @Expose
    private Integer selectionHeight;

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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getSelectionWidth() {
        return selectionWidth;
    }

    public void setSelectionWidth(Integer selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public Integer getSelectionHeight() {
        return selectionHeight;
    }

    public void setSelectionHeight(Integer selectionHeight) {
        this.selectionHeight = selectionHeight;
    }


}
