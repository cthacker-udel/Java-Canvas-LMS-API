package Controller.BookmarksController;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("active_tab")
    @Expose
    private Integer activeTab;

    public Integer getActiveTab() {
        return activeTab;
    }

    public void setActiveTab(Integer activeTab) {
        this.activeTab = activeTab;
    }


}
